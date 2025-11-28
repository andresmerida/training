package org.andres.stream.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCommonOperations {

    /**
     * Example: List.of(1,2,3) and List.of(4,5,6) -> List.of(1,2,3,4,5,6)
     * @param list1 of integers
     * @param list2 of integers
     * @return list of integers
     */
    public List<Integer> getMergeTwoList(List<Integer> list1, List<Integer> list2) {
        return Stream.of(list1, list2)
                .flatMap(Collection::stream)
                .toList();
    }

    /**
     * Example: List.of(1,2,3) and List.of(3,4,5) -> List.of(3)
     * @param list1 of integers
     * @param list2 of integers
     * @return list of integers
     */
    public List<Integer> getCommonElements(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .filter(list2::contains)
                .toList();
    }

    /**
     * Convert a list of strings to a map with string lengths as values
     * Example: List.of("apple", "banana", "cherry") -> Map = {Ana=3, Andres=6}
     * @param list1 of Strings
     * @return Map<String, Integer>
     */
    public Map<String, Integer> convertListToMapWithSizes(List<String> list1) {
        return list1.stream()
                .collect(Collectors.toMap(s -> s, String::length));
    }
}
