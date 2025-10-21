package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialClassTest {
    private final FactorialClass factorialClass = new FactorialClass();

    @Test
    void factorialTest() {
        long resultExpected = 120;
        assertEquals(resultExpected, factorialClass.factorial(5));
    }

    @Test
    void factorial_longResultTest() {
        long resultExpected = 479001600;
        assertEquals(resultExpected, factorialClass.factorial(12));
    }

    @Test
    void factorial_CeroTest() {
        long resultExpected = 1;
        assertEquals(resultExpected, factorialClass.factorial(0));
    }

    @Test
    void factorial_OneTest() {
        long resultExpected = 1;
        assertEquals(resultExpected, factorialClass.factorial(1));
    }

    @Test
    void factorial_NegativeNumberTest() {
        assertThrows(IllegalArgumentException.class, () -> factorialClass.factorial(-1));
    }
}