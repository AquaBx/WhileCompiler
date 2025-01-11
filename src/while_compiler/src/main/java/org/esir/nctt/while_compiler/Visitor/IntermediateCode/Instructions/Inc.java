package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Inc extends Instruction {

    int value;

    public Inc(String register, int value) {
        super(register, null);
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), value);
    }

    @Override
    public String toCpp() {
        return String.format("*%s += %s;", getArg1(), value);
    }
}
