import configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class Expirence {

    @Test
    public void testOwner(){
        GeneralConfig cfg = ConfigFactory.create(GeneralConfig.class);
        System.out.println(cfg.hostname() + " " +  cfg.env());
    }
}
