package kneotrino.github.io.Botsc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BotscApplicationTests {

    @LocalServerPort
    Integer ServerPort;

    @Test
    void contextLoads() {
        assertNotNull(ServerPort);
    }

}
