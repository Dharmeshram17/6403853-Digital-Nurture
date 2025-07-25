import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
public class Exercise_4_AAA_Pattern_JUnit {
    private Calculator calculator;
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator initialized");
    }
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator cleaned up");
    }
    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int result = calculator.add(a, b);
        assertEquals(8, result);
    }
    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 4;
        int result = calculator.subtract(a, b);
        assertEquals(6, result);
    }
}
