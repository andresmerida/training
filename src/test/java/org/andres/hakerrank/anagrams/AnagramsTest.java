package org.andres.hakerrank.anagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {
    private final Anagrams anagrams = new Anagrams();

    @Test
    void areAnagrams_shouldReturnTrue() {
        String s1 = "silent";
        String s2 = "listen";
        assertTrue(anagrams.areAnagrams(s1, s2));
    }

    @Test
    void areAnagrams_shouldReturnTrueWithSpaces() {
        String s1 = "dormitory";
        String s2 = "dirty room";
        assertTrue(anagrams.areAnagrams(s1, s2));
    }

    @Test
    void areAnagrams_shouldReturnFalse() {
        String s1 = "silents";
        String s2 = "listen";
        assertFalse(anagrams.areAnagrams(s1, s2));
    }

    @Test
    void isAnagramHashing_shouldReturnTrue() {
        String s1 = "silent";
        String s2 = "listen";
        assertTrue(anagrams.isAnagramHashing(s1, s2));
    }

    @Test
    void isAnagramHashing_shouldReturnTrueWithSpaces() {
        String s1 = "dormitory";
        String s2 = "dirty room";
        assertTrue(anagrams.isAnagramHashing(s1, s2));
    }

    @Test
    void isAnagramHashing_shouldReturnFalse() {
        String s1 = "silents";
        String s2 = "listen";
        assertFalse(anagrams.isAnagramHashing(s1, s2));
    }

    @Test
    void isAnagramSorting_shouldReturnTrue() {
        String s1 = "silent";
        String s2 = "listen";
        assertTrue(anagrams.isAnagramSorting(s1, s2));
    }

    @Test
    void isAnagramSorting_shouldReturnTrueWithSpaces() {
        String s1 = "dormitory";
        String s2 = "dirty room";
        assertTrue(anagrams.isAnagramSorting(s1, s2));
    }

    @Test
    void isAnagramSorting_shouldReturnFalse() {
        String s1 = "silents";
        String s2 = "listen";
        assertFalse(anagrams.isAnagramSorting(s1, s2));
    }
}