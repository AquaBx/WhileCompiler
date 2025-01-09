package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public abstract class Instruction {
    private String arg1;
    private Integer arg2;

    public Instruction(String arg1, Integer arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    // getters
    public String getOperator() {
        return this.getClass().getSimpleName();
    }

    public String getArg1() {
        return arg1;
    }

    public int getArg2() {
        return arg2;
    }

    public void setArg2(Integer arg) {
        this.arg2 = arg;
    }

    public abstract String toString();
    public abstract String toCpp();

    // setters

    public void setRes1(String arg) {
        this.arg1 = arg;
    }

    public void setRes2(Integer arg) {
        this.arg2 = arg;
    }

    // methods

}
