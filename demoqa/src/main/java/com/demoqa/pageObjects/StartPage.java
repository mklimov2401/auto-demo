package com.demoqa.pageObjects;

import com.demoqa.configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Base{
    /*
    Переменная логгирования.
     */
    protected static final Logger logger = Logger.getLogger(StartPage.class);

    /*
    Переменная основной конфигурации.
     */
    protected GeneralConfig config = ConfigFactory.create(GeneralConfig.class);
    /*
    Время ожидания элемента.
     */
    int sec = config.secWait();

    public StartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//h5[text()='Elements']")
    private WebElement elements;

    @FindBy(xpath = ".//h5[text()='Forms']")
    private WebElement forms;

    @FindBy(xpath = ".//h5[text()='Alerts, Frame & Windows']")
    private WebElement alerts;

    @FindBy(xpath = ".//h5[text()='Widgets']")
    private WebElement widgets;

    @FindBy(xpath = ".//h5[text()='Interactions']")
    private WebElement interactions;

    @FindBy(xpath = ".//h5[text()='Book Store Application']")
    private WebElement book;

    /**
     * Проверка что elements существует на странице.
     * @return true/false
     */
    public Boolean checkElements(){
        logger.info("Проверяем что элемент elements есть на странице.");
        return waitVisibilityOfElement(elements, sec);
    }


    /**
     * Проверка что forms существует на странице.
     * @return true/false
     */
    public Boolean checkForms(){
        logger.info("Проверяем что элемент forms есть на странице.");
        return waitVisibilityOfElement(forms, sec);
    }


    /**
     * Проверка что alerts существует на странице.
     * @return true/false
     */
    public Boolean checkAlerts(){
        logger.info("Проверяем что элемент alerts есть на странице.");
        return waitVisibilityOfElement(alerts, sec);
    }

    /**
     * Проверка что widgets существует на странице.
     * @return true/false
     */
    public Boolean checkWidgets(){
        logger.info("Проверяем что элемент widgets есть на странице.");
        return waitVisibilityOfElement(widgets, sec);
    }

    /**
     * Проверка что interactions существует на странице.
     * @return true/false
     */
    public Boolean checkInteractions(){
        logger.info("Проверяем что элемент interactions есть на странице.");
        return waitVisibilityOfElement(interactions, sec);
    }
    /**
     * Проверка что book существует на странице.
     * @return true/false
     */
    public Boolean checkBook(){
        logger.info("Проверяем что элемент book есть на странице.");
        return waitVisibilityOfElement(book, sec);
    }
}
