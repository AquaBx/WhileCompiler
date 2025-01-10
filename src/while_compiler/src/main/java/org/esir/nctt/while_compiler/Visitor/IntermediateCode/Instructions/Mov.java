package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Mov extends Instruction{
    String source;
    public Mov(String register1, String register2) {
        super(register1,null);
        this.source = register2;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), this.source);
    }

    @Override
    public String toCpp() {
        return String.format("%s = %s;",getArg1(),this.source);
    }
}
