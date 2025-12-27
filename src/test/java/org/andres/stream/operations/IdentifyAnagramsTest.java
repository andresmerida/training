package org.andres.stream.operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IdentifyAnagramsTest {
    private final IdentifyAnagrams identifyAnagrams = new IdentifyAnagrams();
    private String[] words;

    @BeforeEach
    void setUp() {
        words = new String[]{"listen", "silent", "enlist", "inlets", "google", "gooogle"};
    }

    @Test
    void identifyAnagrams() {
        int expected = 4;
        List<String> list = identifyAnagrams.identifyAnagrams(words).get("eilnst");
        assertEquals(expected, list.size());
    }

    @Test
    void identifyAnagramsTest() {
        int expected = 4;
        List<String> list = identifyAnagrams.identifyAnagramsWithStreams(words).get("eilnst");
        assertEquals(expected, list.size());
    }
}