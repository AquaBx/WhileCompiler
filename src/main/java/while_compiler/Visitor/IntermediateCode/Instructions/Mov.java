package while_compiler.Visitor.IntermediateCode.Instructions;

public class Mov extends Instruction {
    String source;

    public Mov(String register1, String register2) {
        super(register1, register2);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), getArg2());
    }

    @Override
    public String toCpp() {
        return String.format("%s = WhileStandard::Tree(%s);", getArg1(), getArg2());
    }
}
