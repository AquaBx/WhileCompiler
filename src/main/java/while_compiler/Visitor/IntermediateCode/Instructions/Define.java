package while_compiler.Visitor.IntermediateCode.Instructions;

public class Define extends Instruction {
    public Define(String register, String value) {
        super(register, value);

    }

    @Override
    public String toString() {
        return String.format("%s %s", getOperator(), getArg1());
    }

    @Override
    public String toCpp() {
        if (getArg2().isEmpty()) {
            return String.format("WhileStandard::Tree %s;", this.getArg1());
        }
        return String.format("WhileStandard::Tree %s(\"%s\");", this.getArg1(), getArg2());
    }
}
