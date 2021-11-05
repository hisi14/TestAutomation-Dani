import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        //Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        double result = calculator.add(a, b);
        assertEquals(3, result);
    }

    @Test
    void subtract() {
        int a = 2;
        int b = 3;
        //double subtract = calculator.subtract(b, a);
        //assertEquals(1, subtract);
        assertEquals(1, calculator.subtract(b, a));
    }

    @Test
    void multiply() {
        assertEquals(4, calculator.multiply(2, 2));
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void divide() {
        // Divisor != 0 returns always 0
        assertEquals(0, calculator.divide(2, 0));

        assertEquals(1, calculator.divide(2, 2));
        assertEquals(2, calculator.divide(2, 1));
    }

    @Test
    void modulo() {
        assertEquals(0, calculator.modulo(2, 2));
    }

    @Test
    void sum() {
        double[] values = {1.0, 2.0, 3.0};
        assertEquals(6, calculator.sum(values));
    }
}
