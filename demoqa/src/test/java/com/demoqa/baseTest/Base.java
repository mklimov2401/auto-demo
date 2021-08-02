package com.demoqa.baseTest;

import com.demoqa.TestCaseBase;
import com.demoqa.matchers.Assert;
import com.demoqa.pageObjects.BannerPage;
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
        goTo(getConfig().hostname());
        logger.info(String.format("Перешли на стартовую страницу - %s", getConfig().hostname()));
    }
    /**
     * Проверка стартовой страницы.
     */
    public void checkingDisplayBlocks(){
        StartPage start = new StartPage(getDriver());
        logger.info("Проверяем существование блоков на главной странице.");
        Assert.assertTrue(start.checkElements());
        Assert.assertTrue(start.checkAlerts());
        Assert.assertTrue(start.checkBook());
        Assert.assertTrue(start.checkForms());
        Assert.assertTrue(start.checkWidgets());
        Assert.assertTrue(start.checkInteractions());
        logger.info("Блоки на главной странице.");

    }

    /**
     * Проверяем наличие блоков в меню.
     */
    protected void checkingOtherBlocks() {
        MenuPage menu = new MenuPage(getDriver());
        logger.info("Проверяем наличие закрытых блоков в меню.");
        Assert.assertTrue(menu.visibleElements());
        Assert.assertTrue(menu.visibleForms());
        Assert.assertTrue(menu.visibleAlerts());
        Assert.assertTrue(menu.visibleWidgets());
        Assert.assertTrue(menu.visibleInteractions());
        Assert.assertTrue(menu.visibleBook());
    }

    /**
     * Проверка элементов в раскрытом блоке Elements.
     */
    protected void checkingBlocksElements() {
        MenuPage menu = new MenuPage(getDriver());
        Assert.assertTrue(menu.visibleElementListShow());
        Assert.assertTrue(menu.visibleTextBox());
        Assert.assertTrue(menu.visibleCheckBox());
        Assert.assertTrue(menu.visibleRadioButton());
        Assert.assertTrue(menu.visibleWebTables());
        Assert.assertTrue(menu.visibleButtons());
        Assert.assertTrue(menu.visibleLinks());
        Assert.assertTrue(menu.visibleBrokenLinksImages());
        Assert.assertTrue(menu.visibleUploadAndDownload());
        Assert.assertTrue(menu.visibleDynamicProperties());


    }

    /**
     * Перешли в блок Elements.
     */
    protected void openBlockElements() {
        MenuPage menu = new MenuPage(getDriver());
        goTo(getConfig().hostname() + "/elements");
        Assert.assertTrue(menu.visibleHeader());
        Assert.assertEquals(menu.getHeaderText(),"Elements");
        Assert.assertTrue(menu.visibleTextInBlock());
        Assert.assertEquals(menu.getTextInBlock(),"Please select an item from left to start practice.");
    }

    /**
     * Прокликивание сайта. Блок Elements.
     */
    protected void navigationOnBlockElements() {
        BannerPage banner = new BannerPage(getDriver());
        MenuPage menu = new MenuPage(getDriver());
        goTo(getConfig().hostname());
        banner.clickCloseBanner();
        menu.clickElements();
        Assert.assertEquals(menu.getHeaderText(),"Elements");
        menu.clickTextBox();
        Assert.assertEquals(menu.getTextBoxText(),"Text Box");
        menu.clickCheckBox();
        Assert.assertEquals(menu.getCheckBoxText(),"Check Box");
        menu.clickRadioButton();
        Assert.assertEquals(menu.getRadioButtonText(),"Radio Button");
        menu.scrollToWebTables();
        menu.clickWebTables();
        Assert.assertEquals(menu.getWebTablesText(),"Web Tables");
        menu.clickButtons();
        Assert.assertEquals(menu.getButtonsText(),"Buttons");
        menu.clickLinks();
        Assert.assertEquals(menu.getLinksText(),"Links");
        menu.clickBrokenLinksImages();
        Assert.assertEquals(menu.getBrokenLinksImagesText(),"Broken Links - Images");
        menu.scrollToUploadAndDownload();
        menu.clickUploadDownload();
        Assert.assertEquals(menu.getUploadDownloadText(),"Upload and Download");
        menu.clickDynamicProperties();
        Assert.assertEquals(menu.getDynamicPropertiesText(),"Dynamic Properties");

    }

    /**
     * Прокликивание сайта. Блок Forms.
     */
    protected void navigationOnBlockForms() {
        MenuPage menu = new MenuPage(getDriver());
        menu.clickForms();
        Assert.assertTrue(menu.visibleElementListShow());
        Assert.assertFalse(menu.visibleTextBoxFalse());
        menu.clickPracticeForm();
        Assert.assertEquals(menu.getPracticeFormText(),"Practice Form");
    }
}
