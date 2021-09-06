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
        menu.clickWebTables();
        Assert.assertEquals(menu.getWebTablesText(),"Web Tables");
        menu.clickButtons();
        Assert.assertEquals(menu.getButtonsText(),"Buttons");
        menu.clickLinks();
        Assert.assertEquals(menu.getLinksText(),"Links");
        menu.clickBrokenLinksImages();
        Assert.assertEquals(menu.getBrokenLinksImagesText(),"Broken Links - Images");
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

    /**
     * Прокликивание сайта. Блок Alerts.
     */
    protected void navigationOnBlockAlerts() {
        MenuPage menu = new MenuPage(getDriver());
        menu.clickAlerts();
        Assert.assertTrue(menu.visibleElementListShow());
        Assert.assertFalse(menu.visibleTextBoxFalse());
        menu.clickBrowserWindows();
        Assert.assertEquals(menu.getBrowserWindowsText(),"Browser Windows");
        menu.clickAlerts2();
        Assert.assertEquals(menu.getAlerts2Text(),"Alerts");
        menu.clickFrames();
        Assert.assertEquals(menu.getFramesText(),"Frames");
        menu.clickNestedFrames();
        Assert.assertEquals(menu.getNestedFramesText(),"Nested Frames");
        menu.clickModalDialogs();
        Assert.assertEquals(menu.getModalDialogsText(),"Modal Dialogs");
    }

    /**
     * Прокликивание сайта. Блок Widgets.
     */
    protected void navigationOnBlockWidgets() {
        MenuPage menu = new MenuPage(getDriver());
        menu.clickWidgets();
        Assert.assertTrue(menu.visibleElementListShow());
        Assert.assertFalse(menu.visibleTextBoxFalse());
        menu.clickAccordian();
        Assert.assertEquals(menu.getAccordianText(),"Accordian");
        menu.clickAutoComplete();
        Assert.assertEquals(menu.getAutoCompleteText(),"Auto Complete");
        menu.clickDatePicker();
        Assert.assertEquals(menu.getDatePickerText(),"Date Picker");
        menu.clickSlider();
        Assert.assertEquals(menu.getSliderText(),"Slider");
        menu.clickProgressBar();
        Assert.assertEquals(menu.getProgressBarText(),"Progress Bar");
        menu.clickTabs();
        Assert.assertEquals(menu.getTabsText(),"Tabs");
        menu.clickToolTips();
        Assert.assertEquals(menu.getToolTipsText(),"Tool Tips");
        menu.clickMenu();
        Assert.assertEquals(menu.getMenuText(),"Menu");
        menu.clickSelectMenu();
        Assert.assertEquals(menu.getSelectMenuText(),"Select Menu");
    }

    /**
     * Прокликивание сайта. Блок Interactions.
     */
    protected void navigationOnBlockInteractions() {
        MenuPage menu = new MenuPage(getDriver());
        menu.clickInteractions();
        Assert.assertTrue(menu.visibleElementListShow());
        Assert.assertFalse(menu.visibleTextBoxFalse());
        menu.clickSortable();
        Assert.assertEquals(menu.getSortableText(),"Sortable");
        menu.clickSelectable();
        Assert.assertEquals(menu.getSelectableText(),"Selectable");
        menu.clickResizable();
        Assert.assertEquals(menu.getResizableText(),"Resizable");
        menu.clickDroppable();
        Assert.assertEquals(menu.getDroppableText(),"Droppable");
        menu.clickDragabble();
        Assert.assertEquals(menu.getDragabbleText(),"Dragabble");
    }

    /**
     * Прокликивание сайта. Блок Book Store Application.
     */
    protected void navigationOnBlockBookStoreApplication() {
        MenuPage menu = new MenuPage(getDriver());
        menu.hideFooter();
        menu.clickBook();
        Assert.assertTrue(menu.visibleElementListShow());
        Assert.assertFalse(menu.visibleTextBoxFalse());
        menu.clickLogin();
        Assert.assertEquals(menu.getLoginText(),"Login");
        menu.clickBookStore();
        Assert.assertEquals(menu.getBookStoreText(),"Book Store");
        menu.clickProfile();
        Assert.assertEquals(menu.getProfileText(),"Profile");
        menu.clickBookStoreAPI();
        Assert.assertEquals(menu.getBookStoreAPIText(),"Book Store Web API");
    }
}
