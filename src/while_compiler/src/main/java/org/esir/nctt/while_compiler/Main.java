package org.esir.nctt.while_compiler;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;
import org.esir.nctt.antlr.WhileGrammarLexer;
import org.esir.nctt.antlr.WhileGrammarParser;

class Main {
    public static void main(String[] args) throws RecognitionException {
        for (String arg : args) {
            // faire une gestion des args pour le compilateur
            System.out.println();
        }
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

        Tree ast = (Tree) parser.program().getTree();
        Visitor visitor = new Visitor();

        // symbols analysis
        visitor.visit_program(ast);

        // Three-address code generation
        // visitor.generate_program(ast);
    }
}
