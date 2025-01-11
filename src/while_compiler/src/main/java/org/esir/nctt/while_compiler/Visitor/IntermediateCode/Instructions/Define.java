package org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions;

public class Define extends Instruction {

    String value;

    public Define(String register, String value) {
        super(register, null);
        if (!value.isEmpty()) {
            this.value = String.format("\"%s\"", value);
        } else {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s", getOperator(), getArg1());
    }

    @Override
    public String toCpp() {
        return String.format(
                "WhileStandard::Tree * %s = new WhileStandard::Tree(%s);", this.getArg1(), this.value
        );
    }
}
