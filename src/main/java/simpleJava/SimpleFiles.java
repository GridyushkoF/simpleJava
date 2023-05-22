package simpleJava;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.List;
public class SimpleFiles {
    public static String getTextFromFile(File f) {
        StringBuilder resultBuilder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(f.toPath());
            lines.forEach(line -> resultBuilder.append(line).append("\n"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultBuilder.toString();
    }
    public static<T> void writeTextToFile (T text, File f, boolean newLine) {
        try {
            FileWriter fileWriter = new FileWriter(f,true);
            String correctText = newLine ? ("\n" + text) : text.toString();
            fileWriter.write(correctText);
            fileWriter.flush();
            fileWriter.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
