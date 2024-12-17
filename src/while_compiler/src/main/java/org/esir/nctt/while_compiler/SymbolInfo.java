package org.esir.nctt.while_compiler;

abstract class SymbolInfo {
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

    public Integer getColumn() {
        return this.column;
    }

    public String getContent() {
        return this.content;
    }

    public void setLine(Integer l) {
        this.line = l;
    }

    public void setColumn(Integer c) {
        this.column = c;
    }

    public void setContent(String c) {
        this.content = c;
    }
}
