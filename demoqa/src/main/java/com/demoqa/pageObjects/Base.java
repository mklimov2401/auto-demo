package com.demoqa.pageObjects;

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
}
