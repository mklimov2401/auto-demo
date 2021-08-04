package com.demoqa.baseTest;

import org.junit.jupiter.api.Test;

/**
 * Класс с базовыми тестами ТК1-ТК3.
 */
public class BasicTest extends Base {


    /**
     * ТК1: Проверка стартовой страницы
     */
    @Test
    public void checkingStartPage() {
        openStartPage();
        checkingDisplayBlocks();
    }

    /**
     * ТК2: Проверка отображение блока Elements
     */
    @Test
    public void displayingBlockElements() {
        openBlockElements();
        checkingBlocksElements();
        checkingOtherBlocks();
    }

    /**
     * ТК3: Переходы по сайту
     */
    @Test
    public void siteNavigation() {
        navigationOnBlockElements();
        navigationOnBlockForms();
        navigationOnBlockAlerts();
    }




}
