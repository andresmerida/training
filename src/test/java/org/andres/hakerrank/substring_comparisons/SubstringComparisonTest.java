package org.andres.hakerrank.substring_comparisons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringComparisonTest {
    private final SubstringComparison substringComparison = new SubstringComparison();

    @Test
    void getSmallestAndLargest() {
        String input = "welcometojava";
        String expected = "ava_wel";
        assertEquals(expected, substringComparison.getSmallestAndLargest(input, 3));
    }
}