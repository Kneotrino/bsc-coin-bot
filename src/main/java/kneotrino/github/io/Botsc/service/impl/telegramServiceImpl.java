package kneotrino.github.io.Botsc.service.impl;

import kneotrino.github.io.Botsc.bot.MyCoinPriceBot;
import kneotrino.github.io.Botsc.service.TelegramService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/
@Slf4j
@Service
public class telegramServiceImpl implements TelegramService {

    private static TelegramBotsApi telegramBotsApi = null;
    @Autowired
    MyCoinPriceBot myCoinPriceBot;

    @Override
    public TelegramBotsApi getTelegramBotApi() {
        if (telegramBotsApi == null) {
            initTelegramBotApi();
        }
        return telegramBotsApi;
    }

    @Override
    public void initTelegramBotApi() {
        try {
            telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(myCoinPriceBot);
            log.info("[SUCCESS] to construct TelegramBotsApi");
        } catch (TelegramApiException e) {
            log.error("[FAILED] to construct TelegramBotsApi ", e);
        }
    }
}
