package org.esir.nctt.while_compiler;

import org.antlr.runtime.tree.Tree;

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
                    new SymbolInfo(function_name.getLine(), function_name.getCharPositionInLine(), function_name_string));
        }

        // visit each function
        for (int i = 0; i < tree.getChildCount(); i++) {
            visit_function(tree.getChild(i));
        }


        // pop the global scope
        lookupTable.endScope();
    }

    private void visit_function(Tree tree) {
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
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree input = tree.getChild(i);
            String input_string = input.getText();

            // Push Input to sympol table
            lookupTable.put(input_string,
                new SymbolInfo(input.getLine(), input.getCharPositionInLine(), input_string));
        }
    }

    private void visit_outputs(Tree tree) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree output = tree.getChild(i);
            String output_string = output.getText();

            // Push Output to sympol table
            lookupTable.put(output_string,
                new SymbolInfo(output.getLine(), output.getCharPositionInLine(), output_string));
        }
    }

    private void visit_commands(Tree tree) {
        System.out.println("Lookup Table: \n"+lookupTable);
    }



}