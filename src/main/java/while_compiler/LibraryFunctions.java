package while_compiler;

import while_compiler.Visitor.Symbols.SymbolTable;

import java.util.HashMap;
import java.util.function.Supplier;

public class LibraryFunctions {

    public static <T extends FunctionSignature> void addTo(HashMap<String, T> target, Supplier<T> constructor) throws Exception {
        // définitions des fonctions standards prises en charge par notre librairie
        try {
            T pp = constructor.get();
            pp.setName("pp");
            pp.setInputs(1);
            pp.setOutputs(1);
            target.put("pp", pp);

            T compare = constructor.get();
            compare.setName("compare");
            compare.setInputs(2);
            compare.setOutputs(1);
            target.put("compare", compare);
        } catch (Exception e) {
            throw new Exception(String.format("Cannot initialize Function from STD %s\n", e));
        }
    }

    public static void addTo(SymbolTable target) {
        // définitions des fonctions standards prises en charge par notre librairie
        target.put("pp", null);
        target.put("compare", null);
    }
}
