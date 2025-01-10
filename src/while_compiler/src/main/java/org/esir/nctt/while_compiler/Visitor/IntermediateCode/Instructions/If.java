package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class If extends Instruction {

    public If(int address) {
        super(null, address);
    }

    @Override
    public String toString() {
        return String.format("%s %s", getOperator(), getArg2());
    }

    @Override
    public String toCpp() {
        return String.format("if ( t%s == nullptr )", getArg2());
    }
}
