package kneotrino.github.io.Botsc.dto.request;

import kneotrino.github.io.Botsc.dto.BaseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/
@Setter
@Getter
@Builder
public class BscRequest extends BaseDto {
    String module;
    String action;
    String address;
    String apikey;
}
