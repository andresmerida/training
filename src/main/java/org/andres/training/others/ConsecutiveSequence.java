package org.andres.training.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 * Given an array of numbers, find the longest consecutive sequence and return the count of that sequence
 * Ex1:
 * Input: [100,4,200,101,1,2,3]
 * Result: 4
 *
 * Ex2:
 * Input: [3,7,2,5,4,6,0,1]
 * Result: 8
 *
 * Ex3:
 * Input: [3,8,1,2,9,20]
 * Result: 3
 *
 * Ex4:
 * Input: [23,3,8,21,2,1,22,9,10,20,24]
 * Result: 5
 *
 */
public class ConsecutiveSequence {

    public int consecutiveSequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                counter++;
            } else {
                list.add(++counter);
                counter = 0;
            }
        }
        if (counter != 0) {
            list.add(++counter);
        }

        return list.stream().mapToInt(Integer::intValue).max().getAsInt();
    }
}
