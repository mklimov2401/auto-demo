package com.demoqa.pageObjects;

import com.demoqa.configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Базовый класс для работы с WebDriver и PageObject.
 */
public class Base {

    private WebDriver driver;
    /*
    Переменная основной конфигурации.
     */
    protected GeneralConfig config = ConfigFactory.create(GeneralConfig.class);
    /*
    Время ожидания элемента.
     */
    int sec = config.secWait();

    public Base(final WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Ждем пока элемент не станет видим заданное количество секунд.
     * Возвращаем Boolean.
     *
     * @param element
     * @param seconds количество секунд которое надо подождать.
     * @return
     */
    protected Boolean waitVisibilityOfElement(final WebElement element, final int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {

        }
        return false;
    }

    /**
     * Ждём пока элемент будет кликабелен.
     * Возвращаем Boolean.
     *
     * @param element
     * @return
     */
    protected Boolean waitToBeClickable(final WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, sec);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (Exception e) {
        }
        return false;
    }


    /**
     * Проверка что текст в элементе совпадает с переданным текстом.
     * @return true/false
     */
    public Boolean checkText(WebElement webElement, String text){
        return webElement.getText().equalsIgnoreCase(text);
    }

    public void click(WebElement element){
        waitVisibilityOfElement(element, sec);
        element.click();

    }
}
