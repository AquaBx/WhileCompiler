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
        ArgsManager ArgM = new ArgsManager(args);

        String inputFilePath = ArgM.getArg("inputFile");
        String code = FileManager.readFile(FileManager.getPath(inputFilePath).toFile());

        ANTLRStringStream antlrStream = new ANTLRStringStream(code);
        WhileGrammarLexer lexer = new WhileGrammarLexer(antlrStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        WhileGrammarParser parser = new WhileGrammarParser(tokenStream);

        Tree ast = (Tree) parser.program().getTree();
        SymbolsVisitor visitor = new SymbolsVisitor();

        // symbols analysis
        visitor.visit_program(ast);

        // types analysis
        visitor.visit_program(ast);

        // Three-address code generation
        // visitor.generate_program(ast);
    }
}
