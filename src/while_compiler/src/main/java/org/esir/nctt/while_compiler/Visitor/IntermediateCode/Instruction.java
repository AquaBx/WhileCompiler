package org.esir.nctt.while_compiler.Visitor.IntermediateCode;

public class Instruction {
    private final InstructionType operator;
    private String arg1;
    private Integer arg2;

    Instruction(InstructionType o, String arg1, Integer arg2) {
        this.operator = o;
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    // getters
    public InstructionType getOperator() {
        return operator;
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

    public String toString() {
        return String.format("%s %s %s", operator, arg1, arg2);
    }

    // setters

    public void setRes1(String arg) {
        this.arg1 = arg;
    }

    public void setRes2(Integer arg) {
        this.arg2 = arg;
    }

    // methods

}
