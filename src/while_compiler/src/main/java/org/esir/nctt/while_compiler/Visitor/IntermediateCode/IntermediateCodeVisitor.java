package org.esir.nctt.while_compiler.Visitor.IntermediateCode;

import org.antlr.runtime.tree.Tree;
import org.esir.nctt.while_compiler.LibraryFunctions;
import org.esir.nctt.while_compiler.Visitor.Visitor;

import java.util.HashMap;

public class IntermediateCodeVisitor extends Visitor {
    HashMap<String, IntermediateFunction> functions = new HashMap<>();
    IntermediateFunction functionActual;

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

        for (int i = functionActual.getOutputs() - 1; i > 0; i--) { // strict à 0 normal
            String child = functionActual.getOutput(i);
            String parent = functionActual.getOutput(i - 1);
            functionActual.createSetHead(parent, parent);
            functionActual.createSetTail(parent, child);
        }
        System.out.println(functionActual);
    }

    @Override
    protected void visit_assignement(Tree tree) {
        // seems ok

        Tree expressions = tree.getChild(1);
        Tree variables = tree.getChild(0);

        for (int i = 0; i < expressions.getChildCount(); i++) {
            int size = functionActual.instructionsCount();
            visit_expression(expressions.getChild(i));
            String label = variables.getChild(i).getText();
            functionActual.createMov(label, functionActual.registerFromAddress(size));
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
        String register = functionActual.createDefine();

        int address = functionActual.instructionsCount();
        visit_expressions(tree.getChild(0));

        functionActual.createSetHead(register, functionActual.registerFromAddress(address));
        functionActual.createSetTail(register, functionActual.registerFromAddress(address + 1));
    }

    @Override
    protected void visit_expr_variable(Tree tree) {
        // seems ok
        String label = tree.getChild(0).getText();

        String register = functionActual.createDefine();
        functionActual.createMov(register, label);
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

        for (int i = 0; i < parameters.getChildCount(); i++) {
            int addressOfParam = functionActual.instructionsCount();
            visit_expression(parameters.getChild(i));
            addresses[i] = addressOfParam;
        }

        functionActual.createCall(functions.get(label), addresses);
    }

    @Override
    protected void visit_expr_compare(Tree tree) {
        // seems ok

        int i1 = functionActual.instructionsCount();
        visit_expression(tree.getChild(0));
        int i2 = functionActual.instructionsCount();
        visit_expression(tree.getChild(1));

        functionActual.createCall(functions.get("compare"), new int[]{i1, i2});
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
        int gotoElseAddress = functionActual.createGoto(null);
        functionActual.createOpenContext();

        visit_commands(tree.getChild(1));
        int gotoEndifAddress = functionActual.createGoto(null);
        functionActual.createCloseContext();
        functionActual.createOpenContext();

        if (tree.getChildCount() > 2) {
            String elseAd = functionActual.createLabel();
            functionActual.getInstruction(gotoElseAddress).setArg1(elseAd);
            visit_commands(tree.getChild(2));
        }
        functionActual.createCloseContext();
        String endifAd = functionActual.createLabel();
        functionActual.getInstruction(gotoEndifAddress).setArg1(endifAd);
    }

    @Override
    protected void visit_foreach(Tree tree) {
        // todo


        Tree item = tree.getChild(0);
        Tree liste = tree.getChild(1);
        Tree commands = tree.getChild(2);

        int listeAddress = functionActual.instructionsCount();
        String listeRegister = functionActual.registerFromAddress(listeAddress);
        visit_expression(liste);

        int nilAddress = functionActual.instructionsCount();
        String nilRegister = functionActual.createDefine();

        int itemAddress = functionActual.instructionsCount();
        String itemRegister = functionActual.createDefine();

        // compare liste et nil
        String compareCall = functionActual.createLabel();
        int retour = functionActual.createCall(functions.get("compare"), new int[]{listeAddress, nilAddress});

        functionActual.createIf(functionActual.registerFromAddress(retour));
        int gotoEndForGotoAddress = functionActual.createGoto(null);
        functionActual.createOpenContext();

        functionActual.createGetHead(listeRegister, itemRegister);

        visit_commands(commands);

        functionActual.createGetTail(listeRegister, listeRegister);

        int gotoStartWhileGotoAddress = functionActual.createGoto(null);
        functionActual.getInstruction(gotoStartWhileGotoAddress).setArg1(compareCall);

        functionActual.createCloseContext();
        String endifAd = functionActual.createLabel();
        functionActual.getInstruction(gotoEndForGotoAddress).setArg1(endifAd);
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
        int gotoEndWhileGotoAddress = functionActual.createGoto(null);
        functionActual.createOpenContext();
        visit_commands(commands);

        int gotoStartWhileGotoAddress = functionActual.createGoto(null);
        functionActual.getInstruction(gotoStartWhileGotoAddress).setArg1(labelIf);
        functionActual.createCloseContext();
        String endifAd = functionActual.createLabel();
        functionActual.getInstruction(gotoEndWhileGotoAddress).setArg1(endifAd);
    }

    @Override
    protected void visit_for(Tree tree) {
        // to be tested
        Tree value = tree.getChild(0);
        Tree commands = tree.getChild(1);

        int valueAddress = functionActual.instructionsCount();
        visit_expression(value);

        int counterAddress = functionActual.instructionsCount();
        String counterRegister = functionActual.createDefine();

        String compareCall = functionActual.createLabel();
        int retour = functionActual.createCall(functions.get("compare"), new int[]{valueAddress, counterAddress});

        functionActual.createIf(functionActual.registerFromAddress(retour));
        int gotoEndForGotoAddress = functionActual.createGoto(null);
        functionActual.createOpenContext();

        visit_commands(commands);

        functionActual.createInc(counterRegister, 1);

        int gotoStartWhileGotoAddress = functionActual.createGoto(null);
        functionActual.getInstruction(gotoStartWhileGotoAddress).setArg1(compareCall);

        functionActual.createCloseContext();
        String endifAd = functionActual.createLabel();
        functionActual.getInstruction(gotoEndForGotoAddress).setArg1(endifAd);
    }

    @Override
    protected void visit_variables(Tree tree) {
        // I think we do not need, except refactor
    }


}
