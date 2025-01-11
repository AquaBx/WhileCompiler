package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Call extends Instruction {
    boolean isSTD;

    public Call(String functionName, int parameters, boolean isSTD) {
        super(functionName, parameters);
        this.isSTD = isSTD;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), getArg2());
    }

    @Override
    public String toCpp() {
        if (isSTD) {
            return String.format("WhileStandard::%s();", getArg1());
        }
        return String.format("fun_%s();", getArg1());

        // TreeList * truc = 
    }
}
