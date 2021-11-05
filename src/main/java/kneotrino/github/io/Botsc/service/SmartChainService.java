package kneotrino.github.io.Botsc.service;

import kneotrino.github.io.Botsc.dto.response.BscResponse;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/
public interface SmartChainService {

    BscResponse getBalance(String Address);
}
