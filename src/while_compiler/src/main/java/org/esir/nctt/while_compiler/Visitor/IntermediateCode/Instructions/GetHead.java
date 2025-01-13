package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class GetHead extends Instruction {

    String target;

    public GetHead(String registerSource, String registerTarget) {
        super(registerSource, registerTarget);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), getArg2());
    }

    @Override
    public String toCpp() {
        return String.format("%s = %s.getHead();", getArg2(), getArg1());
    }
}
