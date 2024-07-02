package org.andres.training.coding_questions;

import java.util.Arrays;

/**
 * Input: arr[] = {1, 2, 0, 4, 3, 0, 5, 0}
 * Output: arr[] = {1, 2, 4, 3, 5, 0, 0, 0}
 */
public class MoveZeroesToEndOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroesToEndOfArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeroesToEndOfArray(int[] nums) {
        int size = nums.length;
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                nums[counter] = nums[i];
                counter++;
            }
        }

        while (counter < size) {
            nums[counter++] = 0;
        }
    }
}
