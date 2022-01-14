package pro.sky.java.course2.webcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    void plusIsCorrect() {
        assertEquals(-2, out.plus(0,-2));
        assertEquals(0, out.plus(6,-6));
    }

    @Test
    void minusIsCorrect() {
        assertEquals(-5, out.minus(0,5));
        assertEquals(-40, out.minus(-20,20));
    }

    @Test
    void divideIsCorrect() {
        assertEquals(5, out.divide(-20,-4));
        assertEquals(0, out.divide(0,9));
    }

    @Test
    void divideShouldThrowIllegalArgumentExceptionWhenNum2ContainsNull() {
        assertThrows(IllegalArgumentException.class, () -> out.divide(5, 0));
        assertThrows(IllegalArgumentException.class, () -> out.divide(-8, 0));
    }

    @Test
    void multiplyIsCorrect() {
        assertEquals(-40, out.multiply(10,-4));
        assertEquals(0, out.multiply(0,2));
    }
}