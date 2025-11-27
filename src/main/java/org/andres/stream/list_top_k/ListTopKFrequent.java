package org.andres.stream.list_top_k;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListTopKFrequent {

    /*
     * Given a list of integers, find the k most frequent elements.
     */
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mapCounter = new LinkedHashMap<>();
        for (int num : nums) {
            mapCounter.put(num, mapCounter.getOrDefault(num, 0) + 1);
        }

        return mapCounter.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();
    }

    public List<Integer> topKFrequentFullStream(int[] nums, int k) {
        Stream<Integer> integerStream = Arrays.stream(nums).boxed();

        return integerStream
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();
    }
}
