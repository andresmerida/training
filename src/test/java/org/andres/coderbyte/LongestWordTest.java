package org.andres.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestWordTest {
    private final LongestWord longestWord = new LongestWord();

    @Test
    void getLongestWordWithIteratingTest() {
        String input = "The longest word is: several";
        String expected = "longest";

        assertEquals(expected, longestWord.getLongestWordWithIterating(input));
    }

    @Test
    void getLongestWordWithIterating_emptyString_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> longestWord.getLongestWordWithIterating(""));
    }

    @Test
    void getLongestWordWithIterating_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> longestWord.getLongestWordWithIterating(null));
    }

    @Test
    void getLongestWordWithStreamsTest() {
        String input = "The longest word is: several";
        String expected = "longest";

        assertEquals(expected, longestWord.getLongestWordWithStreams(input));
    }

    @Test
    void getLongestWordWithStreams_emptyString_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> longestWord.getLongestWordWithStreams(""));
    }

    @Test
    void getLongestWordWithStreams_null_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> longestWord.getLongestWordWithStreams(null));
    }
}