package pro.sky.java.course2.webcalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceParameterizedTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForPlus")
    void plusIsCorrect(int num1, int num2, int expected) {
        assertEquals(expected, out.plus(num1, num2));
    }

    public static Stream<Arguments> provideParamsForPlus() {
        return Stream.of(
                Arguments.of(2, 3, 5),
                Arguments.of(4, 5, 9),
                Arguments.of(7, 8, 15),
                Arguments.of(10, 11, 21)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinus")
    void minusIsCorrect(int num1, int num2, int expected) {
        assertEquals(expected, out.minus(num1, num2));
    }

    public static Stream<Arguments> provideParamsForMinus() {
        return Stream.of(
                Arguments.of(5, 3, 2),
                Arguments.of(10, 5, 5),
                Arguments.of(8, 6, 2),
                Arguments.of(111, 11, 100)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivide")
    void divideIsCorrect(int num1, int num2, int expected) {
        assertEquals(expected, out.divide(num1, num2));
    }

    public static Stream<Arguments> provideParamsForDivide() {
        return Stream.of(
                Arguments.of(9, 3, 3),
                Arguments.of(50, 10, 5),
                Arguments.of(65, 5, 13),
                Arguments.of(216, 8, 27)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiply")
    void multiplyIsCorrect(int num1, int num2, int expected) {
        assertEquals(expected, out.multiply(num1, num2));
    }

    public static Stream<Arguments> provideParamsForMultiply() {
        return Stream.of(
                Arguments.of(2, 5, 10),
                Arguments.of(11, 3, 33),
                Arguments.of(100, 8, 800),
                Arguments.of(111, 11, 1221)
        );
    }
}