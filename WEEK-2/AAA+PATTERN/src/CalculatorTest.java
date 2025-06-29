import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange: Create a new Calculator instance before each test
        calculator = new Calculator();
        System.out.println("Setup: Calculator instance created.");
    }

    @After
    public void tearDown() {
       
        calculator = null;
        System.out.println("Teardown: Calculator instance cleared.");
    }
    @Test
    public void testAddition() {
        
        int result = calculator.add(10, 5);

        assertEquals(15, result);
    }
    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }
}
