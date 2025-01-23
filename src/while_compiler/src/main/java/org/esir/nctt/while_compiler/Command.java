package org.esir.nctt.while_compiler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

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

public class Command {
    
    String helpMessage() {
        return """
                    A While Compiler

                    Usage:
                        compile INPUT_PATH [OPTION]
                            - Generate executable or IR
                        run INPUT_PATH
                            - Run .while file
                        help
                            - Print this help message

                    Arguments:
                        INPUT_PATH: Path to the .while file

                    Options:
                        compile:
                            -o, --output <OUTPUT_PATH>: Path to the result file
                            --asm: Generate only IR code
                """;
    }

    void run_command(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("Error: There is no input");
            System.out.println(this.helpMessage());
            return;
        }

        // Process Required Args
        String input_path = args[0];

        // Check input file
        if (!input_path.endsWith(".while")) {
            System.err.println(String.format("Error: Unrecognized input (%s)", input_path));
            System.out.println(this.helpMessage());
            return;
        }

        // Process Optional Args
        if (args.length > 1) {
            System.err.println("There is too many arguments");
            System.out.println(this.helpMessage());
            return;
        }

        // Execute command
        try {
            run(input_path);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    void compile_command(String[] args) {
        if (args.length == 0) {
            System.err.println("Error: There is no input");
            System.out.println(this.helpMessage());
            return;
        }

        // Process Required Args
        String input_path = args[0];

        // Check input file
        if (!input_path.endsWith(".while")) {
            System.err.println(String.format("Error: Unrecognized input (%s)", input_path));
            System.out.println(this.helpMessage());
            return;
        }

        // Process Optional Args
        String output_path = null;
        Boolean asm_output = false;
        for (int i = 1; i < args.length; i++) {
            switch (args[i]) {
                case "-o", "--output":
                    output_path = args[i + 1];
                    i++;
                    break;

                case "--asm":
                    asm_output = true;
                    break;

                default:
                    System.err.println(String.format("Error: Unknow argument: %s", args[i]));
                    System.out.println(this.helpMessage());
                    return;
            }
        }

        if (output_path == null) {
            System.out.println(input_path);
            output_path = input_path.split(".while")[0];
        }

        // Execute command
        try {
            compile(input_path, output_path, asm_output);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    void compile(String input_path, String output_path, Boolean asm_output) throws RecognitionException {
        String code = FileManager.readFile(FileManager.getPath(input_path).toFile());

        String stringexp = null;

        if (asm_output) {
            // Get IR
            stringexp = generateIR(code);
        } else {
            // Get Cpp
            stringexp = generateIR(code);
        }

        FileManager.writeFile(FileManager.getPath(output_path).toFile(), stringexp);
    }

    // Execute .while file
    void run(String input_path) throws IOException, RecognitionException {
        String code = FileManager.readFile(FileManager.getPath(input_path).toFile());
        String cpp_code = generateCpp(code);
        
        Path tmpfile_exe = Files.createTempFile("while_executable",".exe");
        
        
        // Run shell command is OS-dependant
        boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
        
        // Compile Cpp
        {
            Path tmpfile_cpp = Files.createTempFile("while_executable",".cpp");
            FileManager.writeFile(tmpfile_cpp.toFile(), cpp_code);

            // Generate Command
            String command = String.format("clang++ %s -o %s",tmpfile_cpp,tmpfile_exe);
            ProcessBuilder processBuilder= new ProcessBuilder();
            if (!isWindows) {
                processBuilder.command("cmd.exe", "/c", command);
            } else {
                processBuilder.command("sh", "-c", command);
            }

            // Start Process
            Process process = processBuilder.start();

            // Read Output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            try {
                int exitCode = process.waitFor();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        // Run executable
        {
            // Generate Command
            String command = String.format("./%s",tmpfile_exe);
            ProcessBuilder processBuilder= new ProcessBuilder();
            if (!isWindows) {
                processBuilder.command("cmd.exe", "/c", command);
            } else {
                processBuilder.command("sh", "-c", command);
            }

            // Start Process
            Process process = processBuilder.start();

            // Read Output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            try {
                int exitCode = process.waitFor();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    // From a while code String output the IR
    String generateIR(String code) throws RecognitionException {
        IntermediateCodeVisitor IR = generateIRVisitor(code);
        return IR.toString();
    }

    // From a while code String output the Cpp Code
    String generateCpp(String code) throws IOException, RecognitionException {
        IntermediateCodeVisitor IR = generateIRVisitor(code);

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream library = classloader.getResourceAsStream("Library.cpp");
        assert library != null;
        String lib = new String(library.readAllBytes(), StandardCharsets.UTF_8);

        return lib + IR.toCpp();
    }

    // From a while code String output the IRVisitor
    IntermediateCodeVisitor generateIRVisitor(String code) throws RecognitionException {
        // Init ANTLR classes
        ANTLRStringStream antlrStream = new ANTLRStringStream(code);
        WhileGrammarLexer lexer = new WhileGrammarLexer(antlrStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        WhileGrammarParser parser = new WhileGrammarParser(tokenStream);
        Tree ast = (Tree) parser.program().getTree();

        // Init Visitors
        SymbolsVisitor symbolsVisitor = new SymbolsVisitor();
        TypesVisitor typesVisitor = new TypesVisitor();
        IntermediateCodeVisitor intermediateCodeVisitor = new IntermediateCodeVisitor();

        try {
            if (parser.getNumberOfSyntaxErrors() > 0) {
                throw new Exception(String.format("Error Syntax: %d error detected", parser.getNumberOfSyntaxErrors()));
            }
            System.out.println("Symbols analysis");
            symbolsVisitor.visit_program(ast);

            System.out.println("Types analysis");
            typesVisitor.visit_program(ast);

            System.out.println("Three-address code generation");
            intermediateCodeVisitor.visit_program(ast);
        } catch (Exception e) {
            System.err.println(e);
        }
        return intermediateCodeVisitor;
    }
}
