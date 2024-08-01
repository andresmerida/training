package org.andres.training.coding_questions.sum_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDigitsTest {
    private final SumDigits sumDigits = new SumDigits();

    @Test
    void sumDigits_shouldReturnCorrectSumDigits() {
        assertEquals(10, sumDigits.sumDigits(1234));
    }

    @Test
    void sumDigits_shouldReturnNonEquals() {
        assertNotEquals(20, sumDigits.sumDigits(1234));
    }

    @Test
    void sumDigits_shouldReturnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> sumDigits.sumDigits(-2));
        assertTrue(exception.getMessage().contains("non-negative"));
    }
}