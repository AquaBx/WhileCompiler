package while_compiler.Visitor.IntermediateCode.Instructions;

public class SetHead extends Instruction {

    public SetHead(String register, String value) {
        super(register, value);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), getArg2());
    }

    @Override
    public String toCpp() {
        return String.format("%s.setHead(%s);", getArg1(), getArg2());
    }
}
