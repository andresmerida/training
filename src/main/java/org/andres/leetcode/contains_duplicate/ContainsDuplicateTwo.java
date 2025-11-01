package org.andres.leetcode.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums and an integer k,
 * return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * <p/>
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * <p/>
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 * <p/>
 * Constraints:
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * 0 <= k <= 105
 */
public class ContainsDuplicateTwo {

    public boolean containsDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length > 105) {
            throw  new IllegalArgumentException("nums is null or empty");
        }
        if (k < 0 || k > 105) {
            throw  new IllegalArgumentException("k is less than cero or greater than 105");
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
