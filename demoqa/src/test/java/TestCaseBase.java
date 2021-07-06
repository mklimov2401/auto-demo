import configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Класс для инициализации драйвера и общих компонентов.
 */
public class TestCaseBase {

    /*
    Переменная вебдрайвера.
     */
    protected WebDriver driver;
    /*
    Переменная основной конфигурации.
     */
    protected GeneralConfig config = ConfigFactory.create(GeneralConfig.class);
    /*
    Переменная логгирования.
     */
    protected static final Logger logger = Logger.getLogger(TestCaseBase.class);


    /**
     * Выполняемые действия перед началом теста.
     * Инициализация драйвера и выбор браузера для запуска.
     */
    @BeforeEach
    public void setUp(){
        switch (getConfig().browser())
        {
            case "yandex":
                ChromeOptions options = new ChromeOptions();
                options.setBinary("C:\\Users\\PC\\AppData\\Local\\Yandex\\YandexBrowser\\Application\\browser.exe");
                driver = new ChromeDriver(options);
                logger.info("Инициализировали браузер Yandex");
                break;
            default:
                driver = new ChromeDriver();
                logger.info("Инициализировали браузер Chrome");
        }
        driver.manage().window().maximize();
    }

    /**
     * Выполняемые действия после завершения каждого теста.
     * Закрытие браузера.
     */
    @AfterEach
    public void close(){
        if (driver != null) {
            driver.quit();
            logger.info("Закрываем браузер");
        }
    }


    /**
     * Отдаем главную конфигурацию.
     * @return конфигурацию.
     */
    public GeneralConfig getConfig() {
        return config;
    }

    /**
     * Сетим конфигурацию.
     * @param config
     */
    public void setConfig(GeneralConfig config) {
        this.config = config;
    }
}
