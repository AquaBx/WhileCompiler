package while_compiler.Visitor.Symbols;

import antlr.WhileGrammarLexer;
import org.antlr.runtime.tree.Tree;
import while_compiler.LibraryFunctions;
import while_compiler.Visitor.Visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SymbolsVisitor extends Visitor {
    SymbolTable lookupTable = new SymbolTable();

    public void visit_program(Tree program) throws Exception {
        // Start the global scope
        lookupTable.beginScope();

        LibraryFunctions.addTo(lookupTable);

        // Push Function symbol to symbol table (global)
        for (int i = 0; i < program.getChildCount(); i++) {
            Tree function = program.getChild(i);
            Tree function_name = function.getChild(0);
            String function_name_string = function_name.getText();

            // Push Function symbol to symbol table (global)
            lookupTable.put(
                    function_name_string,
                    new SymbolInfo(
                            function_name.getLine(),
                            function_name.getCharPositionInLine(),
                            function_name_string));
        }
        // visit each function
        for (int i = 0; i < program.getChildCount(); i++) {
            visit_function(program.getChild(i));
        }

        // pop the global scope
        lookupTable.endScope();
    }

    protected void visit_function(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.FUNCTION, tree.getType());

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

    protected void visit_inputs(Tree tree) {
        assertEquals(WhileGrammarLexer.INPUT, tree.getType());

        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree input = tree.getChild(i);
            String input_string = input.getText();

            // Push Input to sympol table
            lookupTable.put(input_string,
                    new SymbolInfo(input.getLine(), input.getCharPositionInLine(), input_string));
        }
    }

    @Override
    protected void visit_outputs(Tree tree) {
        assertEquals(WhileGrammarLexer.OUTPUT, tree.getType());

        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree output = tree.getChild(i);
            String output_string = output.getText();

            // Push Output to sympol table
            lookupTable.put(output_string,
                    new SymbolInfo(output.getLine(), output.getCharPositionInLine(), output_string));
        }
    }

    protected void visit_foreach(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.FOREACH, tree.getType());

        visit_expression(tree.getChild(1));

        Tree variable = tree.getChild(0);
        String variable_string = variable.getText();

        // Push Variable to scope
        lookupTable.put(variable_string,
                new SymbolInfo(variable.getLine(), variable.getCharPositionInLine(), variable_string));

        visit_commands(tree.getChild(2));
    }

    protected void visit_nop(Tree tree) {
        assertEquals(WhileGrammarLexer.NOP, tree.getType());

        // Nothings to do with the looking table here
    }

    protected void visit_expr_symbol(Tree tree) {
        assertEquals(WhileGrammarLexer.EXPR_SYMBOL, tree.getType());

        Tree symbol = tree.getChild(0);
        String symbol_string = symbol.getText();
    }

    protected void visit_expr_variable(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.EXPR_VARIABLE, tree.getType());

        Tree variable = tree.getChild(0);
        String variable_string = variable.getText();

        if (!lookupTable.inScope(variable_string)) {
            int row = variable.getLine();
            int col = variable.getCharPositionInLine();
            throw new Exception(String.format("Error: Variable %s (%d:%d) is not defined\n", variable_string, row, col));
        }
    }

    protected void visit_expr_nil(Tree tree) {
        assertEquals(WhileGrammarLexer.EXPR_NIL, tree.getType());

        // Nothings to do with the looking table here
    }

    protected void visit_expr_constructor_list(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.EXPR_CONSTRUCTOR_LIST, tree.getType());

        visit_expressions(tree.getChild(0));
    }

    protected void visit_expr_constructor_cons(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.EXPR_CONSTRUCTOR_CONS, tree.getType());

        visit_expressions(tree.getChild(0));
    }

    protected void visit_expr_call(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.EXPR_CALL, tree.getType());

        // check if function symbol exist
        Tree function_symbol = tree.getChild(0);
        String function_name = function_symbol.getText();
        if (!lookupTable.inScope(function_name)) {
            int row = function_symbol.getLine();
            int col = function_symbol.getCharPositionInLine();
            throw new Exception(String.format("Error: Function %s (%d:%d) is not defined\n", function_name, row, col));
        }
        visit_expressions(tree.getChild(1));
    }

    protected void visit_expr_compare(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.EXPR_COMPARE, tree.getType());

        visit_expression(tree.getChild(0));
        visit_expression(tree.getChild(1));
    }

    protected void visit_variables(Tree tree) {
        assertEquals(WhileGrammarLexer.VARIABLES, tree.getType());

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