package while_compiler;

import antlr.WhileGrammarLexer;
import antlr.WhileGrammarParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;
import while_compiler.Visitor.IntermediateCode.IntermediateCodeVisitor;
import while_compiler.Visitor.Symbols.SymbolsVisitor;
import while_compiler.Visitor.Types.TypesVisitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Command {

    String helpMessage() {
        return """
                    A While Compiler
                
                    Usage:
                        compile INPUT_PATH [OPTION]
                            - Generate executable or C++ or IR
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
                            --cpp: Generate only C++ code
                            --debug: Add backtrace
                """;
    }

    void run_command(String[] args)  {
        if (args.length == 0) {
            System.err.println("Error: There is no input");
            System.out.println(this.helpMessage());
            return;
        }

        // Process Required Args
        String input_path = args[0];

        // Check input file
        if (!input_path.endsWith(".while")) {
            System.err.printf("Error: Unrecognized input (%s)%n", input_path);
            System.out.println(this.helpMessage());
            return;
        }

        // Process Exe Args
        StringBuilder exe_args = new StringBuilder();
        if (args.length - 1 >= 1) {
            if (args[1].equals("--")) {
                for (int i = 2; i < args.length; i++) {
                    exe_args.append(args[i]);
                    exe_args.append(" ");
                }
            }
        }

        // Execute command
        try {
            run(input_path, exe_args.toString());
        } catch (Exception e) {
            System.err.println(e.getMessage());
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
            System.err.printf("Error: Unrecognized input (%s)%n", input_path);
            System.out.println(this.helpMessage());
            return;
        }

        // Process Optional Args
        String output_path = null;
        Boolean asm_output = false;
        Boolean cpp_output = false;
        for (int i = 1; i < args.length; i++) {
            switch (args[i]) {
                case "-o", "--output":
                    output_path = args[i + 1];
                    i++;
                    break;

                case "--asm":
                    asm_output = true;
                    break;

                case "--cpp":
                    cpp_output = true;
                    break;

                default:
                    System.err.printf("Error: Unknow argument: %s%n", args[i]);
                    System.out.println(this.helpMessage());
                    return;
            }
        }

        if (asm_output && cpp_output) {
            System.err.println("Error: --asm and --cpp can't be activated at the same time.");
            System.out.println(this.helpMessage());
        }

        if (output_path == null) {
            System.out.println(input_path);
            output_path = input_path.split(".while")[0];
        }

        // Execute command
        try {
            compile(input_path, output_path, asm_output, cpp_output);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    void compile(String input_path, String output_path, Boolean asm_output, Boolean cpp_output)
    throws Exception {
        String code = FileManager.readFile(FileManager.getPath(input_path).toFile());

        if (asm_output) {
            // generate IR
            String stringexp = generateIR(code);
            FileManager.writeFile(FileManager.getPath(output_path).toFile(), stringexp);
        } else if (cpp_output) {
            // generate C++
            String stringexp = generateCpp(code);
            FileManager.writeFile(FileManager.getPath(output_path).toFile(), stringexp);
        } else {
            // generate binarie
            String cpp_code = generateCpp(code);
            compile_cpp(FileManager.getPath(output_path), cpp_code);
        }
    }

    void compile_cpp(Path executable_path, String cpp_code) throws Exception{
        System.out.println("Compile Cpp");

        Path tmpfile_cpp = Files.createTempFile("while_executable", ".cpp");
        FileManager.writeFile(tmpfile_cpp.toFile(), cpp_code);

        // Run shell command is OS-dependant
        boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");

        // Generate Command
        String command = String.format("clang++ %s -O3 -o %s", tmpfile_cpp, executable_path);
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (isWindows) {
            processBuilder.command("cmd.exe", "/c", command);
        } else {
            processBuilder.command("sh", "-c", command);
        }

        // Start Process
        Process process = processBuilder.start();

        // Read Output
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        int _exitCode = process.waitFor();
    }

    void execute(Path executable_path, String exe_args) throws Exception{
        System.out.println("Execute Code");

        // Run shell command is OS-dependant
        boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");

        // Generate Command
        String command = String.format("%s %s", executable_path, exe_args);
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (isWindows) {
            processBuilder.command("cmd.exe", "/c", command);
        } else {
            processBuilder.command("sh", "-c", command);
        }

        // Start Process
        Process process = processBuilder.start();

        // Read Output
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        System.out.println();
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        int _exitCode = process.waitFor();
    }

    // Execute .while file
    void run(String input_path, String exe_args)throws Exception{
        String code = FileManager.readFile(FileManager.getPath(input_path).toFile());
        String cpp_code = generateCpp(code);

        Path tmpfile_exe = Files.createTempFile("while_executable", ".exe");

        compile_cpp(tmpfile_exe, cpp_code);
        execute(tmpfile_exe, exe_args);
    }

    // From a while code String output the IR
    String generateIR(String code) throws  Exception {
        IntermediateCodeVisitor IR = generateIRVisitor(code);
        return IR.toString();
    }

    // From a while code String output the Cpp Code
    String generateCpp(String code) throws  Exception {
        IntermediateCodeVisitor IR = generateIRVisitor(code);

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream library = classloader.getResourceAsStream("Library.cpp");
        assert library != null;
        String lib = new String(library.readAllBytes(), StandardCharsets.UTF_8);

        return lib + IR.toCpp();
    }

    // From a while code String output the IRVisitor
    IntermediateCodeVisitor generateIRVisitor(String code) throws Exception {
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

        if (parser.getNumberOfSyntaxErrors() > 0) {
            throw new Exception(String.format("Error Syntax: %d error detected", parser.getNumberOfSyntaxErrors()));
        }
        System.out.println("Symbols analysis");
        symbolsVisitor.visit_program(ast);

        System.out.println("Types analysis");
        typesVisitor.visit_program(ast);

        System.out.println("Three-address code generation");
        intermediateCodeVisitor.visit_program(ast);

        return intermediateCodeVisitor;
    }
}
