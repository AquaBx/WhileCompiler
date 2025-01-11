package org.esir.nctt.while_compiler;

import org.esir.nctt.while_compiler.Visitor.Symbols.SymbolTable;

import java.util.HashMap;
import java.util.function.Supplier;

public class LibraryFunctions {

    public static <T extends FunctionSignature> void addTo(HashMap<String, T> target, Supplier<T> constructor) {
        // définitions des fonctions standards prises en charge par notre librairie
        try {
            T print = constructor.get();
            print.setName("print");
            print.setInputs(1);
            print.setOutputs(1);
            target.put("print", print);

            T compare = constructor.get();
            compare.setName("compare");
            compare.setInputs(2);
            compare.setOutputs(1);
            target.put("compare", compare);

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
        target.put("print", null);
        target.put("compare", null);
        target.put("generateSymbol", null);
        target.put("generateList", null);
    }
}
