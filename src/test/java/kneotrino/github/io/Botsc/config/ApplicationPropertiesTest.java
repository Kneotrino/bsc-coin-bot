package kneotrino.github.io.Botsc.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author : Kneotrino
 * @since : 05/11/2021
 **/
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationPropertiesTest {

    @Autowired
    ApplicationProperties applicationProperties;

    @Test
    void testApplicationProperties() {
        assertNotNull(applicationProperties.getTelegramBotId());
        assertNotNull(applicationProperties.getTelegramBotName());
        assertNotNull(applicationProperties.getTelegramBotKey());
    }
}