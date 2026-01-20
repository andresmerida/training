package org.andres.coderbyte;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinTest {
    private final MaxMin maxMin = new MaxMin();

    @Test
    void getMaxAndMin() {
        Integer[] input = {1,2,20,3,4,-1,5};
        Map<String, Integer> expected = Map.of("Max", 20, "Min", -1);

        assertEquals(expected, maxMin.getMaxAndMin(input));
    }

    @Test
    void getMaxAndMin_size_1() {
        Integer[] input = {2};
        Map<String, Integer> expected = Map.of("Max", 2, "Min", 2);

        assertEquals(expected, maxMin.getMaxAndMin(input));
    }

    @Test
    void getMaxAndMin_emptyArray() {
        assertThrows(IllegalArgumentException.class, () -> maxMin.getMaxAndMin(new Integer[0]));
    }

    @Test
    void getMaxAndMin_nullArray() {
        assertThrows(IllegalArgumentException.class, () -> maxMin.getMaxAndMin(null));
    }

    @Test
    void getMaxAndMinWithStreams() {
        Integer[] input = {1,2,20,3,4,-1,5};
        Map<String, Integer> expected = Map.of("Max", 20, "Min", -1);

        assertEquals(expected, maxMin.getMaxAndMinWithStreams(input));
    }

    @Test
    void getMaxAndMinWithStreams_size_1() {
        Integer[] input = {2};
        Map<String, Integer> expected = Map.of("Max", 2, "Min", 2);

        assertEquals(expected, maxMin.getMaxAndMinWithStreams(input));
    }

    @Test
    void getMaxAndMinWithStreams_emptyArray() {
        assertThrows(IllegalArgumentException.class, () -> maxMin.getMaxAndMinWithStreams(new Integer[0]));
    }

    @Test
    void getMaxAndMinWithStreams_nullArray() {
        assertThrows(IllegalArgumentException.class, () -> maxMin.getMaxAndMinWithStreams(null));
    }
}