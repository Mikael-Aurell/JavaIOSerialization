package se.lexicon.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIOUtil {
    private Object objectMapper;

    //object mapper configuration

    public JsonIOUtil() {
        objectMapper = new ObjectMapper();
        //objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        //objectMapper.configure(SerializationFeature.WRITE_DATE_AS_TIMESTAMPS, false);
        //objectMapper.registerModule(new JavaTimeModule());
    }
}
