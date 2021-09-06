package com.demoqa.pageObjects;

import com.demoqa.configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BannerPage extends Base{

    /*
    Переменная логгирования.
     */
    protected static final Logger logger = Logger.getLogger(BannerPage.class);
    /*
    Переменная основной конфигурации.
     */
    protected GeneralConfig config = ConfigFactory.create(GeneralConfig.class);
    /*
    Время ожидания элемента.
     */
    int sec = config.secWait();

    public BannerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//img[@alt='adplus-dvertising']")
    private WebElement closeFixBanner;

    /**
     * Закрываем баннер.
     */
    public void clickCloseBanner(){
        logger.info("Закрываем баннер.");
        click(closeFixBanner);
    }

}
