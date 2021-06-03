import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;


public class SimpleTest {
    Calc calc = new Calc();

    @BeforeClass
    public void setUp() {
        System.out.println("Before class");
    }


    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("Fast test");
        Calc calculator = new Calc();
        assertEquals (3, calculator.add(2,1));
    }

    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("Slow test");
        Calc calculator = new Calc();
        assertEquals (4, calculator.add(2,2));
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(5, calc.sum(2,3));
    }

}
