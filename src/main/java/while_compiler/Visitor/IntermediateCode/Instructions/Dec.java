package while_compiler.Visitor.IntermediateCode.Instructions;

public class Dec extends Instruction {

    int value;

    public Dec(String register, int value) {
        super(register, null);
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getOperator(), getArg1(), value);
    }

    @Override
    public String toCpp() {
        return String.format("%s -= %s;", getArg1(), value);
    }
}
