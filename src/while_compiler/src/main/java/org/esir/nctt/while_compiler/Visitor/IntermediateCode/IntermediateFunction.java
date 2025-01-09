package org.esir.nctt.while_compiler.Visitor.IntermediateCode;

import java.util.ArrayList;
import java.util.HashMap;

public class IntermediateFunction {
    private final ArrayList<Instruction> instructions = new ArrayList<>();
    private final HashMap<String, Integer> registerToAddress = new HashMap<>();
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

    public String registerFromAddress(int i) {
        return String.format("t%s", i);
    }

    public int addressFromLabel(String label) {
        return registerToAddress.get(label);
    }

    public void addInstruction(Instruction i) {
        instructions.add(i);
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

    /*
    Crée un label
    il ne stocke pas de valeur, il permet juste de se marquer un endroit
     */
    public int createLabel(InstructionType label) {
        addInstruction(new Instruction(label, null, null));
        return instructionsCount() - 1;
    }

    /*
    Crée un registre avec un label automatique
     */
    public String createDefine() {
        String label = registerFromAddress(instructionsCount());

        return entry(InstructionType.Define, label, null);
    }

    /*
    Crée un registre avec un label prédéfini (par exemple pour un input)
     */
    public String createDefine(String label) {
        return entry(InstructionType.Define, label, null);
    }

    /*
    Crée un appel de mov qui copie la valeur à l'adresse dans le registre label
     */
    public String createMov(String label, Integer address) {
        return entry(InstructionType.Mov, label, address);
    }

    /*
    Crée un appel de pop, crée le registre automatiquement et stock la valeur dedans
     */
    public String createPop() {
        String reg = createDefine();
        addInstruction(new Instruction(InstructionType.Pop, reg, null));
        return reg;
    }

    /*
    Crée un appel de pop et le stock dans le registre label
     */
    public void setPop(String label) {
        String reg = createDefine(label);
        addInstruction(new Instruction(InstructionType.Pop, reg, null));
    }

    /*
    Crée un nouvel élément push
     */
    public void createPush(int address) {
        addInstruction(new Instruction(InstructionType.Push, null, address));
    }


    public String entry(InstructionType type, String label, Integer address) {
        if (!registerToAddress.containsKey(label)) {
            registerToAddress.put(label, instructionsCount());
        }
        int nAddress = registerToAddress.getOrDefault(label, instructionsCount());
        String register = registerFromAddress(nAddress);
        addInstruction(new Instruction(type, register, address));
        return register;
    }

    public String exportCPP() {
        // todo
        return "";
    }
}
