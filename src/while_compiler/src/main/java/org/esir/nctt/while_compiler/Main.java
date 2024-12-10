package org.esir.nctt.while_compiler;

import java.io.*;
import java.util.Scanner;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;
import org.esir.nctt.antlr.WhileGrammarLexer;
import org.esir.nctt.antlr.WhileGrammarParser;

class Main {
    public static void main(String[] args) throws RecognitionException {
        String code = """
                // Addition of two numbers\s
                function add :\s
                read Op1, Op2\s
                %\s
                    Result := Op1 ;\s
                    for Op2 do\s
                        Result := ( cons nil Result ) \s
                    od\s
                %\s
                write Result\s
                \s
                // Soustraction of two numbers (there is no negative number…)\s
                function sub :\s
                read Op1, Op2 \s
                %\s
                    Result := Op1;\s
                    for Op2 do\s
                        Result := (tl Result)\s
                    od\s
                %\s
                write Result\s
                \s
                // Multiplication\s
                function mul :\s
                read Op1, Op2\s
                %\s
                    for Op1 do\s
                        Result := (add Result Op2)\s
                    od\s
                %\s
                write Result
                """;
        ANTLRStringStream antlrStream = new ANTLRStringStream(code);
        WhileGrammarLexer lexer = new WhileGrammarLexer(antlrStream);
        WhileGrammarParser parser = new WhileGrammarParser(new CommonTokenStream(lexer));

        for (String token:parser.getTokenNames()){
            System.out.println(token);
        }
    }
}
