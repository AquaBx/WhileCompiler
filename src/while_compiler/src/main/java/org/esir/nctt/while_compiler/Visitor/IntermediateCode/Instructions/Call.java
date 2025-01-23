package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Call extends Instruction {
    boolean isSTD;
    String[] parameters;

    public Call(String returnReg, String functionName, String[] parameters, boolean isSTD) {
        super(functionName, returnReg);
        this.isSTD = isSTD;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s [%s]", getOperator(), getArg1(), getArg2(), String.join(",", parameters));
    }

    @Override
    public String toCpp() {
        String prefix = isSTD ? "WhileStandard::" : "fun_";
        String returnRegDef = getArg2().isEmpty() ? "" : String.format("%s = ", getArg2());

        return String.format("%s%s%s(%s);", returnRegDef, prefix, getArg1(), String.join(",", parameters));
    }
}
