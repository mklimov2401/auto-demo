package com.demoqa;

import com.demoqa.configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * Класс для инициализации драйвера и общих компонентов.
 */
public class TestCaseBase {

    /*
    Переменная вебдрайвера.
     */
    private WebDriver driver;
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
                setDriver(new ChromeDriver(options));
                logger.info("Инициализировали браузер Yandex");
                break;
            default:
                System.setProperty("webdriver.chrome.driver", getConfig().pathChrome());
                setDriver(new ChromeDriver());
                logger.info("Инициализировали браузер Chrome");
        }
        getDriver().manage().window().maximize();
    }

    /**
     * Выполняемые действия после завершения каждого теста.
     * Закрытие браузера.
     */
    @AfterEach
    public void close(){
        takeScreenshot();
        if (getDriver() != null) {
            getDriver().quit();
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

    /**
     * Отдаем драйвер.
     * @return
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Принимаем драйвер.
     * @param driver
     */
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Делаем скриншот страницы.
     */
    public void takeScreenshot(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String nameFile = getClass().getSimpleName() + " - " + dateFormat.format(timestamp) + ".png";
            FileUtils.copyFile(src, new File("src/main/resources/tmp/screenshot/" + nameFile));
            logger.info("Сделали скриншот экрана.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
