package org.andres.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    final Palindrome palindrome = new Palindrome();

    @Test
    void isPalindromeUsingTwoPointers_ReturnTrue() {
        String input = "reconocer";
        assertTrue(palindrome.isPalindromeUsingTwoPointers(input));
    }

    @Test
    void isPalindromeUsingTwoPointers_ReturnFalse() {
        String input = "reconocer1";
        assertFalse(palindrome.isPalindromeUsingTwoPointers(input));
    }

    @Test
    void isPalindromeUsingTwoPointersWithBlankCharacters_ReturnTrue() {
        String input = "Anita lava la tina";
        assertTrue(palindrome.isPalindromeUsingTwoPointers(input));
    }

    @Test
    void isPalindromeUsingTwoPointers_ThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> palindrome.isPalindromeUsingTwoPointers(null));
    }

    @Test
    void isPalindromeUsingStringBuilder_returnTrue() {
        String input = "reconocer";
        assertTrue(palindrome.isPalindromeUsingStringBuilder(input));
    }

    @Test
    void isPalindromeUsingStringBuilder_returnFalse() {
        String input = "reconocer1";
        assertFalse(palindrome.isPalindromeUsingStringBuilder(input));
    }

    @Test
    void isPalindromeUsingStringBuilderWithBlankSpaces_returnTrue() {
        String input = "Anita lava la tina";
        assertTrue(palindrome.isPalindromeUsingStringBuilder(input));
    }

    @Test
    void isPalindromeUsingStringBuilder_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> palindrome.isPalindromeUsingStringBuilder(null));
    }

    @Test
    void isAlphaNumericValues_returnTrue() {
        String input = "Any123";
        assertTrue(palindrome.isAlphaNumericValues(input));
    }

    @Test
    void isAlphaNumericValues_returnFalse() {
        String input = "Any1234@";
        assertFalse(palindrome.isAlphaNumericValues(input));
    }

    @Test
    void isAlphaNumericValues_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> palindrome.isAlphaNumericValues(null));
    }
}