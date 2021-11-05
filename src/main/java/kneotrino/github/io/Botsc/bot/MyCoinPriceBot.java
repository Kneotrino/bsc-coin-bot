package kneotrino.github.io.Botsc.bot;

import kneotrino.github.io.Botsc.config.ApplicationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/
@Component
@Slf4j
public class MyCoinPriceBot extends TelegramLongPollingBot {

    @Autowired
    ApplicationProperties applicationProperties;

    @Override
    public String getBotUsername() {
        return applicationProperties.getTelegramBotName();
    }

    @Override
    public String getBotToken() {
        return applicationProperties.getTelegramBotId().concat(":").concat(applicationProperties.getTelegramBotKey());
    }

    @Override
    public void onUpdateReceived(Update update) {
        log.info("update.getMessage().getText() = " + update.getMessage().getText());

        String command = update.getMessage().getText();
        boolean reply = false;

        SendMessage message = new SendMessage();

        if (command.equals("/register")) {
            message.setText("Please Enter your BSC Address");
            reply = true;
        }
        try {
            if (reply) {
                message.setChatId(update.getMessage().getChatId().toString());
                execute(message);
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onRegister() {
        super.onRegister();
        log.info("Register Success");
    }
}
