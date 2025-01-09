package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Goto extends Instruction{

    public Goto(String label) {
        super(label,null);
    }

    @Override
    public String toString() {
        return getOperator();
    }

    @Override
    public String toCpp() {
        return String.format("goto %s;",getArg1());
    }
}
