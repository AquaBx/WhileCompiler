package while_compiler;

import org.antlr.runtime.tree.Tree;
import org.junit.jupiter.api.Test;

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
            Command command = new Command();
            command.generateCpp(code);
            command.generateIR(code);

        } catch (Exception e) {
        }
    }

    @Test
    public void run_while_files() {
        try (Stream<Path> paths = Files.walk(getPath("./test/lang"))) {
            paths.filter(Files::isRegularFile).forEach(MainTest::execute);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}