package org.andres.training.others;

import java.util.*;

/**
 * input int a[] = {1, 2, 2, 3, 3, 4, 5};
 * output = [1, 2, 3, 4, 5]
 */
public class RemoveDuplicatesElementsArray {

    public Set<Integer> removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return set;
    }

    public List<Integer> removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        if (nums.length == 1) {
            return List.of(nums[0]);
        }

        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);


        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                list.add(nums[i]);
            } else {
                list.add(nums[i]);
                i++;
            }
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            list.add(nums[nums.length - 1]);
        }

        return list;
    }
}
