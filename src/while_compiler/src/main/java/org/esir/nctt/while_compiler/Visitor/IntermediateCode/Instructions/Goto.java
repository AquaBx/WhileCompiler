package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Goto extends Instruction {

    public Goto(String label) {
        super(label, null);
    }

    @Override
    public String toString() {
        return String.format("%s %s", getOperator(), getArg1());
    }

    @Override
    public String toCpp() {
        return String.format("goto %s;", getArg1());
    }
}
