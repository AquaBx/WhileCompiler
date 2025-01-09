package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Goto extends Instruction{

    public Goto() {
        super(null,null);
    }

    @Override
    public String toString() {
        return getOperator();
    }

    @Override
    public String toCpp() {
        // todo
        return "";
    }
}
