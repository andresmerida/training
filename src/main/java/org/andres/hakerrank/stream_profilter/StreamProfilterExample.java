package org.andres.hakerrank.stream_profilter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamProfilterExample {
    /**
     * Identifies and returns a list of duplicate fruits (frequence > 1) from the given list of strings.
     *
     * Example: List.of("Apple", "Banana", "Apple", "Orange", "Banana", "Apple")
     * Return -> List.of("Apple", "Banana")
     *
     * @param strings the list of strings to process; must not be null or empty
     * @return a list of strings that appear more than once in the input list
     * @throws IllegalArgumentException if the input list is null or empty
     */
    public List<String> getDuplicateOfFruits(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        // group by the items and count occurrences
        Map<String, Long> map = strings
                .stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        // Filter for duplicates only (count > 1) and collect into a list
        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
    }

    /**
     * Identifies and returns a list of duplicate integers (frequency > 1) from the given array of integers.
     *
     * @param integers an array of integers to process; must not be null or empty
     * @return a list of integers that appear more than once in the input array
     * @throws IllegalArgumentException if the input array is null or empty
     */
    public List<Integer> getDuplicatesOfIntegers(Integer[] integers) {
        if (integers == null || integers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        Map<Integer, Long> map = Arrays.stream(integers)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
    }

    /**
     * Computes and returns a map of categories and their total sales where the total sales amount
     * for a category exceeds 150.
     *
     * @param sales the list of Sale records to process; must not be null
     * @return a map where the keys are category names and the values are the total sales amount
     *         for those categories, filtered to include only categories with total sales greater than 150
     * @throws IllegalArgumentException if the input list is null
     */
    public Map<String, Double> getTotalSalesGreaterThan150ByCategory(List<Sale> sales) {
        if (sales == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        Map<String, Double> salesByCategory = sales.stream()
                .collect(Collectors.groupingBy(
                        Sale::category,
                        Collectors.summingDouble(Sale::amount)
                ));
        return salesByCategory
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 150)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
