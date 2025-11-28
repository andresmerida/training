package org.andres.stream.second_most_frequent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Find the second most frequent element
 * {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}
 * Second most frequent: 3 appears 3 times
 */
public class SecondMostFrequentElement {

    public int getSecondMostFrequent(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr is null or empty");
        }

        Stream<Integer> stream = Arrays.stream(arr).boxed();

        return stream
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .skip(1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(-1);
    }
}
