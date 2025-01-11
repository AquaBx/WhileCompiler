package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class GetHead extends Instruction {

    String target;

    public GetHead(String registerSource, String registerTarget) {
        super(registerSource, null);
        this.target = registerTarget;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), this.target);
    }

    @Override
    public String toCpp() {
        return String.format("%s = %s->getHead();", this.target, getArg1());
    }
}
