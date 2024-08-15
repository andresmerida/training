package org.andres.training.arrays.min_max;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {
    private MinMax minMax;

    @BeforeEach
    void setUp() {
        minMax = new MinMax();
    }

    @Test
    void getMinMaxValues_shouldReturnMinMaxValues() {
        var result = minMax.getMinMaxValues(new int[]{1,423,6,46,34,23,13,53,4});
        Map<String, Integer> expected = Map.ofEntries(
                Map.entry(MinMax.MIN_LITERAL_VALUE, 1),
                Map.entry(MinMax.MAX_LITERAL_VALUE, 423)
        );
        assertEquals(expected, result);
    }

    @Test
    void getMinMaxValues_shouldReturnMinMaxSameValue() {
        var result = minMax.getMinMaxValues(new int[]{1});
        Map<String, Integer> expected = Map.ofEntries(
                Map.entry(MinMax.MIN_LITERAL_VALUE, 1),
                Map.entry(MinMax.MAX_LITERAL_VALUE, 1)
        );
        assertEquals(expected, result);
    }

    @Test
    void getMinMaxValues_shouldReturnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> minMax.getMinMaxValues(null));
        assertTrue(exception.getMessage().contains("null"));
    }

    @Test
    void getMinMaxValuesSolution2_shouldReturnMinMaxValues() {
        var result = minMax.getMinMaxValuesSolution2(new int[]{1,423,6,46,34,23,13,53,4});
        Map<String, Integer> expected = Map.ofEntries(
                Map.entry(MinMax.MIN_LITERAL_VALUE, 1),
                Map.entry(MinMax.MAX_LITERAL_VALUE, 423)
        );
        assertEquals(expected, result);
    }

    @Test
    void getMinMaxValuesSolution2_shouldReturnMinMaxSameValue() {
        var result = minMax.getMinMaxValuesSolution2(new int[]{1});
        Map<String, Integer> expected = Map.ofEntries(
                Map.entry(MinMax.MIN_LITERAL_VALUE, 1),
                Map.entry(MinMax.MAX_LITERAL_VALUE, 1)
        );
        assertEquals(expected, result);
    }

    @Test
    void getMinValue_shouldReturnMinValue() {
        var result = minMax.getMinValue(new int[]{1,423,6,46,34,23,13,53,4});
        assertEquals(1, result);
    }

    @Test
    void getMaxValue_shouldReturnMaxValue() {
        var result = minMax.getMaxValue(new int[]{1,423,6,46,34,23,13,53,4});
        assertEquals(423, result);
    }

    @Test
    void getMinMaxValuesSolution3_shouldReturnMinMaxValues() {
        var result = minMax.getMinMaxValuesSolution3(new int[]{1,423,6,46,34,23,13,53,4});
        Map<String, Integer> expected = Map.ofEntries(
                Map.entry(MinMax.MIN_LITERAL_VALUE, 1),
                Map.entry(MinMax.MAX_LITERAL_VALUE, 423)
        );
        assertEquals(expected, result);
    }
}