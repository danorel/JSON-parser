import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        JSONConverter converter = new JSONConverter();
        FileGenerator generator = new FileGenerator();
        Cat cat = converter.getObjectMapper().readValue(generator.readFile("src/cat.json"), Cat.class);
        System.out.println(cat.getName() + " " + cat.getAge());
    }
}
