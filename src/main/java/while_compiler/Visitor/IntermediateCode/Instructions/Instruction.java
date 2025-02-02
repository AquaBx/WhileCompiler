package while_compiler.Visitor.IntermediateCode.Instructions;

public abstract class Instruction {
    private final String arg2;
    private String arg1;

    public Instruction(String arg1, String arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    // getters
    public String getOperator() {
        return this.getClass().getSimpleName();
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg) {
        this.arg1 = arg;
    }

    public String getArg2() {
        return arg2;
    }

    public abstract String toString();

    public abstract String toCpp();

}
