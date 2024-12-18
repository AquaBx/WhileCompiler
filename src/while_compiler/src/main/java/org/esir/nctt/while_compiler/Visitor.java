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

    private void visit_commands(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.COMMANDS);

        for (int i = 0; i < tree.getChildCount(); i++) {
            visit_command(tree.getChild(i));
        }
    }  

    private void visit_if(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.IF);

        visit_expression(tree.getChild(0));

        for (int i = 1; i < tree.getChildCount(); i++) {
            visit_commands(tree.getChild(i));
        }
    }

    private void visit_while(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.WHILE);

        visit_expression(tree.getChild(0));
        visit_commands(tree.getChild(1));
    }

    private void visit_for(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.FOR);

        visit_expression(tree.getChild(0));
        visit_commands(tree.getChild(1));
    }

    private void visit_foreach(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.FOREACH);

        visit_expression(tree.getChild(1));

        Tree variable = tree.getChild(0);
        String variable_string = variable.getText();

        // Push Variable to scope
        lookupTable.put(variable_string,
        new SymbolInfo(variable.getLine(), variable.getCharPositionInLine(), variable_string));

        visit_commands(tree.getChild(2));
    }

    private void visit_assignement(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.ASSIGNMENT);

        // Important: we visit expressions before the variables
        visit_expressions(tree.getChild(1));
        visit_variables(tree.getChild(0));
    }

    private void visit_nop(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.NOP);

        // Nothings to do with the looking table here
    }

    private void visit_command(Tree command) {
        if (command.getType() == WhileGrammarLexer.IF) {
            visit_if(command);
        } else if (command.getType() == WhileGrammarLexer.WHILE) {
            visit_while(command);
        } else if (command.getType() == WhileGrammarLexer.FOR) {
            visit_for(command);
        } else if (command.getType() == WhileGrammarLexer.FOREACH) {
            visit_foreach(command);
        } else if (command.getType() == WhileGrammarLexer.ASSIGNMENT) {
            visit_assignement(command);
        } else if (command.getType() == WhileGrammarLexer.NOP) {
            visit_nop(command);
        }
    }

    private void visit_expr_symbol(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.EXPR_SYMBOL);

        Tree symbol = tree.getChild(0);
        String symbol_string = symbol.getText();

        if (!lookupTable.inScope(symbol_string)) {
            System.out.println("Error: Symbol " + symbol_string + " is not defined");
        }
    }

    private void visit_expr_variable(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.EXPR_VARIABLE);

        Tree variable = tree.getChild(0);
        String variable_string = variable.getText();

        if (!lookupTable.inScope(variable_string)) {
            System.out.println("Error: Variable " + variable_string + " is not defined");
        }
    }

    private void visit_expr_nil(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.EXPR_NIL);

        // Nothings to do with the looking table here
    }

    private void visit_expr_construcor_list(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.EXPR_CONSTRUCTOR_LIST);

        visit_expressions(tree.getChild(0));
    }

    private void visit_expr_construcor_cons(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.EXPR_CONSTRUCTOR_CONS);

        visit_expressions(tree.getChild(0));
    }

    private void visit_expr_head(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.EXPR_HEAD);

        visit_expression(tree.getChild(0));
    }

    private void visit_expr_tail(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.EXPR_TAIL);

        visit_expression(tree.getChild(0));
    }

    private void visit_expr_call(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.EXPR_CALL);

        // check if function symbol exist
        Tree function_symbol = tree.getChild(0);
        String function_name = function_symbol.getText();
        if (!lookupTable.inScope(function_name)) {
            // TODO make better error
            System.out.println("Error: Function " + function_name + " is not defined" );
        }

        visit_expressions(tree.getChild(1));
    }

    private void visit_expr_compare(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.EXPR_COMPARE);

        visit_expression(tree.getChild(0));
        visit_expression(tree.getChild(1));
    }

    private void visit_expression(Tree expression) {
        if (expression.getType() == WhileGrammarLexer.EXPR_SYMBOL) {
            visit_expr_symbol(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_VARIABLE) {
            visit_expr_variable(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_NIL) {
            visit_expr_nil(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_CONSTRUCTOR_LIST) {
            visit_expr_construcor_list(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_CONSTRUCTOR_CONS) {
            visit_expr_construcor_cons(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_HEAD) {
            visit_expr_head(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_TAIL) {
            visit_expr_tail(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_CALL) {
            visit_expr_call(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_COMPARE) {
            visit_expr_compare(expression);
        }
    }

    private void visit_expressions(Tree tree) {
        assertTrue(tree.getType() == WhileGrammarLexer.EXPRESSIONS);

        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree expression = tree.getChild(i);
            visit_expression(expression);
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


}