package org.andres.training.coding_questions.reverse_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {
    private final ReverseNumber reverseNumber = new ReverseNumber();

    @Test
    void reverseNumber_test() {
        var result = reverseNumber.reverseNumber(2024);
        assertEquals(4202, result);
    }

    @Test
    void reverseNumber_test_twelve() {
        var result = reverseNumber.reverseNumber(12);
        assertEquals(21, result);
    }

    @Test
    void reverseNumber_less_than_eleven() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> reverseNumber.reverseNumber(10));
        assertTrue(exception.getMessage().contains("number must be greater than ten"));
    }
}