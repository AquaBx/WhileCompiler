package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Call extends Instruction {
    boolean isSTD;
    int parameters;

    public Call(String functionName, int parameters, boolean isSTD) {
        super(functionName, null);
        this.isSTD = isSTD;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), parameters);
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
