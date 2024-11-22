package org.esir.nctt.while_compiler;

import java.io.*;
import java.util.Scanner;
import org.antlr.runtime.*;
import org.esir.nctt.antlr.WhileGrammarLexer;


public class Processor {
    public static void main(String[] args) throws IOException, RecognitionException {
        new Processor().processInteractive();
    }
    private void processInteractive() throws IOException, RecognitionException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("calculatrice> ");
            String line = scanner.nextLine().trim();
            if ("quit".equals(line) || "exit".equals(line)) break;
            Integer result = processLine(line);
            System.out.println("Resultat: "+result) ;
        }
    }
    private Integer processLine(String line) throws RecognitionException {
        /*
        calculatriceLexer lexer = new calculatriceLexer(new ANTLRStringStream(line));
        calculatricParser tokenParser = new calculatriceParser(new CommonTokenStream(lexer));
        calculatriceParser.expression_return parserResult = tokenParser.expression(); // start rule method
        return parserResult.resultat ;
        */
    }
}
