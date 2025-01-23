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

            T generateSymbol = constructor.get();
            generateSymbol.setName("generateSymbol");
            generateSymbol.setInputs(1);
            generateSymbol.setOutputs(1);
            target.put("generateSymbol", generateSymbol);

            T generateList = constructor.get();
            generateList.setName("generateList");
            generateList.setInputs(2);
            generateList.setOutputs(1);
            target.put("generateList", generateList);
        } catch (Exception e) {
            System.err.printf("Cannot initialize Function from STD %s\n", e);
        }
    }

    public static void addTo(SymbolTable target) {
        // définitions des fonctions standards prises en charge par notre librairie
        target.put("pp", null);
        target.put("generateSymbol", null);
        target.put("generateList", null);
    }
}
