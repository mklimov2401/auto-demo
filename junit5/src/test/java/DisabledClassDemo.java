import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DisabledClassDemo {

    @Disabled("Disabled until bug #42 has been resolved")
    @Test
    void testWillBeSkipped() {
    }

    @Test
    void testWillBeExecuted() {
    }
}