package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class SetTail extends Instruction {

    String value;

    public SetTail(String register, String value) {
        super(register, null);
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), this.value);
    }

    @Override
    public String toCpp() {
        return String.format("%s->setTail(%s);", getArg1(), this.value);
    }
}