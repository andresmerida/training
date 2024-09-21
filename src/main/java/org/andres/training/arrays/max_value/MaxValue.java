package org.andres.training.arrays.max_value;

import java.util.Arrays;

public class MaxValue {

    public int getMaxValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        return Arrays.stream(arr).max().getAsInt();
    }
}
