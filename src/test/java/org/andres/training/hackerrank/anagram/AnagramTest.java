package org.andres.training.hackerrank.anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    public void givenAnagram_thenReturnZero() {
        String anagramInput = "xyyx";
        int actualMinValue = Anagram.minChangeToAnagram(anagramInput);
        int expected = 0;
        assertEquals(actualMinValue, expected);
    }

    @Test void givenMinOneToBeAnagram_thenReturnOne() {
        String input = "xaxbbbxx";
        assertEquals(1, Anagram.minChangeToAnagram(input));
    }

    @Test void givenDifferentLength_thenReturnOneNegative() {
        String input = "abc";
        assertEquals(-1, Anagram.minChangeToAnagram(input));
    }

    @Test void givenMinOneToBeAnagram2_thenReturnZero() {
        String input = "xyyx";
        assertEquals(0, Anagram.minChangeToAnagram2(input));
    }
    @Test void givenMinOneToBeAnagram2_thenReturnOne() {
        String input = "xaxbbbxx";
        assertEquals(1, Anagram.minChangeToAnagram2(input));
    }

    @Test void givenDifferentLength2_thenReturnOneNegative() {
        String input = "abc";
        assertEquals(-1, Anagram.minChangeToAnagram2(input));
    }
}