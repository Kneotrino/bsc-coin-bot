package kneotrino.github.io.Botsc.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import kneotrino.github.io.Botsc.config.ApplicationProperties;
import kneotrino.github.io.Botsc.constant.bscConstant;
import kneotrino.github.io.Botsc.dto.request.BscRequest;
import kneotrino.github.io.Botsc.dto.response.BscResponse;
import kneotrino.github.io.Botsc.helper.ObjectMapperUtil;
import kneotrino.github.io.Botsc.service.SmartChainService;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.utils.Convert;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/
@Service
@Slf4j
public class SmartChainServiceImpl implements SmartChainService {

    @Autowired
    ApplicationProperties applicationProperties;

    @Override
    public BscResponse getBalance(String Address) {
        ObjectMapper mapper = ObjectMapperUtil.GetDefaultModelMapper();
        BscResponse bscResponse = null;

        BscRequest bscRequest = BscRequest
                .builder()
                .module(bscConstant.ACCOUNT.MODULE)
                .action(bscConstant.ACCOUNT.GET_BALANCE)
                .address(Address)
                .apikey(applicationProperties.getBscApiKey())
                .build();
        ;

        log.info("bscRequest = " + bscRequest);

        Map<String, Object> map = mapper.convertValue(bscRequest, new TypeReference<Map<String, Object>>() {
        });
        HttpResponse<BscResponse> response =
                Unirest.get("/api")
                        .header("accept", "application/json")
                        .queryString(map)
                        .asObject(BscResponse.class);

        log.info("response.getStatus() = " + response.getStatus());
        log.info("response.getBody() = " + response.getBody());

        if (response.getBody() != null) {
            bscResponse = response.getBody();
            BigDecimal balance = Convert.fromWei(bscResponse.getResult(), Convert.Unit.ETHER);
            bscResponse.setBalance(balance);
            bscResponse.setToken(bscConstant.TOKEN.BNB);
        }
        return bscResponse;
    }
}
