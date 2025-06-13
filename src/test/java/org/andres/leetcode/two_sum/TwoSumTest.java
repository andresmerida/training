package org.andres.leetcode.two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    void twoSumTest() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);

        assertNotNull(result);
        assertEquals(1, result[0]);
        assertEquals(0, result[1]);
    }

    @Test
    void twoSumTest_IllegalArgumentException() {
        int[] nums = {1};
        int target = 100;
        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(nums, target));
    }

    @Test
    void twoSumTest_NoSolution() {
        int[] nums = {1, 2, 3};
        int target = 100;
        int[] result = twoSum.twoSum(nums, target);
        assertNull(result);
    }
}