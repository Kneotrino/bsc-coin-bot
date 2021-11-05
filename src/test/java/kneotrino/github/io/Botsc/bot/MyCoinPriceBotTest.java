package kneotrino.github.io.Botsc.bot;

import kneotrino.github.io.Botsc.service.TelegramService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
class MyCoinPriceBotTest {

    @Autowired
    TelegramService telegramService;

    @Test
    void testInitBot() {
        assertNotNull(telegramService.getTelegramBotApi());
    }
}