package configurations;

import org.aeonbits.owner.Config;

/**
 * Интерфейс содержащий главные настройки фраймворка.
 */
public interface GeneralConfig extends Config {
    int port();
    String hostname();
    @DefaultValue("42")
    int maxThreads();
    String xxx();
}
