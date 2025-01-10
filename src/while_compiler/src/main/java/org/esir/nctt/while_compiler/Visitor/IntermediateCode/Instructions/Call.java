package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Call extends Instruction{
    public Call(String functionName, int parameters) {
        super(functionName,parameters);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), getArg2());
    }

    @Override
    public String toCpp() {
        return String.format("fun_%s();", getArg1());
    }
}
