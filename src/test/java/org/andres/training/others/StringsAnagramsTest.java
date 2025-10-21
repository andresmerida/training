package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsAnagramsTest {
    private final   StringsAnagrams stringsAnagrams = new StringsAnagrams();

    @Test
    void isAnagramFalse() {
        assertFalse(stringsAnagrams.isAnagram("abcd", "abc"));
    }

    @Test
    void isAnagramTrue() {
        assertTrue(stringsAnagrams.isAnagram("listen", "silent"));
    }

    @Test
    void isAnagramThrowIllegalArgumentException_Null() {
        assertThrows(IllegalArgumentException.class, () -> stringsAnagrams.isAnagram(null, null));
    }

    @Test
    void isAnagramThrowIllegalArgumentException_EmptyString() {
        assertThrows(IllegalArgumentException.class, () -> stringsAnagrams.isAnagram("", ""));
    }

    @Test
    void isAnagramSolution2True() {
        assertTrue(stringsAnagrams.isAnagram("listen", "silent"));
    }

    @Test
    void isAnagramSolution2False() {
        assertFalse(stringsAnagrams.isAnagram("abcd", "abc"));
    }
}