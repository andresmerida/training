package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumElementsTest {
    private final SumElements sumElements = new SumElements();

    @Test
    void sum_OneElementTest() {
        int[] input = new int[]{1};
        int expected = 1;
        assertEquals(expected, sumElements.sum(input));
    }

    @Test
    void sum_ThreeElementsTest() {
        int[] input = new int[]{1,2,3};
        int expected = 6;
        assertEquals(expected, sumElements.sum(input));
    }

    @Test
    void sum_FiveElementsTest() {
        int[] input = new int[]{15,12,13,10,1};
        int expected = 51;
        assertEquals(expected, sumElements.sum(input));
    }

    @Test
    void sum_throwIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> sumElements.sum(null));
    }

    @Test
    void sum_throwIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> sumElements.sum(new int[0]));
    }

    @Test
    void sumWithStream_OneElementTest() {
        int[] input = new int[]{5};
        int expected = 5;
        assertEquals(expected, sumElements.sumWithStream(input));
    }

    @Test
    void sumWithStream_ThreeElementsTest() {
        int[] input = new int[]{1,2,3};
        int expected = 6;
        assertEquals(expected, sumElements.sumWithStream(input));
    }

    @Test
    void sumWithStream_FiveElementsTest() {
        int[] input = new int[]{15,12,13,10,1};
        int expected = 51;
        assertEquals(expected, sumElements.sumWithStream(input));
    }

    @Test
    void sumWithStream_throwIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> sumElements.sumWithStream(null));
    }

    @Test
    void sumWithStream_throwIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> sumElements.sumWithStream(new int[0]));
    }
}