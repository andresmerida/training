package org.andres.training.hackerrank.anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {

    @Test
    void minNumberOfDeletions_thenReturnFour() {
        String str1 = "cde";
        String str2 = "abc";
        assertEquals(4, Anagrams.minNumberOfDeletions(str1, str2));
    }

    @Test
    void minNumberOfDeletions_thenReturnSix() {
        String str1 = "abc";
        String str2 = "amnop";
        assertEquals(6, Anagrams.minNumberOfDeletions(str1, str2));
    }

    @Test
    void makingAnagrams_thenReturnFour() {
        String str1 = "cde";
        String str2 = "abc";
        assertEquals(4, Anagrams.makingAnagrams(str1, str2));
    }

    @Test
    void makingAnagrams_thenReturnSix() {
        String str1 = "abc";
        String str2 = "amnop";
        assertEquals(6, Anagrams.makingAnagrams(str1, str2));
    }

}