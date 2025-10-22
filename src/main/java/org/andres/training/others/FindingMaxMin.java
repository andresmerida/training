package org.andres.training.others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

public class FindingMaxMin {

    public Map<String, Integer> findingMaxMinElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr is null or empty");
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("Max", getMax(arr));
        map.put("Min", getMin(arr));

        return map;
    }

    public int getMax(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int auxInt = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = auxInt;
            }
        }

        return arr[arr.length - 1];
    }

    public int getMin(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                int auxInt = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = auxInt;
            }
        }

        return arr[arr.length - 1];
    }

    public Map<String, Integer> findingMaxMinElementsWithStreamFunctions(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr is null or empty");
        }

        Map<String, Integer> map = new HashMap<>();
        OptionalInt max = Arrays.stream(arr).max();
        OptionalInt min = Arrays.stream(arr).min();

        map.put("Max", max.orElse(-1));
        map.put("Min", min.orElse(-1));

        return map;
    }

    public Map<String, Integer> findingMaxMinElementsWithSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr is null or empty");
        }
        Map<String, Integer> map = new HashMap<>();

        Arrays.sort(arr);
        map.put("Min", arr[0]);
        map.put("Max", arr[arr.length - 1]);

        return map;
    }

    public Map<String, Integer> getMaxMin_WithPair(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr is null or empty");
        }
        Pair pair = new Pair();

        if (arr.length != 1) {
            if (arr[0] > arr[1]) {
                pair.max = arr[0];
                pair.min = arr[1];
            } else {
                pair.max = arr[1];
                pair.min = arr[0];
            }

            for (int i = 2; i < arr.length - 1; i++) {
                if (arr[i] > pair.max) {
                    pair.max = arr[i];
                } else if (arr[i] < pair.min) {
                    pair.min = arr[i];
                }
            }
        } else {
            pair.max = arr[0];
            pair.min = arr[0];
        }

        return Map.ofEntries(Map.entry("Max", pair.max),  Map.entry("Min", pair.min));
    }

    private static class Pair {
        int min;
        int max;
    }
}
