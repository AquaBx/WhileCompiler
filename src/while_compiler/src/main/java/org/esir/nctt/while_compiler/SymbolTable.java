package org.esir.nctt.while_compiler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class SymbolTable {
    private Stack<ArrayList<HashMap<String, SymbolInfo>>> symbolTable;

    public SymbolTable() {
        this.symbolTable = new Stack<ArrayList<HashMap<String, SymbolInfo>>>();
    }

    public void push(HashMap<String, SymbolInfo> h) {
        this.symbolTable.getLast().add(h);
    }

    public void pushContext(ArrayList<HashMap<String, SymbolInfo>> a) {
        this.symbolTable.push(a);
    }

    public void pop() {
        this.symbolTable.getLast().remove(this.symbolTable.getLast().size() - 1);
    }

    public void popContext() {
        assert !this.symbolTable.isEmpty();
        this.symbolTable.pop();
    }

    public ArrayList<HashMap<String, SymbolInfo>> peekContext() {
        assert !this.symbolTable.isEmpty();        
        return this.symbolTable.peek();
    }

}
