package com.demoqa.matchers;

import static org.assertj.core.api.Assertions.*;

/**
 * Класс для проверок.
 */
public class Assert {

    public static void assertTrue(Boolean b){
        assertThat(b).isTrue();
    }
}
