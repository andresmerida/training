package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {
    private final PalindromeChecker checker = new PalindromeChecker();

    @Test
    void isPalindromeWithIndex_Yes() {
        assertTrue(checker.isPalindromeWithIndex("Madam"));
    }

    @Test
    void isPalindromeWithIndex_No() {
        assertFalse(checker.isPalindromeWithIndex("hello"));
    }

    @Test
    void isPalindromeWithIndex_ThrowIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> checker.isPalindromeWithIndex(null));
    }

    @Test
    void isPalindromeWithIndex_ThrowIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> checker.isPalindromeWithIndex(""));
    }

    @Test
    void isPalindromeWithStringBuilder_Yes() {
        assertTrue(checker.isPalindromeWithStringBuilder("Racecar"));
    }

    @Test
    void isPalindromeWithStringBuilder_No() {
        assertFalse(checker.isPalindromeWithStringBuilder("Hello world"));
    }
}