package org.andres.leetcode.two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2 || nums.length > Math.pow(10, 4)) {
            throw new IllegalArgumentException("Invalid input");
        }
        Map<Integer, Integer> pairIdx = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (pairIdx.containsKey(target - num)) {
                return new int[] { i, pairIdx.get(target - num)};
            }
            pairIdx.put(num, i);
        }

        return null;
    }
}
