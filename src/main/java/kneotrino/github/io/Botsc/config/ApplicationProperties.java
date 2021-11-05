package kneotrino.github.io.Botsc.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/
@Getter
@Configuration
public class ApplicationProperties {
    @Value("${telegram.bot.id}")
    private String telegramBotId;
    @Value("${telegram.bot.name}")
    private String telegramBotName;
    @Value("${telegram.bot.key}")
    private String telegramBotKey;

    @Value("${bsc.api.key}")
    private String bscApiKey;
    @Value("${bsc.api.address}")
    private String bscApiAddress;
}
