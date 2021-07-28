package com.demoqa.pageObjects;

import com.demoqa.configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends Base{/*
    Переменная логгирования.
     */
    protected static final Logger logger = Logger.getLogger(MenuPage.class);

    /*
    Переменная основной конфигурации.
     */
    protected GeneralConfig config = ConfigFactory.create(GeneralConfig.class);
    /*
    Время ожидания элемента.
     */
    int sec = config.secWait();

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@class='main-header']")
    private WebElement header;

    @FindBy(xpath = ".//div[@class='col-12 mt-4 col-md-6']")
    private WebElement textInBlock;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Text Box']")
    private WebElement textBox;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Check Box']")
    private WebElement checkBox;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Radio Button']")
    private WebElement radioButton;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Web Tables']")
    private WebElement webTables;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Buttons']")
    private WebElement buttons;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Links']")
    private WebElement links;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Broken Links - Images']")
    private WebElement brokenLinksImages;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Upload and Download']")
    private WebElement uploadAndDownload;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Dynamic Properties']")
    private WebElement dynamicProperties;

    @FindBy(xpath = ".//div[@class='element-list collapse show']")
    private WebElement elementListShow;

    @FindBy(xpath = ".//div[@class='header-text' and text()='Elements']")
    private WebElement elements;

    @FindBy(xpath = "(.//div[@class='card-up'])[1]")
    private WebElement elementsBlock;

    @FindBy(xpath = ".//div[@class='header-text' and text()='Forms']")
    private WebElement forms;

    @FindBy(xpath = ".//div[@class='header-text' and text()='Alerts, Frame & Windows']")
    private WebElement alerts;

    @FindBy(xpath = ".//div[@class='header-text' and text()='Widgets']")
    private WebElement widgets;

    @FindBy(xpath = ".//div[@class='header-text' and text()='Interactions']")
    private WebElement interactions;

    @FindBy(xpath = ".//div[@class='header-text' and text()='Book Store Application']")
    private WebElement book;


    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleElements(){
        logger.info("Проверяем что элемент elements есть на странице.");
        return waitVisibilityOfElement(elements, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleForms(){
        logger.info("Проверяем что элемент forms есть на странице.");
        return waitVisibilityOfElement(forms, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleAlerts(){
        logger.info("Проверяем что элемент alerts есть на странице.");
        return waitVisibilityOfElement(alerts, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleWidgets(){
        logger.info("Проверяем что элемент widgets есть на странице.");
        return waitVisibilityOfElement(widgets, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleInteractions(){
        logger.info("Проверяем что элемент interactions есть на странице.");
        return waitVisibilityOfElement(interactions, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleBook(){
        logger.info("Проверяем что элемент book есть на странице.");
        return waitVisibilityOfElement(book, sec);
    }



    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleTextBox(){
        logger.info("Проверяем что элемент textBox есть на странице.");
        return waitToBeClickable(textBox);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleCheckBox(){
        logger.info("Проверяем что элемент checkBox есть на странице.");
        return waitToBeClickable(checkBox);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleRadioButton(){
        logger.info("Проверяем что элемент radioButton есть на странице.");
        return waitToBeClickable(radioButton);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleWebTables(){
        logger.info("Проверяем что элемент webTables есть на странице.");
        return waitToBeClickable(webTables);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleButtons(){
        logger.info("Проверяем что элемент buttons есть на странице.");
        return waitToBeClickable(buttons);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleLinks(){
        logger.info("Проверяем что элемент links есть на странице.");
        return waitToBeClickable(links);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleBrokenLinksImages(){
        logger.info("Проверяем что элемент brokenLinksImages есть на странице.");
        return waitToBeClickable(brokenLinksImages);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleUploadAndDownload(){
        logger.info("Проверяем что элемент uploadAndDownload есть на странице.");
        return waitToBeClickable(uploadAndDownload);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleDynamicProperties(){
        logger.info("Проверяем что элемент dynamicProperties есть на странице.");
        return waitToBeClickable(dynamicProperties);
    }

    /**
     * Проверка что блок раскрыт.
     * @return true/false
     */
    public Boolean visibleElementListShow(){
        logger.info("Проверяем что элемент elementListShow есть на странице.");
        return waitVisibilityOfElement(elementListShow, sec);
    }

    /**
     * Проверка что elements header на странице.
     * @return true/false
     */
    public Boolean visibleHeader(){
        logger.info("Проверяем что элемент Elements есть на странице.");
        return waitVisibilityOfElement(header, sec);
    }

    /**
     * Возвращаем текст элемента header.
     * @return текст элемента.
     */
    public String getHeaderText(){
        logger.info("Возвращаем текс элемента header.");
        return header.getText();
    }

    /**
     * Возвращаем текст элемента textBox.
     * @return текст элемента.
     */
    public String getTextBoxText(){
        logger.info("Возвращаем текс элемента textBox.");
        return textBox.getText();
    }

    /**
     * Проверка что textInBlock  на странице.
     * @return true/false
     */
    public Boolean visibleTextInBlock(){
        logger.info("Проверяем что элемент textInBlock есть на странице.");
        return waitVisibilityOfElement(textInBlock, sec);
    }

    /**
     * Возвращаем текст элемента textInBlock.
     * @return текст элемента.
     */
    public String getTextInBlock(){
        logger.info("Возвращаем текс элемента textInBlock.");
        return textInBlock.getText();
    }


    /**
     * Кликаем по elements
     */
    public void clickElements(){
        logger.info("Кликаем по блоку Elements");
        click(elementsBlock);
    }


}
