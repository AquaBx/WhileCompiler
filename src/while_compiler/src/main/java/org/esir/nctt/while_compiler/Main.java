package org.esir.nctt.while_compiler;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;
import org.esir.nctt.antlr.WhileGrammarLexer;
import org.esir.nctt.antlr.WhileGrammarParser;
import org.esir.nctt.while_compiler.Visitor.IntermediateCode.IntermediateCodeVisitor;
import org.esir.nctt.while_compiler.Visitor.Symbols.SymbolsVisitor;
import org.esir.nctt.while_compiler.Visitor.Types.TypesVisitor;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

class Main {
    public static void main(String[] args) throws RecognitionException {
        ArgsManager ArgM = new ArgsManager(args);

        String inputFilePath = ArgM.getArg("inputFile");
        String outputFilePath = ArgM.getArg("outputFile");
        String code = FileManager.readFile(FileManager.getPath(inputFilePath).toFile());

        ANTLRStringStream antlrStream = new ANTLRStringStream(code);
        WhileGrammarLexer lexer = new WhileGrammarLexer(antlrStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        WhileGrammarParser parser = new WhileGrammarParser(tokenStream);

        Tree ast = (Tree) parser.program().getTree();
        SymbolsVisitor symbolsVisitor = new SymbolsVisitor();
        TypesVisitor typesVisitor = new TypesVisitor();
        IntermediateCodeVisitor intermediateCodeVisitor = new IntermediateCodeVisitor();

        try {
            System.out.println("Symbols analysis");
            symbolsVisitor.visit_program(ast);

            System.out.println("Types analysis");
            typesVisitor.visit_program(ast);

            System.out.println("Three-address code generation");
            intermediateCodeVisitor.visit_program(ast);

            System.out.println("C++ generation");
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream library = classloader.getResourceAsStream("Library.cpp");
            assert library != null;
            String lib = new String(library.readAllBytes(), StandardCharsets.UTF_8);
            FileManager.writeFile(FileManager.getPath(outputFilePath).toFile(), lib + intermediateCodeVisitor.toCpp());
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
