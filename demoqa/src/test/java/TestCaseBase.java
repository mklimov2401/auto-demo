import configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

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
