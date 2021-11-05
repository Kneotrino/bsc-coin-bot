package kneotrino.github.io.Botsc.dto.response;

import com.fasterxml.jackson.annotation.*;
import kneotrino.github.io.Botsc.constant.botConstant;
import kneotrino.github.io.Botsc.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kneotrino
 * @since : 29/07/2021
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class GlobalResponse<T> extends BaseDto {

    private Integer result = botConstant.SUCCESS;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date dateTime;
    private String message;

    private T data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    public GlobalResponse(T content) {
        setDateTime(new Date());
        setData(content);
    }

    public GlobalResponse(T content, String message) {
        setDateTime(new Date());
        setData(content);
        setMessage(message);
    }

    public GlobalResponse() {
        setDateTime(new Date());
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonIgnore
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
