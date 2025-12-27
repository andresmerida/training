package org.andres.stream.shortest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageLengthWordTest {
    private final AverageLengthWord averageLengthWord = new AverageLengthWord();
    private final String[] words = {"apple", "banana", "cherry", "date", "fig", "grapefruit", "kiwi"};

    @Test
    void averageLength() {
        assertEquals(5.428571428571429, averageLengthWord.averageLength(words));
    }

    @Test
    void averageLengthList() {
        assertEquals(5.428571428571429, averageLengthWord.averageLengthSolution(Arrays.asList(words)));
    }
}