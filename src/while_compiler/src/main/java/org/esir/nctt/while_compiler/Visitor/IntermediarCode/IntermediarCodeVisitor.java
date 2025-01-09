package org.esir.nctt.while_compiler.Visitor.IntermediarCode;

import org.antlr.runtime.tree.Tree;
import org.esir.nctt.while_compiler.Visitor.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

public class IntermediarCodeVisitor extends Visitor {

    HashMap<String, ArrayList<IntermediarCode>> table = new HashMap<>();
    HashMap<String, Integer> tableDefinitions = new HashMap<>();
    HashMap<String, Integer[]> functionSignatures = new HashMap<>();

    String functionActual = "";

    /*
    Crée un label
    il ne stocke pas de valeur, il permet juste de se marquer un endroit
     */
    protected int createLabel(Instructions label) {
        ArrayList<IntermediarCode> aList = table.get(functionActual);
        aList.add(new IntermediarCode(label, null, null));
        return aList.size() - 1;
    }

    /*
    Crée un registre avec un label automatique
     */
    protected String createDefine() {
        ArrayList<IntermediarCode> aList = table.get(functionActual);
        String label = registerFromAddress(aList.size());

        return entry(Instructions.Define, label, null);
    }

    /*
    Crée un registre avec un label prédéfini (par exemple pour un input)
     */
    protected String createDefine(String label) {
        return entry(Instructions.Define, label, null);
    }

    /*
    Crée un appel de mov qui copie la valeur à l'adresse dans le registre label
     */
    protected String createMov(String label, Integer address) {
        return entry(Instructions.Mov, label, address);
    }

    /*
    Crée un appel de pop, crée le registre automatiquement et stock la valeur dedans
     */
    protected String createPop() {
        String reg = createDefine();
        ArrayList<IntermediarCode> aList = table.get(functionActual);
        aList.add(new IntermediarCode(Instructions.Pop, reg, null));
        return reg;
    }

    /*
    Crée un appel de pop et le stock dans le registre label
     */
    protected void setPop(String label) {
        String reg = createDefine(label);
        ArrayList<IntermediarCode> aList = table.get(functionActual);
        aList.add(new IntermediarCode(Instructions.Pop, reg, null));
    }

    /*
    Crée un nouvel élément push
     */
    protected void createPush(int address) {
        ArrayList<IntermediarCode> aList = table.get(functionActual);
        aList.add(new IntermediarCode(Instructions.Push, null, address));
    }

    /*
    Crée un appel vers une fonction
    Initialise tous les push à effectuer
     */
    protected int createCall(String label, Tree parameters) {
        ArrayList<IntermediarCode> aList = table.get(functionActual);
        for (int i = parameters.getChildCount() - 1; i >= 0; i--) {
            int size = aList.size();
            visit_expression(parameters.getChild(i));
            createPush(size);
        }
        aList.add(new IntermediarCode(Instructions.Call, label, parameters.getChildCount()));
        return aList.size() - 1;
    }

    /*
    Crée un appel vers une fonction
    Initialise tous les push à effectuer
     */
    protected int createCall(String label, int[] addresses) {
        ArrayList<IntermediarCode> aList = table.get(functionActual);
        for (int i = addresses.length - 1; i >= 0; i--) {
            createPush(addresses[i]);
        }
        aList.add(new IntermediarCode(Instructions.Call, label, addresses.length));
        return aList.size() - 1;
    }

    protected String entry(Instructions type, String label, Integer address) {
        ArrayList<IntermediarCode> aList = table.get(functionActual);
        String key = globalLabelFromLabel(label);
        int nAddress = aList.size();
        if (!tableDefinitions.containsKey(key)) {
            tableDefinitions.put(key, aList.size());
        } else {
            nAddress = tableDefinitions.get(key);
        }
        String register = registerFromAddress(nAddress);
        aList.add(new IntermediarCode(type, register, address));
        return register;
    }

    protected String registerFromAddress(int i) {
        return String.format("t%s", i);
    }

    protected String globalLabelFromLabel(String label) {
        return String.format("%s%s", functionActual, label);
    }

    protected int addressFromLabel(String label) {
        return tableDefinitions.get(globalLabelFromLabel(label));
    }

    // Visitor

    @Override
    public void visit_program(Tree program) {

        for (int i = 0; i < program.getChildCount(); i++) {
            Tree function = program.getChild(i);

            int input = function.getChild(1).getChildCount();
            int output = function.getChild(2).getChildCount();

            String function_name = function.getChild(0).getText();

            // Push Function signature in functionSignatures
            functionSignatures.put(function_name, new Integer[]{input, output});
        }

        for (int i = 0; i < program.getChildCount(); i++) {
            visit_function(program.getChild(i));
        }
    }

    @Override
    protected void visit_function(Tree tree) {

        functionActual = tree.getChild(0).getText();
        table.put(functionActual, new ArrayList<>());

        visit_inputs(tree.getChild(1));
        visit_outputs_init(tree.getChild(2));
        visit_commands(tree.getChild(3));
        visit_outputs(tree.getChild(2));

        System.out.printf("function %s\n", functionActual);
        for (int i = 0; i < table.get(functionActual).size(); i++) {
            System.out.printf("%s : %s\n", i, table.get(functionActual).get(i));
        }
        System.out.println("end\n");
    }

    @Override
    protected void visit_assignement(Tree tree) {
        // seems ok

        Tree expressions = tree.getChild(1);
        Tree variables = tree.getChild(0);
        ArrayList<IntermediarCode> aList = table.get(functionActual);

        for (int i = 0; i < expressions.getChildCount(); i++) {
            Integer size = aList.size();
            visit_expression(expressions.getChild(i));
            String label = variables.getChild(i).getText();
            createMov(label, size);
        }
    }

    @Override
    protected void visit_inputs(Tree tree) {
        // seems ok
        for (int i = 0; i < tree.getChildCount(); i++) {
            String label = tree.getChild(i).getText();
            setPop(label);
        }
    }

    protected void visit_outputs_init(Tree tree) {
        // seems ok
        for (int i = tree.getChildCount() - 1; i >= 0; i--) {
            String label = tree.getChild(i).getText();
            createDefine(label);
        }
    }

    @Override
    protected void visit_outputs(Tree tree) {
        // seems ok
        for (int i = tree.getChildCount() - 1; i >= 0; i--) {
            String label = tree.getChild(i).getText();
            createPush(addressFromLabel(label));
        }
    }

    @Override
    protected void visit_expr_nil(Tree tree) {
        // seems ok
        ArrayList<IntermediarCode> aList = table.get(functionActual);
        createDefine();
    }

    @Override
    protected void visit_expr_constructor_cons(Tree tree) {
        // seems ok
        ArrayList<IntermediarCode> aList = table.get(functionActual);
        String register = createDefine();

        int size = aList.size();
        visit_expressions(tree.getChild(0));

        aList.add(new IntermediarCode(Instructions.SetHead, register, size));
        aList.add(new IntermediarCode(Instructions.SetTail, register, size + 1));
    }

    @Override
    protected void visit_expr_variable(Tree tree) {
        // seems ok
        ArrayList<IntermediarCode> aList = table.get(functionActual);
        String label = tree.getChild(0).getText();

        int input = addressFromLabel(label);
        String register = createDefine();
        createMov(register, input);
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

        for (int i = 0; i < functionSignatures.get(label)[0]; i++) {
            createPop();
        }
    }

    @Override
    protected void visit_expr_compare(Tree tree) {
        // seems ok
        ArrayList<IntermediarCode> aList = table.get(functionActual);

        int i1 = aList.size();
        visit_expression(tree.getChild(0));
        int i2 = aList.size();
        visit_expression(tree.getChild(1));

        String popreg = createDefine();
        int callAddress = createCall("compare", new int[]{i1, i2});
        setPop(popreg);
    }

    @Override
    protected void visit_expr_constructor_list(Tree tree) {
        // seems ok
        Tree expressions = tree.getChild(0);
        String popreg = createDefine();
        int callAddress = createCall("generateList", expressions);
        setPop(popreg);
    }

    @Override
    protected void visit_expr_symbol(Tree tree) {
        // to be verified
        String label = tree.getText();
        int address = addressFromLabel(label);
        String popreg = createDefine();
        int callAddress = createCall("generateSymbol", new int[]{address});
        setPop(popreg);
    }

    @Override
    protected void visit_if(Tree tree) {
        // seems ok
        ArrayList<IntermediarCode> aList = table.get(functionActual);
        Tree expression = tree.getChild(0);
        int expressionAddress = aList.size();
        visit_expression(expression);

        aList.add(new IntermediarCode(Instructions.If, null, expressionAddress));
        int gotoElseAddress = createLabel(Instructions.Goto);

        visit_commands(tree.getChild(1));
        int gotoEndifAddress = createLabel(Instructions.Goto);

        if (tree.getChildCount() > 2) {
            aList.get(gotoElseAddress).setArg2(aList.size());
            createLabel(Instructions.Else);
            visit_commands(tree.getChild(2));
        }

        aList.get(gotoEndifAddress).setArg2(aList.size());
        createLabel(Instructions.Endif);
    }

    @Override
    protected void visit_foreach(Tree tree) {

    }

    @Override
    protected void visit_while(Tree tree) {
        // to be tested
        Tree expression = tree.getChild(0);
        Tree commands = tree.getChild(1);

        ArrayList<IntermediarCode> aList = table.get(functionActual);
        int expressionAddress = aList.size();
        visit_expression(expression);

        int whileStart = aList.size();
        aList.add(new IntermediarCode(Instructions.If, null, expressionAddress));
        int gotoEndWhileGotoAddress = createLabel(Instructions.Goto);

        visit_commands(commands);

        int gotoStartWhileGotoAddress = createLabel(Instructions.Goto);
        aList.get(gotoStartWhileGotoAddress).setArg2(whileStart);

        aList.get(gotoEndWhileGotoAddress).setArg2(aList.size());
        createLabel(Instructions.Endif);
    }

    @Override
    protected void visit_for(Tree tree) {
        // to be tested
        Tree value = tree.getChild(0);
        Tree commands = tree.getChild(1);

        ArrayList<IntermediarCode> aList = table.get(functionActual);
        int valueAddress = aList.size();
        visit_expression(value);

        int counterAddress = aList.size();
        String counterRegister = createDefine();

        int compareValueAddress = createCall("compare", new int[]{valueAddress, counterAddress});
        String reg = createPop();

        aList.add(new IntermediarCode(Instructions.If, null, addressFromLabel(reg)));
        int gotoEndForGotoAddress = createLabel(Instructions.Goto);

        visit_commands(commands);

        aList.add(new IntermediarCode(Instructions.Inc, counterRegister, 1));

        int gotoStartWhileGotoAddress = createLabel(Instructions.Goto);
        aList.get(gotoStartWhileGotoAddress).setArg2(compareValueAddress);

        aList.get(gotoEndForGotoAddress).setArg2(aList.size());
        createLabel(Instructions.Endif);
    }

    @Override
    protected void visit_variables(Tree tree) {
        // I think we do not need, except refactor
    }


}
