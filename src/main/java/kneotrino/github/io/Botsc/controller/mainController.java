package kneotrino.github.io.Botsc.controller;

import kneotrino.github.io.Botsc.dto.response.GlobalResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/

@RestController
@RequestMapping("/bsc")
@CrossOrigin
public class mainController {

    @GetMapping("/ping")
    public GlobalResponse<String> ping() {
        return new GlobalResponse<>("Ping Success", "ping");

    }


}
