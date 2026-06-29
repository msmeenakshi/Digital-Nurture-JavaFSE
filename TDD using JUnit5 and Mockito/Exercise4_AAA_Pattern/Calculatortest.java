import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {

        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    @After
    public void tearDown() {

        System.out.println("Cleanup completed");
    }

    @Test
    public void testMultiply() {

        // Arrange
        int a = 4;
        int b = 5;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(20, result);
    }
}