package org.andres.coderbyte;

import java.util.Arrays;
import java.util.Map;

/**
 * Find max and min in an array
 */
public class MaxMin {

    public Map<String, Integer> getMaxAndMin(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        if (arr.length == 1) {
            return Map.of("Max", arr[0], "Min", arr[0]);
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return Map.of("Max", max, "Min", min);
    }

    public Map<String, Integer> getMaxAndMinWithStreams(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        return Map.of(
                "Max",
                Arrays.stream(arr)
                        .max(Integer::compareTo)
                        .orElse(0)
                ,
                "Min",
                Arrays.stream(arr)
                        .min(Integer::compareTo)
                        .orElse(0));
    }
}
