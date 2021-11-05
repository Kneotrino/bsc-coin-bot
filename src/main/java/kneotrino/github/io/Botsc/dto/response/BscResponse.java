package kneotrino.github.io.Botsc.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import kneotrino.github.io.Botsc.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BscResponse extends BaseDto {
    private String status;
    private String message;
    private String result;
    private String token;
    private BigDecimal balance;
}
