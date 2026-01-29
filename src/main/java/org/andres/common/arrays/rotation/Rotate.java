package org.andres.common.arrays.rotation;

import java.util.Arrays;
import java.util.Collections;

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

    public Integer[] leftRotateWithStreams(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        Integer[] integerArray = Arrays.stream(arr)
                .boxed()
                .toArray(Integer[]::new);

        Collections.rotate(Arrays.asList(integerArray), -k);
        return integerArray;
    }

    public Integer[] rotateRightWithStreams(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k < 1 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input");
        }
        Integer[] integerArray = Arrays.stream(arr)
                .boxed()
                .toArray(Integer[]::new);

        Collections.rotate(Arrays.asList(integerArray), k);

        return integerArray;
    }

    public int[] rotateRight(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        k %= arr.length;
        int temp;
        int previous;
        for (int i = 0; i < k; i++) {
            previous = arr[arr.length - 1];
            for (int j = 0; j < arr.length; j++) {
                temp = arr[j];
                arr[j] = previous;
                previous = temp;
            }
        }

        return arr;
    }
}
