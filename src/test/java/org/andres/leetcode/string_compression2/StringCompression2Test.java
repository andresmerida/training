package org.andres.leetcode.string_compression2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompression2Test {

    private final StringCompression2 stringCompressionInstance = new StringCompression2();

    @Test
    void getStringCompressionTreeDifferentChars() {
        char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        String stringCompressionExpected = "a2b2c3";
        assertEquals(stringCompressionExpected, stringCompressionInstance.getStringCompression(input));
    }

    @Test
    void getStringCompressionOneCharacter() {
        char[] input = {'a'};
        String stringCompressionExpected = "a";
        assertEquals(stringCompressionExpected, stringCompressionInstance.getStringCompression(input));
    }

    @Test
    void getStringCompressionWithOneCharacterAndOthersWords() {
        char[] input = {'a','b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        String stringCompressionExpected = "ab12";
        assertEquals(stringCompressionExpected, stringCompressionInstance.getStringCompression(input));
    }
}