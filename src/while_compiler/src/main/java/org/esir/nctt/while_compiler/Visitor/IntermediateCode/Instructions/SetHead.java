package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class SetHead extends Instruction {

    String value;

    public SetHead(String register, String value) {
        super(register, null);
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), this.value);
    }

    @Override
    public String toCpp() {
        return String.format("%s->setHead(%s);", getArg1(), this.value);
    }
}
