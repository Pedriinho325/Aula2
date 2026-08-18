import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.subtract(3, 2));
    }
}