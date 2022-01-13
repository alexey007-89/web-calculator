package pro.sky.java.course2.webcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    void plusIsCorrect() {
        assertEquals(5, out.plus(2,3));
        assertEquals(8, out.plus(6,2));
    }

    @Test
    void minusIsCorrect() {
        assertEquals(3, out.minus(8,5));
        assertEquals(20, out.minus(70,50));
    }

    @Test
    void divideIsCorrect() {
        assertEquals(5, out.divide(20,4));
        assertEquals(3, out.divide(27,9));
    }

    @Test
    void divideShouldThrowIllegalArgumentExceptionWhenNum2ContainsNull() {
        assertThrows(IllegalArgumentException.class, () -> out.divide(5, 0));
        assertThrows(IllegalArgumentException.class, () -> out.divide(8, 0));
    }

    @Test
    void multiplyIsCorrect() {
        assertEquals(40, out.multiply(10,4));
        assertEquals(22, out.multiply(11,2));
    }
}