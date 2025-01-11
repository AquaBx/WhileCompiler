package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Inc extends Instruction {

    public Inc(String register, int value) {
        super(register, value);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), getArg2());
    }

    @Override
    public String toCpp() {
        return String.format("*%s += %s;", getArg1(), getArg2());
    }
}
