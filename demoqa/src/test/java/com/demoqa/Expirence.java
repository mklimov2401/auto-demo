package com.demoqa;

import configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Expirence  extends TestCaseBase {

    @Test
    public void testOwner(){
        GeneralConfig cfg = ConfigFactory.create(GeneralConfig.class);
        System.out.println(cfg.hostname() + " " +  cfg.env());

        assertThat(cfg.env()).withFailMessage("Проверка конфига").hasSize(5)
                .isEqualTo("prod");
    }

    @Test
    public void testBrowser(){
        driver.navigate().to(getConfig().hostname());
    }
}
