package org.andres.training.java_coding_questions;

import java.util.Arrays;

public class FindSecondLargestNumber {

    public int secondLargestNumber(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array is null or size is less than 2");
        }

        Arrays.sort(nums);

        return nums[nums.length - 2];
    }

    private void bubbleSort(int[] nums) {

        int lastIndex = nums.length - 1;
        boolean swap;
        while (lastIndex > 1) {
            swap = false;
            for (int j = 0; j < lastIndex; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }
            lastIndex--;
            if (!swap) {
                break;
            }
        }
    }

    public int findSecondLargestNumber(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array is null or size is less than 2");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
