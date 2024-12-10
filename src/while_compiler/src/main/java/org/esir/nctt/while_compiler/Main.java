package org.esir.nctt.while_compiler;

import java.io.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeNodeStream;
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

        Tree tree = (Tree)parser.program().getTree();

        System.out.println(tree.getChild(5));
        
    }
}
