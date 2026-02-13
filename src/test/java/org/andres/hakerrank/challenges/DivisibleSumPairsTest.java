package org.andres.hakerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleSumPairsTest {
    private final DivisibleSumPairs divisibleSumPairs = new DivisibleSumPairs();

    @Test
    void divisibleSumPairs_shouldReturnThree() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        int k = 5;
        int expected = 3;

        assertEquals(expected, divisibleSumPairs.divisibleSumPairs(k, list));
    }

    @Test
    void divisibleSumPairs_shouldReturnFive() {
        List<Integer> list = Arrays.asList(1,3,2,6,1,2);
        int k = 3;
        int expected = 5;

        assertEquals(expected, divisibleSumPairs.divisibleSumPairs(k, list));
    }

    @Test
    void divisibleSumPairs_invalidInput() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        int k = 101;

        assertThrows(IllegalArgumentException.class, () -> divisibleSumPairs.divisibleSumPairs(k, list));
    }

    @Test
    void divisibleSumPairsEfficient_shouldReturnThree() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        int k = 5;
        int expected = 3;

        assertEquals(expected, divisibleSumPairs.divisibleSumPairsEfficient(k, list));
    }

    @Test
    void divisibleSumPairsEfficient_shouldReturnFive() {
        List<Integer> list = Arrays.asList(1,3,2,6,1,2);
        int k = 3;
        int expected = 5;

        assertEquals(expected, divisibleSumPairs.divisibleSumPairsEfficient(k, list));
    }

    @Test
    void divisibleSumPairsEfficient_invalidInput() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        int k = 101;

        assertThrows(IllegalArgumentException.class, () -> divisibleSumPairs.divisibleSumPairsEfficient(k, list));
    }
}