import com.fasterxml.jackson.core.JsonGenerator;

import java.io.*;

public class FileGenerator implements FileManager {
    private BufferedWriter writer;
    private BufferedReader reader;

    public String readFile(String filename) throws IOException {
        String line, contain = "";
        reader = new BufferedReader(new FileReader(filename));
        while((line = reader.readLine()) != null){
            contain += line + "\n";
        }
        reader.close();
        return contain;
    }

    public void writeFile(String filename, String body) throws IOException {
        writer = new BufferedWriter(new FileWriter(filename));
        writer.write(body);
        writer.close();
    }

    public void createFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
    }
}
