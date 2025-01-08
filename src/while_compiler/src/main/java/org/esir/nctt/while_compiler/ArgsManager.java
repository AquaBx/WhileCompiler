package org.esir.nctt.while_compiler;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class ArgsManager {
    HashMap<String, String> argMap = new HashMap<>();

    ArgsManager(String[] args) {
        String actualArg = "skip";
        for (String arg : args) {
            if (arg.startsWith("-")) {
                switch (arg) {
                    case "-i", "--input":
                        actualArg = "inputFile";
                        break;
                    case "-o", "--output":
                        actualArg = "outputFile";
                        break;
                    default:
                        actualArg = "skip";
                        System.out.printf("Unknown argument : %s\n", arg);
                }
            } else if (!actualArg.equals("skip")) {
                argMap.put(actualArg, arg);
                actualArg = "skip";
            }
        }
    }

    String getArg(String key) {
        assertTrue(String.format("Key %s not set", key), argMap.containsKey(key));
        return argMap.get(key);
    }
}
