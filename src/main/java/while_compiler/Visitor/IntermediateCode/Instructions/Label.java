package while_compiler.Visitor.IntermediateCode.Instructions;

public class Label extends Instruction {

    public Label(String name) {
        super(name, null);
    }

    @Override
    public String toString() {
        return String.format("%s %s", getOperator(), getArg1());
    }

    @Override
    public String toCpp() {
        return String.format("%s :", getArg1());
    }
}
