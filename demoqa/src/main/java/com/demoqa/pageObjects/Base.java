package com.demoqa.pageObjects;

import com.demoqa.configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocator;
import org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler;
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
     * Ждём пока элемент будет кликабелен.
     * Возвращаем Boolean.
     *
     * @param element
     * @return
     */
    protected Boolean waitToBeClickable(final WebElement element, int sec) {
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

    /**
     * Клик с скролом элемента.
     * @param element
     */
    public void clickWithScroll(WebElement element){
        scrollWithOffset(element, 0, 0);
        element.click();
    }


    /**
     * Клик.
     * @param element
     */
    public void click(WebElement element){
        waitVisibilityOfElement(element, sec);
        element.click();

    }

    /**
     * Метод для задержки в секундах.
     * @param sec
     */
    public void sleep(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для прокрутки до указанного элемента.
     * @param webElement до которого будет прокрутка страницы.
     */
    public void scrollToElement(WebElement webElement){
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();"
                ,webElement);
    }

    /**
     * Проскроллить страницу с заданным смещением от элемента
     * @param webElement
     * @param x
     * @param y
     */
    public void scrollWithOffset(WebElement webElement, int x, int y) {
        String code = "window.scroll(" + (webElement.getLocation().x + x) + ","
                + (webElement.getLocation().y + y) + ");";
        ((JavascriptExecutor)driver).executeScript(code, webElement, x, y);

    }

    /**
     * Добавить элементру атрибут.
     *
     * @param element Элемент, которому добавляется атрибут.
     * @param attr    Имя добавляемого атрибута.
     * @param value   Значение добавляемого атрибута.
     */
    public void setAttributesElement(final WebElement element, final String attr, final String value) {
        try {
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].setAttribute('"
                    + attr + "', '" + value + "');", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Добавить элементру атрибут.
     *
     * @param element Элемент, которому добавляется атрибут.
     * @param css    Имя добавляемого свойства.
     * @param value   Значение добавляемого атрибута.
     */
    public void setCSSProperty(final WebElement element, final String css, final String value) {
        try {
            ((JavascriptExecutor) getDriver()).executeScript("document.querySelector('" + element.getTagName()+"').style." + css + "='" + value+ "'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
