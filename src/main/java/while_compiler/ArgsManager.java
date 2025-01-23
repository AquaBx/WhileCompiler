package while_compiler;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

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
                    case "-a", "--asm":
                        argMap.put("asm", "true");
                        actualArg = "skip";
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
        assertTrue(argMap.containsKey(key), String.format("Key %s not set", key));
        return argMap.get(key);
    }

    String getArgOrDefault(String key, String def) {
        return argMap.getOrDefault(key, def);
    }
}
