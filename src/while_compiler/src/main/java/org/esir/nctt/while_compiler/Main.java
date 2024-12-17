package org.esir.nctt.while_compiler;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.esir.nctt.antlr.WhileGrammarLexer;
import org.esir.nctt.antlr.WhileGrammarParser;

class Main {
    public static void main(String[] args) throws RecognitionException {
        String code = """
            // Addition of two numbers
            function add :
            read Op1, Op2
            %
                Result := Op1 ;
                for Op2 do
                    Result := ( cons nil Result ) 
                od
            %
            write Result
            
            // Soustraction of two numbers (there is no negative number…)
            function sub :
            read Op1, Op2 
            %
                Result := Op1;
                for Op2 do
                    Result := (tl Result)
                od
            %
            write Result
            
            // Multiplication
            function mul :
            read Op1, Op2
            %
                for Op1 do
                    Result := (add Result Op2)
                od
            %
            write Result
        """;
        ANTLRStringStream antlrStream = new ANTLRStringStream(code);

        WhileGrammarLexer lexer = new WhileGrammarLexer(antlrStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        WhileGrammarParser parser = new WhileGrammarParser(tokenStream);

        Tree tree = (Tree) parser.program().getTree();

        visitor(tree,0);
    }


    public static void visitor(Tree tree, Integer depth) {
        System.out.println(depth.toString() + " " + tree.getText());

        for (int i = 0; i < tree.getChildCount(); i++) {
          visitor(tree.getChild(i), depth+1);
        } 
    }
}