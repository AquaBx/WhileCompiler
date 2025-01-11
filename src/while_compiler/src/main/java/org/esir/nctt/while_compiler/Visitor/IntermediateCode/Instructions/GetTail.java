package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class GetTail extends Instruction {

    String target;

    public GetTail(String registerSource, String registerTarget) {
        super(registerSource, registerTarget);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), getArg2());
    }

    @Override
    public String toCpp() {
        return String.format("%s = %s->GetTail();", getArg2(), getArg1());
    }
}