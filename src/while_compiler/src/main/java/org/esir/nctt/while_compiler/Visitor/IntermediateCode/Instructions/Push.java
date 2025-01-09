package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Push extends Instruction{

    public Push(int address) {
        super(null,address);
    }

    @Override
    public String toString() {
        return String.format("%s %s", getOperator(), getArg2());
    }

    @Override
    public String toCpp() {
        // todo
        return "";
    }
}
