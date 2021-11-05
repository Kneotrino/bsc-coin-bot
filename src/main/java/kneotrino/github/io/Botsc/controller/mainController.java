package kneotrino.github.io.Botsc.controller;

import kneotrino.github.io.Botsc.dto.response.BscResponse;
import kneotrino.github.io.Botsc.dto.response.GlobalResponse;
import kneotrino.github.io.Botsc.service.SmartChainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/

@RestController
@RequestMapping("/bsc")
@CrossOrigin
public class mainController {

    @Autowired
    SmartChainService service;

    @GetMapping("/ping")
    public GlobalResponse<String> ping() {
        return new GlobalResponse<>("Ping Success", "ping");
    }

    @GetMapping("/getBalance")
    public GlobalResponse<BscResponse> getBalance(
            @RequestParam("address") String address
    ) {
        BscResponse balance = service.getBalance(address);
        return new GlobalResponse<>(balance, "getBalance Address : " + address);
    }


}
