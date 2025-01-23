package while_compiler;

import antlr.WhileGrammarLexer;
import antlr.WhileGrammarParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static while_compiler.FileManager.getPath;
import static while_compiler.FileManager.readFile;

public class MainTest {
    public static void visitor(Tree tree, Integer depth) {
        System.out.println("  ".repeat(depth) + tree.getText());
        for (int i = 0; i < tree.getChildCount(); i++) {
            visitor(tree.getChild(i), depth + 1);
        }
    }

    public static void execute(Path path) {
        try {
            System.out.printf("%s%s%s\n", "-".repeat(10), path.toString(), "-".repeat(10));

            String code = readFile(path.toFile());

            ANTLRStringStream antlrStream = new ANTLRStringStream(code);

            WhileGrammarLexer lexer = new WhileGrammarLexer(antlrStream);
            TokenStream tokenStream = new CommonTokenStream(lexer);
            WhileGrammarParser parser = new WhileGrammarParser(tokenStream);

            Tree tree = (Tree) parser.program().getTree();

            visitor(tree, 0);
            System.out.println();
        } catch (Exception e) {
        }
    }

    public void main() {
        try (Stream<Path> paths = Files.walk(getPath("./test/lang"))) {
            paths.filter(Files::isRegularFile).forEach(MainTest::execute);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}