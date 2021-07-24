package com.demoqa.pageObjects;

import com.demoqa.configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends Base{

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
        return waitVisibilityOfElement(elements, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleForms(){
        return waitVisibilityOfElement(forms, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleAlerts(){
        return waitVisibilityOfElement(alerts, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleWidgets(){
        return waitVisibilityOfElement(widgets, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleInteractions(){
        return waitVisibilityOfElement(interactions, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleBook(){
        return waitVisibilityOfElement(book, sec);
    }



    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleTextBox(){
        return waitToBeClickable(textBox);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleCheckBox(){
        return waitToBeClickable(checkBox);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleRadioButton(){
        return waitToBeClickable(radioButton);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleWebTables(){
        return waitToBeClickable(webTables);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleButtons(){
        return waitToBeClickable(buttons);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleLinks(){
        return waitToBeClickable(links);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleBrokenLinksImages(){
        return waitToBeClickable(brokenLinksImages);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleUploadAndDownload(){
        return waitToBeClickable(uploadAndDownload);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleDynamicProperties(){
        return waitToBeClickable(dynamicProperties);
    }

    /**
     * Проверка что блок раскрыт.
     * @return true/false
     */
    public Boolean visibleElementListShow(){
        return waitVisibilityOfElement(elementListShow, sec);
    }

    /**
     * Проверка что elements header на странице.
     * @return true/false
     */
    public Boolean visibleHeader(){
        return waitVisibilityOfElement(header, sec);
    }

    /**
     * Возвращаем текст элемента header.
     * @return текст элемента.
     */
    public String getHeaderText(){
        return header.getText();
    }

    /**
     * Проверка что textInBlock  на странице.
     * @return true/false
     */
    public Boolean visibleTextInBlock(){
        return waitVisibilityOfElement(textInBlock, sec);
    }

    /**
     * Возвращаем текст элемента textInBlock.
     * @return текст элемента.
     */
    public String getTextInBlock(){
        return textInBlock.getText();
    }


}
