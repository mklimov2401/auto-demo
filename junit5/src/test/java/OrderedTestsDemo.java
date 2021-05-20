import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class OrderedTestsDemo {

    @Test
    @Order(2)
    void emptyValues() {
        // perform assertions against empty values
    }


    @Test
    @Order(2)
    void nullValues() {
        // perform assertions against null values
    }


    @Test
    @Order(7)
    void validValues() {
        // perform assertions against valid values
    }

}