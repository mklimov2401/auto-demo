package com.demoqa.baseTest;

import com.demoqa.TestCaseBase;
import com.demoqa.matchers.Assert;
import com.demoqa.pageObjects.StartPage;
import org.apache.log4j.Logger;

public class Base extends TestCaseBase {
    /*
    Переменная логгирования.
     */
    protected static final Logger logger = Logger.getLogger(Base.class);

    /**
     * Открытие стартовой страницы.
     */
    public void openStartPage(){
        getDriver().navigate().to(getConfig().hostname());
        logger.info(String.format("Перешли на стартовую страницу - %s", config.hostname()));
    }
    /**
     * Проверка стартовой страницы.
     */
    public void checkingDisplayBlocks(){
        StartPage startPage = new StartPage(getDriver());
        logger.info("Проверяем существование блоков на главной странице.");
        Assert.assertTrue(startPage.checkElements());
        Assert.assertTrue(startPage.checkAlerts());
        Assert.assertTrue(startPage.checkBook());
        Assert.assertTrue(startPage.checkForms());
        Assert.assertTrue(startPage.checkWidgets());
        Assert.assertTrue(startPage.checkInteractions());
        logger.info("Блоки на главной странице.");

    }
}
