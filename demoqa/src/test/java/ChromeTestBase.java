import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Базовый класс для настройки тестов в Хроме.
 */
public class ChromeTestBase extends TestCaseBase {

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        logger.info("Инициализировали браузер Chrome");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void close(){
        if (driver != null) {
            driver.quit();
            logger.info("Закрываем браузер Chrome");
        }
    }
}
