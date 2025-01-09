package org.esir.nctt.while_compiler;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;
import org.esir.nctt.antlr.WhileGrammarLexer;
import org.esir.nctt.antlr.WhileGrammarParser;
import org.esir.nctt.while_compiler.Visitor.IntermediarCode.IntermediarCodeVisitor;
import org.esir.nctt.while_compiler.Visitor.Symbols.SymbolsVisitor;
import org.esir.nctt.while_compiler.Visitor.Types.TypesVisitor;
import org.esir.nctt.while_compiler.Visitor.Visitor;

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
        Visitor symbolsVisitor = new SymbolsVisitor();
        Visitor typesVisitor = new TypesVisitor();
        Visitor intermediarCodeVisitor = new IntermediarCodeVisitor();

        try {
            // symbols analysis
            symbolsVisitor.visit_program(ast);

            // types analysis
            typesVisitor.visit_program(ast);

            // Three-address code generation
            intermediarCodeVisitor.visit_program(ast);
        } catch (Exception e) {
            System.err.println(e);
        }


    }
}
