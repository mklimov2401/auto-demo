import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstJUnitJupiterTests {

    @Test
    void addition(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2, calculator.add(1,1));
    }
}
