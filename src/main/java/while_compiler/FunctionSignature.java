package while_compiler;

public class FunctionSignature {
    private String name;
    private int inputs;
    private int outputs;

    public FunctionSignature(String name, int inputs, int outputs) {
        this.name = name;
        this.inputs = inputs;
        this.outputs = outputs;
    }

    public FunctionSignature() {
        this.name = "name";
        this.inputs = -1;
        this.outputs = -1;
    }

    public int getInputs() {
        return inputs;
    }

    public void setInputs(int inputs) {
        this.inputs = inputs;
    }

    public int getOutputs() {
        return outputs;
    }

    public void setOutputs(int outputs) {
        this.outputs = outputs;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
