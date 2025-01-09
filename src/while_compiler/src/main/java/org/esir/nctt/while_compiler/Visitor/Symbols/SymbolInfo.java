package org.esir.nctt.while_compiler.Visitor.Symbols;

class SymbolInfo {
    private Integer line;
    private Integer column; // position du premier caractère du symbole
    private String content;

    public SymbolInfo(Integer l, Integer col, String con) {
        this.line = l;
        this.column = col;
        this.content = con;
    }

    public Integer getLine() {
        return this.line;
    }

    public void setLine(Integer l) {
        this.line = l;
    }

    public Integer getColumn() {
        return this.column;
    }

    public void setColumn(Integer c) {
        this.column = c;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String c) {
        this.content = c;
    }

    public String toString() {
        return String.format("%s (%d:%d)", this.content, this.line, this.column);
    }
}
