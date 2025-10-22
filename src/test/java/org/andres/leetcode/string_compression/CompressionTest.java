package org.andres.leetcode.string_compression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompressionTest {
    private final Compression compression = new Compression();

    @Test
    void compressForThreeCharacters() {
        // Input: chars = ["a","a","b","b","c","c","c"]
        assertEquals(6, compression.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

    @Test
    void compressForOneCharacter() {
        // Input: chars = ["a"]
        assertEquals(1, compression.compress(new char[]{'a'}));
    }

    @Test
    void compressForTwoCharacters() {
        // Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
        assertEquals(4, compression.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }

    @Test
    void compressThrowIllegalArgumentException() {
        // Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
        Assertions.assertThrows(IllegalArgumentException.class, () -> compression.compress(new char[]{}));
    }
}