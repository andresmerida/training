package org.andres.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    private final RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    void removeDuplicates() {
        Integer[] input = {1, 1, 2, 3, 2, 4, 3, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, removeDuplicates.removeDuplicates(input));
    }

    @Test
    void removeDuplicates_null() {
        assertThrows(IllegalArgumentException.class, () -> removeDuplicates.removeDuplicates(null));
    }

    @Test
    void removeDuplicatesWithStreams() {
        Integer[] input = {1, 1, 2, 3, 2, 4, 3, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, removeDuplicates.removeDuplicatesWithStreams(input));
    }

    @Test
    void removeDuplicatesWithStreams_null() {
        assertThrows(IllegalArgumentException.class, () -> removeDuplicates.removeDuplicatesWithStreams(null));
    }
}