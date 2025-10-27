package org.andres.leetcode.two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private final TwoSum twoSum = new TwoSum();

    @Test
    void twoSumTest() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};

        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    void twoSumTest_threeValues() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] expected = {1, 2};

        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    void twoSumTest_twoValues() {
        int[] nums = {3,3};
        int target = 6;
        int[] expected = {0, 1};

        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    void twoSumTest_IllegalArgumentException_nullArray() {
        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(null, 0));
    }

    @Test
    void twoSumTest_IllegalArgumentException_targetError() {
        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(new int[]{1,2,3,4,5}, (int)Math.pow(10, 10)));
    }

    // test best solution
    @Test
    void twoSumBestSolutionTest() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};

        assertArrayEquals(expected, twoSum.twoSumBestSolution(nums, target));
    }

    @Test
    void twoSumBestSolution_threeValues() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] expected = {1, 2};

        assertArrayEquals(expected, twoSum.twoSumBestSolution(nums, target));
    }

    @Test
    void twoSumBestSolution_twoValues() {
        int[] nums = {3,3};
        int target = 6;
        int[] expected = {0, 1};

        assertArrayEquals(expected, twoSum.twoSumBestSolution(nums, target));
    }

    @Test
    void twoSumBestSolution_IllegalArgumentException_nullArray() {
        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSumBestSolution(null, 0));
    }

    @Test
    void twoSumBestSolution_IllegalArgumentException_targetError() {
        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSumBestSolution(new int[]{1,2,3,4,5}, (int)Math.pow(10, 10)));
    }
}