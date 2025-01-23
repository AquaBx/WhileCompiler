// package while_compiler;

// import static while_compiler.FileManager.getPath;
// import static while_compiler.FileManager.readFile;
// import static org.junit.Assert.assertThrows;
// import static org.junit.Assert.fail;

// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.util.stream.Stream;

// import org.antlr.runtime.ANTLRStringStream;
// import org.antlr.runtime.CommonTokenStream;
// import org.antlr.runtime.TokenStream;
// import org.antlr.runtime.tree.Tree;
// import antlr.WhileGrammarLexer;
// import antlr.WhileGrammarParser;
// import org.junit.Assert;
// import org.junit.Test;

// public class SymbolsVisitorTest {
//     public static void execute(Path path) {
//         String code = FileManager.readFile(path.toFile());

//         ANTLRStringStream antlrStream = new ANTLRStringStream(code);
//         WhileGrammarLexer lexer = new WhileGrammarLexer(antlrStream);
//         TokenStream tokenStream = new CommonTokenStream(lexer);
//         WhileGrammarParser parser = new WhileGrammarParser(tokenStream);
//         Visitor symbolsVisitor = new SymbolsVisitor();

//         try {
//             Tree ast = (Tree) parser.program().getTree();

//             // symbols analysis
//             symbolsVisitor.visit_program(ast);
//         } catch (Exception e) {
//             fail(String.format("Error: (%s) %s",path.toFile().getName() , e.getMessage()));
//         }
//     }

//     @Test
//     public void main() {
//         try (Stream<Path> paths = Files.walk(getPath("../../test/lang"))) {
//             paths.filter(Files::isRegularFile).forEach(SymbolsVisitorTest::execute);
//         } catch (IOException e) {
//             throw new RuntimeException(e);
//         }
//     }
// }