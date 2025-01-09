package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Mov extends Instruction{

    public Mov(String register, int address) {
        super(register,address);
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
