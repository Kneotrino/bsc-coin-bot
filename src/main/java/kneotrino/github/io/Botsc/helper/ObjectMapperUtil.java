package kneotrino.github.io.Botsc.helper;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author : Kneotrino
 * @since : 05/07/2021
 **/
public class ObjectMapperUtil {
    private static ObjectMapper objectMapper = null;

    public static ObjectMapper GetDefaultModelMapper() {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        }
        return objectMapper;
    }

}
