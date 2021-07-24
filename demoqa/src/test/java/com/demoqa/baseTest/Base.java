package com.demoqa.baseTest;

import com.demoqa.TestCaseBase;
import com.demoqa.matchers.Assert;
import com.demoqa.pageObjects.MenuPage;
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
        logger.info(String.format("Перешли на стартовую страницу - %s", getConfig().hostname()));
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

    /**
     * Проверяем наличие блоков в меню.
     */
    protected void checkingOtherBlocks() {
        MenuPage menuPage = new MenuPage(getDriver());
        logger.info("Проверяем наличие закрытых блоков в меню.");
        Assert.assertTrue(menuPage.visibleElements());
        Assert.assertTrue(menuPage.visibleForms());
        Assert.assertTrue(menuPage.visibleAlerts());
        Assert.assertTrue(menuPage.visibleWidgets());
        Assert.assertTrue(menuPage.visibleInteractions());
        Assert.assertTrue(menuPage.visibleBook());
    }

    /**
     * Проверка элементов в раскрытом блоке Elements.
     */
    protected void checkingBlocksElements() {
        MenuPage menuPage = new MenuPage(getDriver());
        logger.info("Проверяем что блок Elements открыт.");
        Assert.assertTrue(menuPage.visibleElementListShow());
        logger.info("Проверяем разделы блока Elements.");
        Assert.assertTrue(menuPage.visibleTextBox());
        Assert.assertTrue(menuPage.visibleCheckBox());
        Assert.assertTrue(menuPage.visibleRadioButton());
        Assert.assertTrue(menuPage.visibleWebTables());
        Assert.assertTrue(menuPage.visibleButtons());
        Assert.assertTrue(menuPage.visibleLinks());
        Assert.assertTrue(menuPage.visibleBrokenLinksImages());
        Assert.assertTrue(menuPage.visibleUploadAndDownload());
        Assert.assertTrue(menuPage.visibleDynamicProperties());


    }

    /**
     * Перешли в блок Elements.
     */
    protected void openBlockElements() {
        getDriver().navigate().to(getConfig().hostname() + "/elements");
        logger.info(String.format("Перешли в блок Elements - %s", getConfig().hostname() + "/elements"));
        MenuPage menuPage = new MenuPage(getDriver());
        logger.info("Проверяем заголовок блока Elements");
        Assert.assertTrue(menuPage.visibleHeader());
        Assert.assertEquals(menuPage.getHeaderText(),"Elements");
        logger.info("Проверяем текст в блоке Elements");
        Assert.assertTrue(menuPage.visibleTextInBlock());
        Assert.assertEquals(menuPage.getTextInBlock(),"Please select an item from left to start practice.");
    }
}
