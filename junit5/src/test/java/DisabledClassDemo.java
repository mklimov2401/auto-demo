import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIf;

import static org.junit.jupiter.api.condition.JRE.JAVA_9;
import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.WINDOWS;

class DisabledClassDemo {

    @Disabled("Disabled until bug #42 has been resolved")
    @Test
    void testWillBeSkipped() {
    }


    @Test
    @DisabledForJreRange(min = JAVA_9)
    void testWillBeExecuted() {
        System.out.println("test");
    }

    @Test
    @EnabledIf("customCondition")
    void enabled() {
        System.out.println("true");
    }

    @Test
    @DisabledIf("customCondition")
    void disabled() {

        System.out.println("false");
    }

    boolean customCondition() {
        return false;
    }
}