import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstHomeWorkTest {

    private FirstHomeWork firstHomeWork;

    @BeforeEach
    void init() {
        firstHomeWork = new FirstHomeWork();
    }

    @ParameterizedTest
    @MethodSource("provideSleepySloth")
    void sleepySlothTest(int height, int expected) {
        assertEquals(firstHomeWork.sleepySloth(height), expected);
    }

    @ParameterizedTest
    @MethodSource("provideSumOfNumbers")
    void summOfNumberTest(int number, int expected) {
        assertEquals(firstHomeWork.summOfNumber(number), expected);
    }

    @ParameterizedTest
    @MethodSource("provideFactorialTest")
    void factorialTest(int n, int expected) {
        assertEquals(firstHomeWork.factorial(n), expected);
    }

    @ParameterizedTest
    @MethodSource("provideReverseStringTest")
    void reverseStringTest(String str, String expected) {
        assertEquals(firstHomeWork.reverseString(str), expected);
    }

    @ParameterizedTest
    @MethodSource("provideSumOfFibonacciTest")
    void sumOfFibonacciTest(int n, int expected) {
        assertEquals(firstHomeWork.sumOfFibonacci(n), expected);
    }

    private static Stream<Arguments> provideSleepySloth() {
        return Stream.of(
                Arguments.of(-100, 0),
                Arguments.of(0, 0),
                Arguments.of(1000, 49),
                Arguments.of(10000, 499)
        );
    }

    private static Stream<Arguments> provideSumOfNumbers() {
        return Stream.of(
                Arguments.of(-100, 0),
                Arguments.of(0, 0),
                Arguments.of(123, 6),
                Arguments.of(555, 15)
        );
    }

    private static Stream<Arguments> provideFactorialTest() {
        return Stream.of(
                Arguments.of(-100, 0),
                Arguments.of(0, 0),
                Arguments.of(5, 120)
        );
    }

    private static Stream<Arguments> provideReverseStringTest() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of(" ", ""),
                Arguments.of("java", "avaj"),
                Arguments.of("nikita", "atikin")
        );
    }

    private static Stream<Arguments> provideSumOfFibonacciTest() {
        return Stream.of(
                Arguments.of(-100, 0),
                Arguments.of(0, 0),
                Arguments.of(5, 12),
                Arguments.of(100, 1445263495)
        );
    }
}
