package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Else extends Instruction{

    public Else() {
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
