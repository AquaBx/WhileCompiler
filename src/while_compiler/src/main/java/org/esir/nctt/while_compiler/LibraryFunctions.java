package org.esir.nctt.while_compiler;

import org.esir.nctt.while_compiler.Visitor.Symbols.SymbolTable;

import java.util.HashMap;
import java.util.function.Supplier;

public class LibraryFunctions {

    public static <T extends FunctionSignature> void addTo(HashMap<String, T> target, Supplier<T> constructor) {
        // définitions des fonctions standards prises en charge par notre librairie
        try {
            T pp = constructor.get();
            pp.setName("pp");
            pp.setInputs(1);
            pp.setOutputs(1);
            target.put("pp", pp);
        } catch (Exception e) {
            throw new Exception(String.format("Cannot initialize Function from STD %s\n", e));
        }
    }

    public static void addTo(SymbolTable target) {
        // définitions des fonctions standards prises en charge par notre librairie
        target.put("pp", null);
    }
}
