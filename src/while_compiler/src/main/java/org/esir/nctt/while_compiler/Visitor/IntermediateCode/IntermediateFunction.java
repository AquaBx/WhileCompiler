package org.esir.nctt.while_compiler.Visitor.IntermediateCode;

import org.esir.nctt.while_compiler.FunctionSignature;
import org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertFalse;

public class IntermediateFunction extends FunctionSignature {
    private final ArrayList<Instruction> instructions = new ArrayList<>();
    private final HashMap<Integer, String> addressToRegister = new HashMap<>();

    private final ArrayList<String> inputsLabel = new ArrayList<>();

    // Nom des output de la fonctions
    private final ArrayList<String> outputsLabel = new ArrayList<>();

    // Function is in the standard library see constructor
    private boolean isSTD = false;

    // constructeur de fonction défini par l'utilisateur
    IntermediateFunction(String name, int inputs, int outputs) {
        super(name, inputs, outputs);
    }

    /*
        Getters & Setters
     */

    // constructeur de fonction de la lib standard, le code sera déjà importé donc pas besoin de le générer
    public IntermediateFunction() {
        super();
        isSTD = true;
    }

    public boolean isSTD() {
        return isSTD;
    }

    public String registerFromAddress(int i) {
        return addressToRegister.getOrDefault(i, String.format("t%s", i));
    }

    public int addressFromRegister(String label) {
        for (Map.Entry<Integer, String> entry : addressToRegister.entrySet()) {
            if (label.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public int addInstruction(Instruction i) {
        instructions.add(i);
        return instructionsCount() - 1;
    }

    public int instructionsCount() {
        return instructions.size();
    }

    public Instruction getInstruction(int i) {
        return instructions.get(i);
    }

    public String getOutput(int i) {
        return outputsLabel.get(i);
    }

    public String toString() {
        if (isSTD()) return "";
        StringBuilder out = new StringBuilder();
        out.append(String.format("function %s\n", getName()));
        for (int i = 0; i < instructionsCount(); i++) {
            if (getInstruction(i)==null) continue;
            out.append(String.format("%s : %s\n", i, getInstruction(i)));
        }
        out.append("end\n");
        return out.toString();
    }

    /*
    Création des instructions
     */

    public int createGoto(String label) {
        return addInstruction(new Goto(label));
    }

    public String createLabel() {
        String label = String.format("label%s", instructionsCount());
        int address = addInstruction(new Label(label));
        addressToRegister.put(address, label);
        return label;
    }

    public void createIf(String register) {
        addInstruction(new If(register));
    }

    public void createIfnot(String register) {
        addInstruction(new Ifnot(register));
    }

    public void createOpenContext() {
        addInstruction(new OpenContext());
    }

    public void createCloseContext() {
        addInstruction(new CloseContext());
    }


    /*
    Crée un registre avec un label automatique
     */
    public String createDefine(String label) {
        return createDefine(label, "");
    }

    /*
    Crée un registre à partir d'un label
     */
    public String createDefine() {
        String label = registerFromAddress(instructionsCount());
        return createDefine(label);
    }

    /*
    Crée un registre avec un label automatique
     */
    public String createSymbol(String value) {
        String label = registerFromAddress(instructionsCount());
        return createDefine(label, value);
    }

    public String setRef(String value) {
        int ad = addInstruction(null);
        addressToRegister.put(ad, value);
        return value;
    }

    /*
    Crée un registre avec un label prédéfini (par exemple pour un input)
     */
    public String createDefine(String label, String value) {
        int nAddress = instructionsCount();
        if (!addressToRegister.containsValue(label)) {
            addressToRegister.put(instructionsCount(), label);
        } else {
            nAddress = addressFromRegister(label);
        }
        String register = registerFromAddress(nAddress);
        addInstruction(new Define(label, value));
        return register;
    }

    /*
    Crée un appel de mov qui copie la valeur à l'adresse dans le registre label
     */
    public void createMov(String register, String source) {
        if (!addressToRegister.containsValue(register)) {
            createDefine(register);
        }
        addInstruction(new Mov(register, source));
    }

    public void createSetHead(String register, String source) {
        addInstruction(new SetHead(register, source));
    }

    public void createSetTail(String register, String source) {
        addInstruction(new SetTail(register, source));
    }

    public void createGetHead(String source, String dest) {
        addInstruction(new GetHead(source, dest));
    }

    public void createGetTail(String source, String dest) {
        addInstruction(new GetTail(source, dest));
    }

    public void addInput(String label) {
        addressToRegister.put(instructionsCount(), label);
        inputsLabel.add(label);
    }

    public void addOutput(String label) {
        outputsLabel.add(label);
    }

    public int createCall(IntermediateFunction function, int[] retours, int[] addresses) {
        String[] inputs = new String[addresses.length];

        for (int i = 0; i < addresses.length; i++) {
            inputs[i] = registerFromAddress(addresses[i]);
        }

        String returns = createDefine();

        int callAddress = addInstruction(new Call(returns, function.getName(), inputs, function.isSTD()));

        // récupère de la stack et met dans les registres préalablement définis
        createGetHead(returns, registerFromAddress(retours[0]));
        for (int i = 1; i < function.getOutputs(); i++) {
            createGetTail(returns, returns);
            createGetHead(returns, registerFromAddress(retours[i]));
        }

        return retours[0];
    }

    public void createInc(String register, int value) {
        addInstruction(new Inc(register, value));
    }

    public void createDec(String register, int value) {
        addInstruction(new Dec(register, value));
    }

    public String toCppSignature() {
        assertFalse("STD function, do no call this method", isSTD);

        ArrayList<String> params = new ArrayList<>();
        inputsLabel.forEach(val -> params.add(String.format("const WhileStandard::Tree & %s", val)));

        String returnT = getOutputs() == 0 ? "void" : "WhileStandard::Tree";

        return String.format("%s fun_%s(%s)", returnT, getName(), String.join(",", params));
    }

    public String toCpp() {
        assertFalse("STD function, do no call this method", isSTD());

        StringBuilder out = new StringBuilder();

        out.append(String.format("%s {\n", this.toCppSignature()));

        // Ajouter des instructions dans la fonction
        for (Instruction ins : instructions) {
            if (ins == null) {
                continue;
            }
            out.append("    ");
            out.append(ins.toCpp());
            out.append("\n");
        }

        out.append("    ");

        out.append(String.format("return %s;\n", outputsLabel.getFirst()));

        out.append("}\n");

        if (Objects.equals(getName(), "main")) {
            ArrayList<String> params = new ArrayList<>();
            AtomicInteger i= new AtomicInteger(1);
            inputsLabel.forEach(val -> params.add(String.format("WhileStandard::parseTree(argv[%s])", i.getAndIncrement())));

            out.append( String.format("""
                int main(int argc, char** argv){
                    if(argc == %d){
                        WhileStandard::pp( fun_main( %s ) );
                        return 0;
                    }
                    std::cout << "Invalid number of arguments, %d required" << std::endl;
                    return 1;
                }
            """, getInputs()+1, String.join(",", params),getInputs()));
        }

        return out.toString();
    }
}
