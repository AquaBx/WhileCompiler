package org.esir.nctt.while_compiler;

import static org.junit.Assert.assertTrue;

import org.antlr.runtime.tree.Tree;
import org.esir.nctt.antlr.WhileGrammarLexer;

public class Visitor {
    SymbolTable lookupTable = new SymbolTable();

    public void visit_program(Tree tree) {
        // Start the global scope
        lookupTable.beginScope();

        // Push Function symbol to sympol table (global)
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree function = tree.getChild(i);
            Tree function_name = function.getChild(0);
            String function_name_string = function_name.getText();

            // Push Function symbol to sympol table (global)
            lookupTable.put(function_name_string,
                    new SymbolInfo(function_name.getLine(), function_name.getCharPositionInLine(),
                            function_name_string));
        }

        // visit each function
        for (int i = 0; i < tree.getChildCount(); i++) {
            visit_function(tree.getChild(i));
        }

        // pop the global scope
        lookupTable.endScope();
    }

    private void visit_function(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.FUNCTION);

        lookupTable.beginScope();

        // Visit Inputs
        visit_inputs(tree.getChild(1));

        // Visit Output
        visit_outputs(tree.getChild(2));

        // Visit Commands
        visit_commands(tree.getChild(3));

        // pop the function scope
        lookupTable.endScope();
    }

    private void visit_inputs(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.INPUT);

        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree input = tree.getChild(i);
            String input_string = input.getText();

            // Push Input to sympol table
            lookupTable.put(input_string,
                    new SymbolInfo(input.getLine(), input.getCharPositionInLine(), input_string));
        }
    }

    private void visit_outputs(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.OUTPUT);

        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree output = tree.getChild(i);
            String output_string = output.getText();

            // Push Output to sympol table
            lookupTable.put(output_string,
                    new SymbolInfo(output.getLine(), output.getCharPositionInLine(), output_string));
        }
    }

    private void visit_assignement(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.ASSIGNMENT);

        // Important: we visit expressions before the variables
        visit_expressions(tree.getChild(1));
        visit_variables(tree.getChild(0));
    }

    private void visit_expressions(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.EXPRESSIONS);

        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree expression = tree.getChild(i);

            if (expression.getType() == WhileGrammarLexer.EXPR_VARIABLE) {
                visit_expr_variable(expression);
            }

        }
    }

    private void visit_expr_variable(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.EXPR_VARIABLE);

        Tree variable = tree.getChild(0);
        String variable_string = variable.getText();

        if (!lookupTable.inScope(variable_string)) {
            System.out.println("Error: " + variable_string + " is not defined");
        }

    }

    private void visit_variables(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.VARIABLES);

        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree variable = tree.getChild(i);
            String variable_string = variable.getText();

            // If variable is not already in scope, define it.
            if (!lookupTable.inScope(variable_string)) {
                lookupTable.put(variable_string,
                        new SymbolInfo(variable.getLine(), variable.getCharPositionInLine(), variable_string));
            }
        }
    }

    private void visit_commands(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.COMMANDS);

        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree command = tree.getChild(i);

            if (command.getType() == WhileGrammarLexer.ASSIGNMENT) {
                visit_assignement(command);
            }
        }

        System.out.println("Lookup Table: \n" + lookupTable);
    }
}