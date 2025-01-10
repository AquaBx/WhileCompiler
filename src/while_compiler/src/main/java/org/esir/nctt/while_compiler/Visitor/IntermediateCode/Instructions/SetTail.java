package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class SetTail extends Instruction{

    public SetTail(String register, int address) {
        super(register,address);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), getArg2());
    }

    @Override
    public String toCpp() {
        return String.format("%s->setTail(t%s);",getArg1(),getArg2());
    }
}