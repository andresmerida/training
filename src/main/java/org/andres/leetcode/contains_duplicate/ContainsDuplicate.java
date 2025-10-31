package org.andres.leetcode.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 1) {
            throw new IllegalArgumentException("nums is null or empty");
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
