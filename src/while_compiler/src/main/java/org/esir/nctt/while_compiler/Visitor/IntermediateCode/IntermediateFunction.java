package org.esir.nctt.while_compiler.Visitor.IntermediateCode;

import org.esir.nctt.while_compiler.Visitor.IntermediateCode.Instructions.*;

import java.util.ArrayList;
import java.util.HashMap;

public class IntermediateFunction {
    private final ArrayList<Instruction> instructions = new ArrayList<>();
    private final HashMap<String, Integer> registerToAddress = new HashMap<>();
    private final HashMap<Integer, String> addressToRegister = new HashMap<>();
    private final String name;
    public int inputs;
    public int outputs;

    /*
        Getters & Setters
     */

    IntermediateFunction(String name, int inputs, int outputs) {
        this.name = name;
        this.inputs = inputs;
        this.outputs = outputs;
    }

    String getName() {
        return name;
    }

    public String registerFromAddress(int i) {
        return addressToRegister.getOrDefault(i, String.format("t%s", i));
    }

    public int addressFromLabel(String label) {
        return registerToAddress.get(label);
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

    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append(String.format("function %s\n", name));
        for (int i = 0; i < instructionsCount(); i++) {
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
        registerToAddress.put(label, address);
        addressToRegister.put(address, label);
        return label;
    }

    public int createIf(int address) {
        return addInstruction(new If(address));
    }

    public int createOpenContext() {
        return addInstruction(new OpenContext());
    }

    public int createCloseContext() {
        return addInstruction(new CloseContext());
    }


    /*
    Crée un registre avec un label automatique
     */
    public String createDefine() {
        String label = registerFromAddress(instructionsCount());
        return createDefine(label);
    }

    /*
    Crée un registre avec un label prédéfini (par exemple pour un input)
     */
    public String createDefine(String label) {
        if (!registerToAddress.containsKey(label)) {
            registerToAddress.put(label, instructionsCount());
            addressToRegister.put(instructionsCount(), label);
        }
        int nAddress = registerToAddress.getOrDefault(label, instructionsCount());
        String register = registerFromAddress(nAddress);
        addInstruction(new Define(label));
        return register;
    }

    /*
    Crée un appel de mov qui copie la valeur à l'adresse dans le registre label
     */
    public void createMov(String register, Integer address) {
        addInstruction(new Mov(register, registerFromAddress(address)));
    }

    public void createSetHead(String register, Integer address) {
        addInstruction(new SetHead(register, address));
    }

    public void createSetTail(String register, Integer address) {
        addInstruction(new SetTail(register, address));
    }

    /*
    Crée un appel de pop, crée le registre automatiquement et stock la valeur dedans
     */
    public String createPop() {
        String register = createDefine();
        addInstruction(new Pop(register));
        return register;
    }

    /*
    Crée un appel de pop et le stock dans le registre label
     */
    public String createPop(String label) {
        String register = createDefine(label);
        addInstruction(new Pop(register));
        return register;
    }

    public String setPop(String label) {
        addInstruction(new Pop(label));
        return label;
    }

    /*
    Crée un nouvel élément push
     */
    public void createPush(int address) {
        addInstruction(new Push(registerFromAddress(address)));
    }

    public void createCall(IntermediateFunction function, int[] addresses) {
        // création registres de retour
        for (int i = 0; i < function.outputs; i++) {
            createDefine();
        }

        // push sur la stack les paramètres
        for (int i = addresses.length - 1; i >= 0; i--) {
            createPush(addresses[i]);
        }

        addInstruction(new Call(function.getName(), addresses.length));

        int callAddress = instructionsCount() - 1;

        // récupère de la stack et met dans les registres préalablement définis
        for (int i = 0; i < function.outputs; i++) {
            setPop(registerFromAddress(callAddress - function.outputs - function.inputs * 2 + i));
        }
    }

    public void createInc(String register, int value) {
        addInstruction(new Inc(register, value));
    }

    public String toCppSignature() {
        return String.format("void fun_%s()", name);
    }

    public String toCpp() {
        StringBuilder out = new StringBuilder();
        out.append(String.format("%s {\n", this.toCppSignature()));
        for (Instruction ins : instructions) {
            out.append("    ");
            out.append(ins.toCpp());
            out.append("\n");
        }
        out.append("}\n");
        return out.toString();
    }
}
