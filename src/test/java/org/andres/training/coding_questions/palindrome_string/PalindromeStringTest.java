package org.andres.training.coding_questions.palindrome_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeStringTest {
    private final PalindromeString palindromeString;

    PalindromeStringTest() {
        this.palindromeString = new PalindromeString();
    }


    @Test
    void isPalindrome_shouldReturnTrue() {
        assertTrue(palindromeString.isPalindrome("aba"));
    }

    @Test
    void isPalindrome_shouldReturnFalse() {
        assertFalse(palindromeString.isPalindrome("andres"));
    }

    @Test
    void isPalindrome2_shouldReturnTrue() {
        assertTrue(palindromeString.isPalindrome2("aba"));
    }

    @Test
    void isPalindrome2_shouldReturnFalse() {
        assertFalse(palindromeString.isPalindrome("andres"));
    }

    @Test
    void isPalindrome2_shouldReturnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> palindromeString.isPalindrome2(null));
        assertTrue(exception.getMessage().contains("null"));
    }
}