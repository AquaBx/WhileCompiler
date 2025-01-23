package org.esir.nctt.while_compiler;

import org.antlr.grammar.v3.ANTLRv3Parser.throwsSpec_return;
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

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws RecognitionException, Exception {
        Command command = new Command();

        if (args.length == 0) {
            System.out.println(command.helpMessage());
            return;
        }

        switch (args[0]) {
            case "compile":
                command.compile_command(Arrays.copyOfRange(args, 1, args.length));
                break;

            case "run":
                command.run_command(Arrays.copyOfRange(args, 1, args.length));
                break;

            case "help":
                System.out.println(command.helpMessage());
                break;

            default:
                System.out.println(command.helpMessage());
                break;
        }
    }

}
