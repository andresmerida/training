package org.andres.training.coding_questions.palindrome_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void isPalindrome_shouldReturnTrue_oneDigit() {
        assertTrue(palindromeNumber.isPalindrome(1));
    }

    @Test
    void isPalindrome_shouldReturnTrue_twoDigits() {
        assertTrue(palindromeNumber.isPalindrome(33));
    }

    @Test
    void isPalindrome_shouldReturnTrue_threeDigits() {
        assertTrue(palindromeNumber.isPalindrome(191));
    }

    @Test
    void isPalindrome_shouldReturnTrue_fiveDigits() {
        assertTrue(palindromeNumber.isPalindrome(16461));
    }

    @Test
    void isPalindrome_shouldReturnFalse() {
        assertFalse(palindromeNumber.isPalindrome(13));
    }

    @Test
    void isPalindrome_shouldReturnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> palindromeNumber.isPalindrome(-1));
        assertTrue(exception.getMessage().contains("negative"));
    }
}