package kneotrino.github.io.Botsc.config;

import kneotrino.github.io.Botsc.service.TelegramService;
import kong.unirest.Unirest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/
@Component
public class BotConfiguration implements CommandLineRunner {

    @Autowired
    TelegramService telegramService;

    @Override
    public void run(String... args) {
        Unirest
                .config()
                .connectTimeout(10000)
                .socketTimeout(10000)
                .defaultBaseUrl("https://api.bscscan.com");

        telegramService.initTelegramBotApi();
    }
}
