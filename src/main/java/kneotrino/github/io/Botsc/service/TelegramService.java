package kneotrino.github.io.Botsc.service;

import org.telegram.telegrambots.meta.TelegramBotsApi;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/
public interface TelegramService {

    TelegramBotsApi getTelegramBotApi();

    void initTelegramBotApi();

}
