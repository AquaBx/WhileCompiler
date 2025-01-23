package org.esir.nctt.while_compiler.Visitor.IntermediateCode;

import org.antlr.runtime.tree.Tree;
import org.esir.nctt.antlr.WhileGrammarLexer;
import org.esir.nctt.while_compiler.LibraryFunctions;
import org.esir.nctt.while_compiler.Visitor.Visitor;

import java.util.HashMap;

public class IntermediateCodeVisitor extends Visitor {
    HashMap<String, IntermediateFunction> functions = new HashMap<>();
    IntermediateFunction functionActual;

    public String toString() {
        StringBuilder out = new StringBuilder();

        for (IntermediateFunction fun : functions.values()) {
            if (!fun.isSTD()) {
                out.append(String.format("%s\n", fun.toString()));
            }
        }

        return out.toString();
    }

    public String toCpp() {
        StringBuilder out = new StringBuilder();

        for (IntermediateFunction fun : functions.values()) {
            if (!fun.isSTD()) {
                out.append(String.format("%s;\n", fun.toCppSignature()));
            }
        }

        for (IntermediateFunction fun : functions.values()) {
            if (!fun.isSTD()) {
                out.append(fun.toCpp());
            }
        }

        return out.toString();
    }

    // Visitor

    @Override
    public void visit_program(Tree program) {

        LibraryFunctions.addTo(functions, IntermediateFunction::new);

        for (int i = 0; i < program.getChildCount(); i++) {
            Tree function = program.getChild(i);
            int input = function.getChild(1).getChildCount();
            int output = function.getChild(2).getChildCount();
            String function_name = function.getChild(0).getText();
            functions.put(function_name, new IntermediateFunction(function_name, input, output));
        }

        for (int i = 0; i < program.getChildCount(); i++) {
            visit_function(program.getChild(i));
        }
    }

    @Override
    protected void visit_function(Tree tree) {

        String functionLabel = tree.getChild(0).getText();
        functionActual = functions.get(functionLabel);

        visit_inputs(tree.getChild(1));
        visit_outputs(tree.getChild(2));
        visit_commands(tree.getChild(3));

        String retours = functionActual.createDefine();

        functionActual.createSetHead(retours, functionActual.getOutput(0));
        for (int i = 1; i < functionActual.getOutputs(); i++) { // strict à 0 normal
            functionActual.createSetTail(retours, retours);
            functionActual.createSetHead(retours, functionActual.getOutput(i));
        }

        functionActual.createMov(functionActual.getOutput(0), retours);
    }

    @Override
    protected void visit_assignement(Tree tree) {
        // seems ok

        Tree expressions = tree.getChild(1);
        Tree variables = tree.getChild(0);

        int variablesI = 0;

        for (int i = 0; i < expressions.getChildCount(); i++) {
            // todo problème si plusieurs assignations à gauche et une seule à droite (exemple fonction)
            int size = functionActual.instructionsCount();
            Tree expr = expressions.getChild(i);
            visit_expression(expr);
            int retours = expr.getType() == WhileGrammarLexer.EXPR_CALL ? functions.get(expr.getChild(0).getText()).getOutputs() : 1;
            for (int j = 0; j < retours; j++) {
                String label = variables.getChild(variablesI).getText();
                functionActual.createMov(label, functionActual.registerFromAddress(size + j));
                variablesI += 1;
            }
        }
    }

    @Override
    protected void visit_inputs(Tree tree) {
        // seems ok
        for (int i = 0; i < tree.getChildCount(); i++) {
            String label = tree.getChild(i).getText();
            functionActual.addInput(label);
        }
    }

    protected void visit_outputs(Tree tree) {
        // seems ok
        for (int i = tree.getChildCount() - 1; i >= 0; i--) {
            String label = tree.getChild(i).getText();
            functionActual.createDefine(label);
            functionActual.addOutput(label);
        }
    }

    @Override
    protected void visit_expr_nil(Tree tree) {
        // seems ok
        functionActual.createDefine();
    }

    @Override
    protected void visit_expr_constructor_cons(Tree tree) {
        // seems ok
        Tree parameters = tree.getChild(0);

        switch (parameters.getChildCount()) {
            case 2: {
                String register = functionActual.createDefine();
                int addressOfHead = functionActual.instructionsCount();
                visit_expression(parameters.getChild(0));
                functionActual.createSetHead(register, functionActual.registerFromAddress(addressOfHead));

                int addressOfTail = functionActual.instructionsCount();
                visit_expression(parameters.getChild(1));
                functionActual.createSetTail(register, functionActual.registerFromAddress(addressOfTail));
                break;
            }
            case 1: {
                visit_expression(parameters.getChild(0));
                break;
            }
            case 0: {
                functionActual.createDefine();
                break;
            }
            default: {
                String ListR = functionActual.createDefine();

                for (int i = parameters.getChildCount() - 2; i >= 0; i--) {
                    if (i == parameters.getChildCount() - 2) {
                        int addressOfParam2 = functionActual.instructionsCount();
                        visit_expression(parameters.getChild(i + 1));
                        functionActual.createSetTail(ListR, functionActual.registerFromAddress(addressOfParam2));
                    } else {
                        functionActual.createSetTail(ListR, ListR);
                    }
                    int addressOfParam = functionActual.instructionsCount();
                    visit_expression(parameters.getChild(i));
                    functionActual.createSetHead(ListR, functionActual.registerFromAddress(addressOfParam));
                }
            }
        }

    }

    @Override
    protected void visit_expr_variable(Tree tree) {
        // seems ok
        String label = tree.getChild(0).getText();
        functionActual.setRef(label);
    }

    @Override
    protected void visit_nop(Tree tree) {
        // seems ok
    }

    @Override
    protected void visit_expr_call(Tree tree) {
        // seems ok

        String label = tree.getChild(0).getText();
        Tree parameters = tree.getChild(1);

        int[] addresses = new int[parameters.getChildCount()];
        int[] retAddresses = new int[functions.get(label).getOutputs()];

        // création registres de retour
        for (int i = 0; i < functions.get(label).getOutputs(); i++) {
            int addressOfParam = functionActual.instructionsCount();
            functionActual.createDefine();
            retAddresses[i] = addressOfParam;
        }

        for (int i = 0; i < parameters.getChildCount(); i++) {
            int addressOfParam = functionActual.instructionsCount();
            visit_expression(parameters.getChild(i));
            addresses[i] = addressOfParam;
        }

        functionActual.createCall(functions.get(label), retAddresses, addresses);
    }

    @Override
    protected void visit_expr_compare(Tree tree) {
        // seems ok

        int retour = functionActual.instructionsCount();
        functionActual.createDefine();


        int i1 = functionActual.instructionsCount();
        visit_expression(tree.getChild(0));
        int i2 = functionActual.instructionsCount();
        visit_expression(tree.getChild(1));

        functionActual.createCall(functions.get("compare"), new int[]{retour}, new int[]{i1, i2});
    }

    @Override
    protected void visit_expr_constructor_list(Tree tree) {
        // seems ok
        Tree parameters = tree.getChild(0);
        String ListR = functionActual.createDefine();

        for (int i = parameters.getChildCount() - 1; i >= 0; i--) {
            int addressOfParam = functionActual.instructionsCount();
            visit_expression(parameters.getChild(i));

            functionActual.createSetTail(ListR, ListR);
            functionActual.createSetHead(ListR, functionActual.registerFromAddress(addressOfParam));
        }
    }

    @Override
    protected void visit_expr_symbol(Tree tree) {
        // to be verified
        String value = tree.getChild(0).getText();
        functionActual.createSymbol(value);
    }

    @Override
    protected void visit_if(Tree tree) {
        // seems ok
        Tree expression = tree.getChild(0);
        int expressionAddress = functionActual.instructionsCount();
        visit_expression(expression);

        functionActual.createIf(functionActual.registerFromAddress(expressionAddress));
        functionActual.createOpenContext();
        visit_commands(tree.getChild(1));
        int gotoEndifAddress = functionActual.createGoto(null);
        functionActual.createCloseContext();

        if (tree.getChildCount() > 2) {
            functionActual.createOpenContext();
            visit_commands(tree.getChild(2));
            functionActual.createCloseContext();
        }
        String endifReg = functionActual.createLabel();
        functionActual.getInstruction(gotoEndifAddress).setArg1(endifReg);
    }

    @Override
    protected void visit_foreach(Tree tree) {
        // todo

        Tree item = tree.getChild(0);
        Tree liste = tree.getChild(1);
        Tree commands = tree.getChild(2);

        int listeAddress = functionActual.instructionsCount();
        visit_expression(liste);
        String listeRegister = functionActual.registerFromAddress(listeAddress);

        String itemRegister = functionActual.createDefine(item.getText());

        String foreach = functionActual.createLabel();

        functionActual.createIf(listeRegister);
        functionActual.createOpenContext();

        functionActual.createGetHead(listeRegister, itemRegister);

        visit_commands(commands);

        functionActual.createGetTail(listeRegister, listeRegister);

        functionActual.createGoto(foreach);

        functionActual.createCloseContext();
    }

    @Override
    protected void visit_while(Tree tree) {
        // to be tested
        Tree expression = tree.getChild(0);
        Tree commands = tree.getChild(1);

        int expressionAddress = functionActual.instructionsCount();
        visit_expression(expression);

        String labelIf = functionActual.createLabel();
        functionActual.createIf(functionActual.registerFromAddress(expressionAddress));
        functionActual.createOpenContext();
        visit_commands(commands);

        functionActual.createGoto(labelIf);
        functionActual.createCloseContext();
    }

    @Override
    protected void visit_for(Tree tree) {
        // to be tested
        Tree value = tree.getChild(0);
        Tree commands = tree.getChild(1);

        int valueAddress = functionActual.instructionsCount();
        visit_expression(value);

        String counterRegister = functionActual.createDefine();

        functionActual.createMov(counterRegister, functionActual.registerFromAddress(valueAddress));

        String loop = functionActual.createLabel();
        functionActual.createIf(counterRegister);
        functionActual.createOpenContext();

        visit_commands(commands);

        functionActual.createDec(counterRegister, 1);

        functionActual.createGoto(loop);
        functionActual.createCloseContext();
    }

    @Override
    protected void visit_variables(Tree tree) {
        // I think we do not need, except refactor
    }

    @Override
    protected void visit_expr_tail(Tree tree) {
        String reg = functionActual.createDefine();
        int ad = functionActual.instructionsCount();
        visit_expression(tree.getChild(0));
        functionActual.createGetTail(functionActual.registerFromAddress(ad), reg);
    }

    @Override
    protected void visit_expr_head(Tree tree) {
        String reg = functionActual.createDefine();
        int ad = functionActual.instructionsCount();
        visit_expression(tree.getChild(0));
        functionActual.createGetHead(functionActual.registerFromAddress(ad), reg);
    }


}
