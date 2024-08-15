package org.andres.training.arrays.min_max;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinMax {
    public static final String MIN_LITERAL_VALUE = "min";
    public static final String MAX_LITERAL_VALUE = "max";

    public Map<String, Integer> getMinMaxValues(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        Map<String, Integer> minMaxValues = new HashMap<>();
        if (array.length == 1) {
            minMaxValues.put("min", array[0]);
            minMaxValues.put("max", array[0]);
        }

        Arrays.sort(array);
        minMaxValues.put(MIN_LITERAL_VALUE, array[0]);
        minMaxValues.put(MAX_LITERAL_VALUE, array[array.length-1]);

        return minMaxValues;
    }

    public Map<String, Integer> getMinMaxValuesSolution2(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        Map<String, Integer> minMaxValues = new HashMap<>();
        if (a.length == 1) {
            minMaxValues.put(MIN_LITERAL_VALUE, a[0]);
            minMaxValues.put(MAX_LITERAL_VALUE, a[0]);
        }

        minMaxValues.put(MIN_LITERAL_VALUE, this.getMinValue(a));
        minMaxValues.put(MAX_LITERAL_VALUE, this.getMaxValue(a));

        return minMaxValues;
    }

    public int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            minValue = Math.min(minValue, array[i]);
        }

        return minValue;
    }

    public int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            maxValue = Math.max(maxValue, array[i]);
        }

        return maxValue;
    }

    public Map<String, Integer> getMinMaxValuesSolution3(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        Map<String, Integer> minMaxValues = new HashMap<>();
        if (a.length == 1) {
            minMaxValues.put(MIN_LITERAL_VALUE, a[0]);
            minMaxValues.put(MAX_LITERAL_VALUE, a[0]);
        }

        minMaxValues.put(MIN_LITERAL_VALUE, Arrays.stream(a).min().getAsInt());
        minMaxValues.put(MAX_LITERAL_VALUE, Arrays.stream(a).max().getAsInt());

        return minMaxValues;
    }
}
