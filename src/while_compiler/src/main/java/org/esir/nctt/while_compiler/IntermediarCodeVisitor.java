package org.esir.nctt.while_compiler;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;
import org.esir.nctt.antlr.WhileGrammarLexer;

public class IntermediarCodeVisitor extends Visitor{

    ArrayList<IntermediarCode> table = new ArrayList<>();

    public void visit_program(Tree program) {
        for (Integer i=0; i < program.getChildCount();  i++) {
            visit_function(program.getChild(i));
        }
    }

    protected void visit_function(Tree tree) {
        // func begin <name>

        visit_commands(tree.getChild(3));

        // return 3
        // return 2
        // return 1

        // func end
    }

    @Override
    protected void visit_if(Tree tree) {

    }

    @Override
    protected void visit_while(Tree tree) {

    }

    @Override
    protected void visit_for(Tree tree) {

    }

    @Override
    protected void visit_assignement(Tree tree) {
        

        visit_variables(tree.getChild(0));
    }

    @Override
    protected void visit_variables(Tree tree) {
        for (Integer i=0; i < tree.getChildCount(); i++) {

            table.add(new IntermediarCode(o, a, r));
        }
        
    }

    @Override
    protected void visit_foreach(Tree tree) {

    }

    @Override
    protected void visit_nop(Tree tree) {

    }





}
