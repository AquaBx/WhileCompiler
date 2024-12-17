package org.esir.nctt.while_compiler;

abstract class SymbolInfo {
    private Integer line;
    private String content;

    public SymbolInfo(Integer l, String c) {
        this.line = l;
        this.content = c;
    }

    public Integer getLine() {
        return this.line;
    }

    public String getContent() {
        return this.content;
    }

    public void setLine(Integer l) {
        this.line = l;
    }

    public void setContent(String c) {
        this.content = c;
    }
}
