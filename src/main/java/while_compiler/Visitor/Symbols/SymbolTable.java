package while_compiler.Visitor.Symbols;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
    private final Stack<Map<String, SymbolInfo>> scopes;

    public SymbolTable() {
        this.scopes = new Stack<Map<String, SymbolInfo>>();
    }

    public void beginScope() {
        scopes.push(new HashMap<String, SymbolInfo>());
    }

    /**
     * Remove top scope from the looking table
     *
     * @throws EmptyStackException if the scope stack is empty
     */
    public void endScope() {
        scopes.pop();
    }

    /**
     * Add element to the local scope
     *
     * @throws EmptyStackException if the scopes stack is empty.
     */
    public void put(String symbol, SymbolInfo symbol_info) {
        this.scopes.lastElement().put(symbol, symbol_info);
    }

    public boolean inScope(String symbol) {
        for (Map<String, SymbolInfo> scope : scopes) {
            if (scope.containsKey(symbol)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map<String, SymbolInfo> scope : scopes) {
            for (SymbolInfo symbole : scope.values()) {
                builder.append(String.format("%s\n", symbole));
            }
        }
        return builder.toString();
    }
}
