package org.andres.training.coderbyte.first_factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstFactorialTest {
    private final FirstFactorial firstFactorial = new FirstFactorial();

    @Test
    void firstFactorial_when_input_is_4() {
        int result = firstFactorial.firstFactorial(4);
        assertEquals(24, result);
    }

    @Test
    void firstFactorial_when_input_illegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> firstFactorial.firstFactorial(20));
        assertTrue(exception.getMessage().contains("Invalid number:"));
    }
}