package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Define extends Instruction{

    public Define(String register) {
        super(register,null);
    }

    @Override
    public String toString() {
        return String.format("%s %s", getOperator(), getArg1());
    }

    @Override
    public String toCpp() {
        return String.format("Tree * %s = nullptr;",getArg1());
    }
}
