package org.esir.nctt.while_compiler;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;
import org.esir.nctt.antlr.WhileGrammarLexer;
import org.esir.nctt.antlr.WhileGrammarParser;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class MainTest {
    public static void visitor(Tree tree, Integer depth) {
        System.out.println("  ".repeat(depth) + tree.getText());
        for (int i = 0; i < tree.getChildCount(); i++) {
            visitor(tree.getChild(i), depth+1);
        }
    }

    public static String read(Path path){
        try {
            File myObj = path.toFile();
            Scanner myReader = new Scanner(myObj);
            StringBuilder data = new StringBuilder();
            while (myReader.hasNextLine()) {
                data.append(myReader.nextLine()).append("\n");
            }
            myReader.close();
            return data.toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void execute(Path path)  {
        try {
            System.out.println( "-".repeat(10) + path.toString() + "-".repeat(10));
            System.out.println( );

            String code = read(path);

            ANTLRStringStream antlrStream = new ANTLRStringStream(code);

            WhileGrammarLexer lexer = new WhileGrammarLexer(antlrStream);
            TokenStream tokenStream = new CommonTokenStream(lexer);
            WhileGrammarParser parser = new WhileGrammarParser(tokenStream);

            Tree tree = (Tree) parser.program().getTree();

            visitor(tree,0);
            System.out.println(  );
        }
        catch (RecognitionException e){

        }
    }

    public void main() {
        try (Stream<Path> paths = Files.walk(Paths.get("./test/lang"))) {
            paths.filter(Files::isRegularFile).forEach(MainTest::execute);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}