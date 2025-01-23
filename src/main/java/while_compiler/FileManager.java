package while_compiler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileManager {
    public static Path getPath(String path) {
        return Paths.get(path);
    }

    public static String readFile(File file) {
        try {
            Scanner myReader = new Scanner(file);
            StringBuilder data = new StringBuilder();
            while (myReader.hasNextLine()) {
                data.append(myReader.nextLine()).append("\n");
            }
            myReader.close();
            return data.toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(File file, String data) {
        try {
            FileWriter myObj = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(myObj);
            writer.write(data);
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
