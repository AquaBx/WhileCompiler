package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class CloseContext extends Instruction {

    public CloseContext() {
        super(null, null);
    }

    @Override
    public String toString() {
        return getOperator();
    }

    @Override
    public String toCpp() {
        return "}";
    }
}
