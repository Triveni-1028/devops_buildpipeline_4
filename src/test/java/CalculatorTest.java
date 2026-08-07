import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(30, c.add(10,20));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, c.subtract(10,5));
    }
}
