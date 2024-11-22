import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        WhileGrammarLexer lex = new WhileGrammarLexer(new ANTLRFileStream("/Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        WhileGrammarParser g = new WhileGrammarParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}