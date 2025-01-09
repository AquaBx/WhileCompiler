package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Pop extends Instruction{

    public Pop(String register) {
        super(register,null);
    }

    @Override
    public String toString() {
        return String.format("%s %s", getOperator(), getArg1());
    }

    @Override
    public String toCpp() {
        // todo
        return "";
    }
}
