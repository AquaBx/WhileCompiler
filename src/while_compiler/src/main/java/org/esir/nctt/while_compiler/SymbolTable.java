package org.esir.nctt.while_compiler;
import java.util.HashMap;
import java.util.Stack;

public class SymbolTable {
    private Stack<HashMap<Symbol, Integer>> symbolTable;

    public SymbolTable() {
        this.symbolTable = new Stack<HashMap<Symbol, Integer>>();
    }

    public void push(Symbol s, Integer i) {
        HashMap<Symbol, Integer> h = new HashMap<>();
        h.put(s, i);
        this.symbolTable.push(h);
    }

    public void pop(Symbol s, Integer i) {
        assert this.symbolTable.isEmpty();
        this.symbolTable.pop();
    }

}
