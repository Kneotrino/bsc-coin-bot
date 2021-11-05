package kneotrino.github.io.Botsc.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import kneotrino.github.io.Botsc.helper.ObjectMapperUtil;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/
public class BaseDto {


    @Override
    public String toString() {
        String json;
        try {
            json = ObjectMapperUtil.GetDefaultModelMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            json = "[JsonProcessingException] " + e.getMessage();
        }
        return json;
    }
}
