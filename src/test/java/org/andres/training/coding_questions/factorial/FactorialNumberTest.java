package org.andres.training.coding_questions.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialNumberTest {
    private final FactorialNumber factorialNumber = new FactorialNumber();

    @Test
    void getFactorial_shouldReturnCorrectNumber() {
        var result = factorialNumber.getFactorial(3);
        assertEquals(6, result);
    }

    @Test
    void getFactorial_shouldReturnOne() {
        var result = factorialNumber.getFactorial(0);
        assertEquals(1, result);
    }

    @Test
    void getFactorial_shouldReturnDifferentNumber() {
        var result = factorialNumber.getFactorial(4);
        assertNotEquals(25, result);
    }

    @Test
    void getFactorial_shouldReturnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> factorialNumber.getFactorial(-1));
        assertTrue(exception.getMessage().contains("Negative numbers not allowed"));
    }
}