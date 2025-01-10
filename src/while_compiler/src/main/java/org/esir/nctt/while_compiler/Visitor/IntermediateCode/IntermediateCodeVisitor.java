package org.esir.nctt.while_compiler.Visitor.IntermediateCode;

import org.antlr.runtime.tree.Tree;
import org.esir.nctt.while_compiler.Visitor.Visitor;

import java.util.HashMap;

public class IntermediateCodeVisitor extends Visitor {
    HashMap<String, IntermediateFunction> functions = new HashMap<>();
    IntermediateFunction functionActual;

    /*
    Crée un appel vers une fonction
    Initialise tous les push à effectuer
     */
    protected int createCall(String label, Tree parameters) {
        for (int i = parameters.getChildCount() - 1; i >= 0; i--) {
            int size = functionActual.instructionsCount();
            visit_expression(parameters.getChild(i));
            functionActual.createPush(size);
        }
        functionActual.createCall(label, parameters.getChildCount());
        return functionActual.instructionsCount() - 1;
    }

    /*
    Crée un appel vers une fonction
    Initialise tous les push à effectuer
     */
    protected int createCall(String label, int[] addresses) {
        for (int i = addresses.length - 1; i >= 0; i--) {
            functionActual.createPush(addresses[i]);
        }
        functionActual.createCall(label, addresses.length);
        return functionActual.instructionsCount() - 1;
    }

    // Visitor

    public String toCpp() {
        StringBuilder out = new StringBuilder();

        for (IntermediateFunction fun : functions.values()) {
            out.append(String.format("%s;\n", fun.toCppSignature()));
        }

        for (IntermediateFunction fun : functions.values()) {
            out.append(fun.toCpp());
        }

        return out.toString();
    }

    @Override
    public void visit_program(Tree program) {

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
        visit_outputs_init(tree.getChild(2));
        visit_commands(tree.getChild(3));
        visit_outputs(tree.getChild(2));

        System.out.println(functionActual);
    }

    @Override
    protected void visit_assignement(Tree tree) {
        // seems ok

        Tree expressions = tree.getChild(1);
        Tree variables = tree.getChild(0);

        for (int i = 0; i < expressions.getChildCount(); i++) {
            Integer size = functionActual.instructionsCount();
            visit_expression(expressions.getChild(i));
            String label = variables.getChild(i).getText();
            functionActual.createMov(label, size);
        }
    }

    @Override
    protected void visit_inputs(Tree tree) {
        // seems ok
        for (int i = 0; i < tree.getChildCount(); i++) {
            String label = tree.getChild(i).getText();
            functionActual.createPop(label);
        }
    }

    protected void visit_outputs_init(Tree tree) {
        // seems ok
        for (int i = tree.getChildCount() - 1; i >= 0; i--) {
            String label = tree.getChild(i).getText();
            functionActual.createDefine(label);
        }
    }

    @Override
    protected void visit_outputs(Tree tree) {
        // seems ok
        for (int i = tree.getChildCount() - 1; i >= 0; i--) {
            String label = tree.getChild(i).getText();
            functionActual.createPush(functionActual.addressFromLabel(label));
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

        functionActual.createSetHead(register, address);
        functionActual.createSetTail(register, address + 1);
    }

    @Override
    protected void visit_expr_variable(Tree tree) {
        // seems ok
        String label = tree.getChild(0).getText();

        int input = functionActual.addressFromLabel(label);
        String register = functionActual.createDefine();
        functionActual.createMov(register, input);
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

        IntermediateFunction selected = functions.get(label);

        for (int i = 0; i < selected.outputs; i++) {
            functionActual.createDefine();
        }

        int callAddress = createCall(label, parameters);

        for (int i = 0; i < selected.outputs; i++) {
            functionActual.setPop(functionActual.registerFromAddress(callAddress - selected.outputs - selected.inputs * 2 + i));
        }
    }

    @Override
    protected void visit_expr_compare(Tree tree) {
        // seems ok

        int i1 = functionActual.instructionsCount();
        visit_expression(tree.getChild(0));
        int i2 = functionActual.instructionsCount();
        visit_expression(tree.getChild(1));

        String popRegister = functionActual.createDefine();
        int callAddress = createCall("compare", new int[]{i1, i2});
        functionActual.createPop(popRegister);
    }

    @Override
    protected void visit_expr_constructor_list(Tree tree) {
        // seems ok
        Tree expressions = tree.getChild(0);
        String popRegister = functionActual.createDefine();
        int callAddress = createCall("generateList", expressions);
        functionActual.createPop(popRegister);
    }

    @Override
    protected void visit_expr_symbol(Tree tree) {
        // to be verified
        String label = tree.getText();
        int address = functionActual.addressFromLabel(label);
        String popRegister = functionActual.createDefine();
        int callAddress = createCall("generateSymbol", new int[]{address});
        functionActual.createPop(popRegister);
    }

    @Override
    protected void visit_if(Tree tree) {
        // seems ok
        Tree expression = tree.getChild(0);
        int expressionAddress = functionActual.instructionsCount();
        visit_expression(expression);

        functionActual.createIf(expressionAddress);
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
    }

    @Override
    protected void visit_while(Tree tree) {
        // to be tested
        Tree expression = tree.getChild(0);
        Tree commands = tree.getChild(1);

        int expressionAddress = functionActual.instructionsCount();
        visit_expression(expression);

        String labelIf = functionActual.createLabel();
        functionActual.createIf(expressionAddress);
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
        createCall("compare", new int[]{valueAddress, counterAddress});
        String reg = functionActual.createPop();

        functionActual.createIf(functionActual.addressFromLabel(reg));
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
