package org.andres.coderbyte.map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private final TwoSum twoSum = new TwoSum();

    @Test
    void twoSum() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};

        assertArrayEquals(expected, twoSum.twoSum(numbers, target));
    }

    @Test
    void twoSumWithNegativeNumbers() {
        int[] numbers = {0, -1, 2, -3, 1};
        int target = -2;
        int[] expected = new int[]{3, 4};

        assertArrayEquals(expected, twoSum.twoSum(numbers, target));
    }

    @Test
    void twoSum_illegalArgumentException() {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 100;

        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(numbers, target));
    }
}