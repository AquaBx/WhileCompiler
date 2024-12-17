package org.esir.nctt.while_compiler;

import org.antlr.runtime.tree.Tree;

public class Visitor {

    void visit_function(Tree tree) {
        System.out.println("Function "+ tree.getChild(0));
    }

    void visit_program(Tree tree) {
        System.out.println("Print Program");
        for (int i = 0; i < tree.getChildCount(); i++) {
            visit_function(tree.getChild(i));
        }
    }

}