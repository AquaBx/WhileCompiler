package org.esir.nctt.while_compiler;
import java.util.HashMap;
import java.util.Stack;

public class SymbolTable {
    private Stack<HashMap<String, SymbolInfo>> symbolTable;

    public SymbolTable() {
        this.symbolTable = new Stack<HashMap<String, SymbolInfo>>();
    }

    public void push(String s, SymbolInfo i) {
        HashMap<String, SymbolInfo> h = new HashMap<>();
        h.put(s, i);
        this.symbolTable.push(h);
    }

    public void pop() {
        assert !this.symbolTable.isEmpty();
        this.symbolTable.pop();
    }

    public HashMap<String, SymbolInfo> peek() {
        assert !this.symbolTable.isEmpty();        
        return this.symbolTable.peek();
    }

}
