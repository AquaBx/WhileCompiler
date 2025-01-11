package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Call extends Instruction {
    boolean isSTD;
    String[] parameters;
    String returnReg;

    public Call(String returnReg, String functionName, String[] parameters, boolean isSTD) {
        super(functionName, null);
        this.isSTD = isSTD;
        this.parameters = parameters;
        this.returnReg = returnReg;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), parameters.length);
    }

    @Override
    public String toCpp() {
        String prefix = isSTD ? "WhileStandard::" : "fun_";
        String returnRegDef = returnReg.isEmpty() ? "" : String.format("%s = ", returnReg);

        return String.format("%s%s%s(%s);", returnRegDef, prefix, getArg1(), String.join(",", parameters));
    }
}
