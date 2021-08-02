package com.demoqa.matchers;

import static org.assertj.core.api.Assertions.*;

/**
 * Класс для проверок.
 */
public class Assert {

    /**
     * Проверяем что булевое значение true.
     * @param value
     */
    public static void assertTrue(Boolean value){
        assertThat(value).isTrue();
    }

    /**
     * Проверяем что булевое значение false.
     * @param value
     */
    public static void assertFalse(Boolean value){
        assertThat(value).isFalse();
    }

    /**
     * Проверяем равно ли actual и expected.
     * @param actual актуальное значение.
     * @param expected ожидаемое значение.
     */
    public static void assertEquals(String actual, String expected){
        assertThat(actual).isEqualTo(expected);
    }
}
