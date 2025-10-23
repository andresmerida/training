package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberFinderTest {
    private final LargestNumberFinder finder = new LargestNumberFinder();

    @Test
    void largestNumber_oneElementTest() {
        int[] input = new int[] {1};
        int expected = 1;

        assertEquals(expected, finder.largestNumber(input));
    }

    @Test
    void largestNumberElementTest() {
        int[] input = new int[] {1,2,5,8,55,77,99,24,798,4,48};
        int expected = 798;

        assertEquals(expected, finder.largestNumber(input));
    }

    @Test
    void largestNumber_throwIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> finder.largestNumber(null));
    }
    @Test
    void largestNumber_throwNullPointerException_emptyArray() {
        assertThrows(IllegalArgumentException.class, () -> finder.largestNumber(new int[0]));
    }

    // with stream functions
    @Test
    void getMaxNumberElement_oneElementTest() {
        int[] input = new int[] {1};
        int expected = 1;

        assertEquals(expected, finder.getMaxNumberElement(input));
    }

    @Test
    void getMaxNumberElementTest() {
        int[] input = new int[] {1,2,5,8,55,77,99,24,798,4,48};
        int expected = 798;

        assertEquals(expected, finder.getMaxNumberElement(input));
    }

    @Test
    void getMaxNumberElement_throwIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> finder.getMaxNumberElement(null));
    }
    @Test
    void getMaxNumberElement_throwNullPointerException_emptyArray() {
        assertThrows(IllegalArgumentException.class, () -> finder.getMaxNumberElement(new int[0]));
    }
}