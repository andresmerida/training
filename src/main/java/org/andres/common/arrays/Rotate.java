package org.andres.common.arrays;

public class Rotate {
    public int[] leftRotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        int[] tempArray = new int[nums.length];
        int index = 0;
        for (int i = k; i < nums.length; i++) {
            tempArray[index] = nums[i];
            index++;
        }

        for (int i = 0; i < k; i++) {
            tempArray[index] = nums[i];
            index++;
        }

        return tempArray;
    }
}
