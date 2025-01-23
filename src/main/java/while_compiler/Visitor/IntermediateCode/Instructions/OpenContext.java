package while_compiler.Visitor.IntermediateCode.Instructions;

public class OpenContext extends Instruction {

    public OpenContext() {
        super(null, null);
    }

    @Override
    public String toString() {
        return getOperator();
    }

    @Override
    public String toCpp() {
        return "{";
    }
}
