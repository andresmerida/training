package org.andres.leetcode.two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p/>
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * <p/>
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        checkInputs(nums, target);
        int[] res = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }

        return null;
    }

    private void checkInputs(int[] nums, int target) {
        if (nums == null || nums.length < 2 || nums.length > Math.pow(10, 4)) {
            throw new IllegalArgumentException("Invalid array input!");
        }

        if (target < -Math.pow(10, 9) || target > Math.pow(10, 9)) {
            throw new IllegalArgumentException("Invalid target!");
        }
    }

    public int[]  twoSumBestSolution(int[] nums, int target) {
        checkInputs(nums, target);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}
