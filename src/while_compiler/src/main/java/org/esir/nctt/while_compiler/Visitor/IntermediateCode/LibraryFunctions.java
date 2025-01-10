package org.esir.nctt.while_compiler.Visitor.IntermediateCode;

import java.util.HashMap;

public class LibraryFunctions {
    static void addTo(HashMap<String,IntermediateFunction> target) {
        // définitions des fonctions standards prises en charge par notre librairie
        target.put("print",new IntermediateFunction("print", 1, 0));
        target.put("compare",new IntermediateFunction("compare", 2, 1));
        target.put("generateSymbol",new IntermediateFunction("generateSymbol", 1, 1));
        target.put("generateList", new IntermediateFunction("generateList", 2, 1));
    }
}
