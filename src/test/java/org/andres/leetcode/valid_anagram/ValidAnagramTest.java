package org.andres.leetcode.valid_anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void isAnagram_trueExample1() {
        String s = "listen";
        String t = "silent";

        assertTrue(validAnagram.isAnagram(s, t));
    }

    @Test
    void isAnagram_trueExample2() {
        String s = "heart";
        String t = "earth";

        assertTrue(validAnagram.isAnagram(s, t));
    }

    @Test
    void isAnagram_falseExample() {
        String s = "andres";
        String t = "merida";

        assertFalse(validAnagram.isAnagram(s, t));
    }

    @Test
    void isAnagram_throwIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> validAnagram.isAnagram(null, "test"));
    }

    @Test
    void isAnagram_throwIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> validAnagram.isAnagram("", ""));
    }

    @Test
    void isAnagram_throwIllegalArgumentException_Uppercases() {
        String s = "Listen";
        String t = "Silent";
        assertThrows(IllegalArgumentException.class, () -> validAnagram.isAnagram(s, t));
    }

    // Second solution
    @Test
    void isAnagramSolutionTwo_trueExample1() {
        String s = "listen";
        String t = "silent";

        assertTrue(validAnagram.isAnagramSolutionTwo(s, t));
    }

    @Test
    void isAnagramSolutionTwo_trueExample2() {
        String s = "heart";
        String t = "earth";

        assertTrue(validAnagram.isAnagramSolutionTwo(s, t));
    }

    @Test
    void isAnagramSolutionTwo_falseExample() {
        String s = "andres";
        String t = "merida";

        assertFalse(validAnagram.isAnagramSolutionTwo(s, t));
    }
}
