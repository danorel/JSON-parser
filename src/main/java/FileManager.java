import java.io.IOException;

public interface FileManager {
    String readFile(String filename) throws IOException;
    void writeFile(String filename, String body) throws IOException;
    void createFile(String filename) throws IOException;
}
