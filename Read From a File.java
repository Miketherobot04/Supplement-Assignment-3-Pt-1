import java.io.*;
import java.nio.file.*;

public class FileHandler {
    public static String readFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}