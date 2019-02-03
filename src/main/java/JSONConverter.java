import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONConverter {
    private ObjectMapper objectMapper;

    public JSONConverter(){
        objectMapper = new ObjectMapper();
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
