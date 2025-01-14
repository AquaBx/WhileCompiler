package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Ifnot extends Instruction {

    public Ifnot(String register) {
        super(register, null);
    }

    @Override
    public String toString() {
        return String.format("%s %s", getOperator(), getArg1());
    }

    @Override
    public String toCpp() {
        return String.format("if ( %s.isNil() )", getArg1());
    }
}
