package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Call extends Instruction{

    public Call(String functionName, int parametersCount) {
        super(functionName,parametersCount);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), getArg2());
    }

    @Override
    public String toCpp() {
        // todo
        return "";
    }
}
