package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Symbol extends Instruction{

    public Symbol(String symbol) {
        super(symbol,null);
    }

    @Override
    public String toString() {
        return String.format("%s %s", getOperator(), getArg1() );
    }

    @Override
    public String toCpp() {
        return getArg1();
    }
}
