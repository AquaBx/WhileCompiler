package org.esir.nctt.while_compiler.Visitor.IntermediateCode;

import org.antlr.runtime.tree.Tree;
import org.esir.nctt.while_compiler.Visitor.Visitor;

import java.util.HashMap;

import static org.esir.nctt.while_compiler.Visitor.IntermediateCode.InstructionType.*;

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
        functionActual.addInstruction(new Instruction(Call, label, parameters.getChildCount()));
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
        functionActual.addInstruction(new Instruction(Call, label, addresses.length));
        return functionActual.instructionsCount() - 1;
    }

    // Visitor

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
            functionActual.setPop(label);
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

        int size = functionActual.instructionsCount();
        visit_expressions(tree.getChild(0));

        functionActual.addInstruction(new Instruction(SetHead, register, size));
        functionActual.addInstruction(new Instruction(SetTail, register, size + 1));
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
        int callAddress = createCall(label, parameters);

        for (int i = 0; i < functionActual.inputs; i++) {
            functionActual.createPop();
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
        functionActual.setPop(popRegister);
    }

    @Override
    protected void visit_expr_constructor_list(Tree tree) {
        // seems ok
        Tree expressions = tree.getChild(0);
        String popRegister = functionActual.createDefine();
        int callAddress = createCall("generateList", expressions);
        functionActual.setPop(popRegister);
    }

    @Override
    protected void visit_expr_symbol(Tree tree) {
        // to be verified
        String label = tree.getText();
        int address = functionActual.addressFromLabel(label);
        String popRegister = functionActual.createDefine();
        int callAddress = createCall("generateSymbol", new int[]{address});
        functionActual.setPop(popRegister);
    }

    @Override
    protected void visit_if(Tree tree) {
        // seems ok
        Tree expression = tree.getChild(0);
        int expressionAddress = functionActual.instructionsCount();
        visit_expression(expression);

        functionActual.addInstruction(new Instruction(If, null, expressionAddress));
        int gotoElseAddress = functionActual.createLabel(Goto);

        visit_commands(tree.getChild(1));
        int gotoEndifAddress = functionActual.createLabel(Goto);

        if (tree.getChildCount() > 2) {
            functionActual.getInstruction(gotoElseAddress).setArg2(functionActual.instructionsCount());
            functionActual.createLabel(Else);
            visit_commands(tree.getChild(2));
        }

        functionActual.getInstruction(gotoEndifAddress).setArg2(functionActual.instructionsCount());
        functionActual.createLabel(Endif);
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

        int whileStart = functionActual.instructionsCount();
        functionActual.addInstruction(new Instruction(If, null, expressionAddress));
        int gotoEndWhileGotoAddress = functionActual.createLabel(Goto);

        visit_commands(commands);

        int gotoStartWhileGotoAddress = functionActual.createLabel(Goto);
        functionActual.getInstruction(gotoStartWhileGotoAddress).setArg2(whileStart);

        functionActual.getInstruction(gotoEndWhileGotoAddress).setArg2(functionActual.instructionsCount());
        functionActual.createLabel(Endif);
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

        int compareValueAddress = createCall("compare", new int[]{valueAddress, counterAddress});
        String reg = functionActual.createPop();

        functionActual.addInstruction(new Instruction(If, null, functionActual.addressFromLabel(reg)));
        int gotoEndForGotoAddress = functionActual.createLabel(Goto);

        visit_commands(commands);

        functionActual.addInstruction(new Instruction(Inc, counterRegister, 1));

        int gotoStartWhileGotoAddress = functionActual.createLabel(Goto);
        functionActual.getInstruction(gotoStartWhileGotoAddress).setArg2(compareValueAddress);

        functionActual.getInstruction(gotoEndForGotoAddress).setArg2(functionActual.instructionsCount());
        functionActual.createLabel(Endif);
    }

    @Override
    protected void visit_variables(Tree tree) {
        // I think we do not need, except refactor
    }


}
