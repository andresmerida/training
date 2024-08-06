package org.andres.training.coding_questions.anagram_string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramStringTest {
    private AnagramString anagramString;

    @BeforeEach
    void setUp() {
        anagramString = new AnagramString();
    }

    @Test
    void areAnagram_shouldReturnTrue() {
        assertTrue(anagramString.areAnagram2("listen", "silent"));
    }

    @Test
    void areAnagram_shouldReturnFalse() {
        assertFalse(anagramString.areAnagram2("andres", "merida"));
    }

    @Test
    void areAnagram_shouldReturnFalse_withNullValue() {
        assertFalse(anagramString.areAnagram2(null, "merida"));
    }

    @Test
    void areAnagram_shouldReturnFalse_withDifferentLength() {
        assertFalse(anagramString.areAnagram2("andreas", "andres"));
    }

    @Test
    void areAnagram2_shouldReturnTrue() {
        assertTrue(anagramString.areAnagram2("listen", "silent"));
    }

    @Test
    void areAnagram2_shouldReturnFalse() {
        assertFalse(anagramString.areAnagram2("andres", "merida"));
    }

    @Test
    void areAnagram2_shouldReturnFalse_withNullValue() {
        assertFalse(anagramString.areAnagram2(null, "merida"));
    }

    @Test
    void areAnagram2_shouldReturnFalse_withDifferentLength() {
        assertFalse(anagramString.areAnagram2("andreas", "andres"));
    }
}