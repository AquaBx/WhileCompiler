package org.esir.nctt.while_compiler;

public class IntermediarCode {
    private String operator;
    private Integer res;
    private Integer arg;

    IntermediarCode(String o, Integer r, Integer a) {
        this.operator = o;
        this.res = r;
        this.arg = a;
    }

    // getters
    public String getOperator() {
        return operator;
    }

    public Integer getRes() {
        return res;
    }
    public Integer getArg() {
        return arg;
    }

    // // setters
    // public void setOperator(String operator) {
    //     this.operator = operator;
    // }

    // public void setRes(Integer res) {
    //     this.res = res;
    // }

    // public void setArg(Integer arg) {
    //     this.arg = arg;
    // }

    // methods

}
