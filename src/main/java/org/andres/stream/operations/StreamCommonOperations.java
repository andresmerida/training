package org.andres.stream.operations;

import java.util.*;
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

    /*
     * Calculate the sum of all integers in a list
     *
     */
    public Map<String, Object> reduceOperations(List<Integer> list) {
        Map<String, Object> map = new HashMap<>();
        int sum = list.stream()
                .reduce(Integer::sum).orElse(0);
        map.put("sum", sum);

        int product = list.stream()
                .reduce((a, b) -> a * b).orElse(1);
        map.put("product", product);

        int max =  list.stream()
                .reduce(Integer::max).orElse(Integer.MAX_VALUE);
        map.put("max", max);

        int min =  list.stream()
                .reduce(Integer::min).orElse(0);
        map.put("min", min);

        String reduceString = list.stream()
                .map(String::valueOf)
                .reduce(String::concat).orElse("");
        map.put("concat", reduceString);

        return map;
    }

    /**
     * Filter non-prime numbers using streams
     * @param list of integers
     * @return List of no-primes numbers
     */
    public List<Integer> filterNoPrimeNumbers(List<Integer> list) {

        return list.stream()
                .filter(this::isPrime)
                .toList();
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Partition strings by length: short (<5), medium (5-10), long (>10)
     */
    public Map<String, List<String>> getPartitionStringsByLength(List<String> list) {
        Map<String, List<String>> map = new HashMap<>();

        return list.stream()
                .collect(Collectors.groupingBy(str -> {
                    if (str.length() < 5) {
                        return "short";
                    } else if (str.length() <= 10) {
                        return "medium";
                    } else {
                        return "long";
                    }
                }));
    }

    /**
     * Find repeating characters in a string
     * Example: "programming" -> List.of('r', 'g', 'm')
     * @param str string
     * @return List of Characters
     */
    public List<Character> findRepeatedCharacters(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
    }

    /**
     * find the first recurring element in a list
     * Example: [1,2,3,4,5,3,6,7] -> 3
     * @param numbers array of integers
     * @return int
     */
    public int findFirstRecurrentElement(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array numbers is null");
        }

        List<Integer> list = Arrays.stream(numbers).boxed().toList();
        return list.stream()
                .filter(n -> list.indexOf(n) != list.lastIndexOf(n))
                .findFirst()
                .orElse(-1);
    }

    /**
     * Find longest common prefix of a list of strings
     * Example: ["flower", flow, flight] -> "fl"
     * @param strs array of String
     * @return String common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 2) {
            throw new IllegalArgumentException("Array strs is null o size < 2");
        }

        return Arrays.stream(strs)
                .reduce((s1, s2) -> {
                    int i = 0;
                    while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
                        i++;
                    }
                    return s1.substring(0, i);
                })
                .orElse("");
    }

    /**
     * Find longest common postfix of a list of strings
     * Example: ["Andrew", "Randrew", "Mastrew"] -> "rew"
     * @param array array of String
     * @return String common prefix
     */
    public String longestCommonPostfix(String[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array array is null o size < 2");
        }

        String postFix = Arrays.stream(array)
                .map(s -> new StringBuilder(s).reverse().toString())
                .reduce((s1, s2) -> {
                    int i = 0;
                    while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
                        i++;
                    }
                    return s1.substring(0, i);
                })
                .orElse("");

        return new  StringBuilder(postFix).reverse().toString();
    }
}
