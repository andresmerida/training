package org.andres.training.coding_questions.odd_even;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenTest {
    private final OddEven oddEven = new OddEven();

    @Test
    void isEven_shouldReturnTrue() {
        assertTrue(oddEven.isEven(2));
    }

    @Test
    void isEven_shouldReturnFalse() {
        assertFalse(oddEven.isEven(3));
    }
}