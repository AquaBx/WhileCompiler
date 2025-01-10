package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Push extends Instruction{

    public Push(String register) {
        super(register,null);
    }

    @Override
    public String toString() {
        return String.format("%s %s", getOperator(), getArg1());
    }

    @Override
    public String toCpp() {
        return String.format("TreeManager::getStack()->push(%s);",getArg1());
    }
}
