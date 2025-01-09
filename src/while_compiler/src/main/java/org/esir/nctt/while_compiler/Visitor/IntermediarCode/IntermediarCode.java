package org.esir.nctt.while_compiler.Visitor.IntermediarCode;

public class IntermediarCode {
    private final Instructions operator;
    private String arg1;
    private Integer arg2;

    IntermediarCode(Instructions o, String arg1, Integer arg2) {
        this.operator = o;
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    // getters
    public Instructions getOperator() {
        return operator;
    }

    public String getArg1() {
        return arg1;
    }

    public Integer getArg2() {
        return arg2;
    }

    public void setArg2(Integer arg) {
        this.arg2 = arg;
    }

    // // setters
    // public void setOperator(String operator) {
    //     this.operator = operator;
    // }

    public String toString() {
        return String.format("%s %s %s", operator, arg1, arg2);
    }

    public void setRes1(String arg) {
        this.arg1 = arg;
    }

    // methods

}
