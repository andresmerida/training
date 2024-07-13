package org.andres.training.hackerrank.find_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDigitsTest {
    private final FindDigits findDigits = new FindDigits();

    @Test
    void findDigits_positiveValue() {
        int result = findDigits.findDigits(124);
        assertEquals(3, result);
    }

    @Test
    void findDigits_withZeroValue() {
        int result = findDigits.findDigits(10);
        assertEquals(1, result);
    }

    @Test
    void findDigits_ThrowIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> findDigits.findDigits(0)
        );

        assertEquals("n must greater than 0", exception.getMessage());
    }
}