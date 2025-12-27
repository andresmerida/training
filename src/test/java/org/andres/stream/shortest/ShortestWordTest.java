package org.andres.stream.shortest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShortestWordTest {
    private final ShortestWord shortestWord = new ShortestWord();
    private final String[] words = {"apple", "banana", "cherry", "date", "fig", "grapefruit", "kiwi"};

    @Test
    void findShortestWordArrayTest() {
        assertEquals("fig", shortestWord.findShortestWord(words));
    }

    @Test
    void findShortestWordListTest() {
        assertEquals("fig", shortestWord.findShortestWord(Arrays.asList(words)));
    }
}