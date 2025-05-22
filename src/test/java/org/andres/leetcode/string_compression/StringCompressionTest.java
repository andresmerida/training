package org.andres.leetcode.string_compression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    private final StringCompression stringCompression = new StringCompression();

    @Test
    public void testStringCompressionRepeatedChars() {
        char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
         int expected = 6;
         int actual = stringCompression.compress(input);
         assertEquals(expected, actual);
    }

    @Test
    public void testStringCompressionNoRepeatedChars() {
        char[] input = {'a', 'b', 'c'};
        int expected = 3;
        int actual = stringCompression.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testStringCompressionExceedLength() {
        char[] input = new char[10000];
        assertThrows(IllegalArgumentException.class, () -> stringCompression.compress(input));
    }
}