package org.esir.nctt.while_compiler;

import org.antlr.runtime.tree.Tree;
import org.esir.nctt.antlr.WhileGrammarLexer;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

public class TypesVisitor extends Visitor{

    HashMap<String, Integer[]> functionSignatures = new HashMap<>();

    @Override
    public void visit_program(Tree program) {
        for (int i = 0; i < program.getChildCount(); i++) {
            Tree function = program.getChild(i);

            Integer input = function.getChild(1).getChildCount();
            Integer output = function.getChild(2).getChildCount();

            String function_name = function.getChild(0).getText();

            // Push Function signature in functionSignatures
            functionSignatures.put(function_name, new Integer[]{input, output});
        }

        // visit each function
        for (int i = 0; i < program.getChildCount(); i++) {
            visit_function(program.getChild(i));
        }
    }

    @Override
    protected void visit_function(Tree tree) {
        assertEquals(WhileGrammarLexer.FUNCTION, tree.getType());

        // Visit Commands
        visit_commands(tree.getChild(3));

    }

    protected Integer visit_expression2(Tree expression) {
        if (expression.getType() == WhileGrammarLexer.EXPR_CALL) {
            visit_expr_call(expression);
            return functionSignatures.get(expression.getChild(0).getText())[1];
        } else {
            return 1;
        }
    }
    protected Integer visit_expressions2(Tree tree) {
        assertEquals(WhileGrammarLexer.EXPRESSIONS, tree.getType());
        Integer sum = 0;
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree expression = tree.getChild(i);
            sum += visit_expression2(expression);
        }
        return sum;        
    }

    @Override
    protected void visit_assignement(Tree tree) {
        assertEquals(WhileGrammarLexer.ASSIGNMENT, tree.getType());

        // Important: we visit expressions before the variables
        Integer nbVariables = tree.getChild(0).getChildCount();
        Integer nbExpressions = visit_expressions2(tree.getChild(1));

        assertEquals(nbVariables, nbExpressions);
    }

    @Override
    protected void visit_expr_call(Tree tree) {
        Integer nbParameters = visit_expressions2(tree.getChild(1));
        assertEquals(String.format("%s", tree.getChild(0).getText()), functionSignatures.get(tree.getChild(0).getText())[0], nbParameters);
    }

    @Override
    protected void visit_expr_compare(Tree tree) {}

    @Override
    protected void visit_variables(Tree tree) {}

    @Override
    protected void visit_nop(Tree tree) {}

    @Override
    protected void visit_expr_symbol(Tree tree) {}

    @Override
    protected void visit_expr_variable(Tree tree) {}

    @Override
    protected void visit_expr_nil(Tree tree) {}

    @Override
    protected void visit_expr_construcor_list(Tree tree) {}

    @Override
    protected void visit_expr_construcor_cons(Tree tree) {}

    @Override
    protected void visit_inputs(Tree tree) {}

    @Override
    protected void visit_outputs(Tree tree) {}
}