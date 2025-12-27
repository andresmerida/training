package org.andres.stream.operations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
     * Find the longest common prefix of a list of strings
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
     * Find the longest common postfix of a list of strings
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

    /**
     * Create a map of initials to concatenated names
     * Example Input: List.of("Alice", "Anil", "Bob", "Charlie", "David", "Eve", "Frank")
     * @param list of strings
     * @return Map<Character, String> Map.of("A", "Alice Anil", "B", "Bob", "C", "Charlie", "E", "Eve", "F", "Frank")
     */
    public Map<Character, String> getMapWithInitialNames(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0),
                        Collectors.joining(", ")));
    }

    /**
     * Find the longest word in an array of strings
     * Example: ["apple", "banana", "cherry", "date", "fig", "grapefruit", "kiwi"] -> "grapefruit"
     * @param strs array of strings
     * @return String
     */
    public String findLongestWord(String[] strs) {
        if (strs == null) {
            throw new IllegalArgumentException("Array strs is null");
        }
        if (strs.length == 1) {
            return strs[0];
        }

        return Arrays.stream(strs)
                .reduce((s1, s2) ->
                        s1.length() >= s2.length() ? s1 : s2)
                .orElse("");
    }

    public String findLongestWordWithoutStream(String[] strs) {
        if (strs == null) {
            throw new IllegalArgumentException("Array strs is null");
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String result = "";
        int maxLength = 0;
        for (String str : strs) {
            if (maxLength < str.length()) {
                maxLength = str.length();
                result = str;
            }
        }

        return result;
    }

    /**
     * Find the average length of strings in an Array
     * @param strs strings[]
     * @return double
     */
    public Double averageLengthOfStrings(String[] strs) {
        if (strs == null) {
            throw new IllegalArgumentException("Array strs is null");
        }

        return Arrays.stream(strs)
                .mapToInt(String::length)
                .average()
                .orElse(0);
    }

    public double averageLengthOfStringsWithoutStream(String[] strs) {
        int sumStringSize = 0;
        for (String str : strs) {
            sumStringSize += str.length();
        }
        return (double) sumStringSize / strs.length;
    }

    /**
     * Find the sum of length of strings in an Array
     * @param strs strings[]
     * @return double
     */
    public int sumLengthOfStrings(String[] strs) {
        if (strs == null) {
            throw new IllegalArgumentException("Array strs is null");
        }

        return Arrays.stream(strs)
                .mapToInt(String::length)
                .sum();
    }

    /**
     * Find the count of strings that start with a specific letter
     * @param strs strings[]
     * @return int
     */
    public int countStringsThatStartWithLetter(String[] strs, Character letter) {
        if (strs == null) {
            throw new IllegalArgumentException("Array strs is null");
        }

        return (int) Arrays.stream(strs)
                .filter(s -> s.startsWith(String.valueOf(letter)))
                .count();
    }

    /**
     * Find the distinct strings in a list
     * Example: ["banana", "ana", "banana", "andres"] -> ["banana", "ana", "andres"]
     * @param strs array
     * @return List of distinct strings
     */
    public List<String> findDistinctStrings(String[] strs) {
        if (strs == null) {
            throw new IllegalArgumentException("Array strs is null");
        }

        return  Arrays.stream(strs)
                .distinct()
                .toList();
    }

    /**
     * Find the second-longest word in a list of strings
     * @param fruits list of fruits
     * @return String second-longest word
     */
    public String findSecondLongestWord(String[] fruits) {
        if (fruits == null) {
            throw new IllegalArgumentException("Array fruits is null");
        }

        return Arrays.stream(fruits)
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .skip(1)
                .findFirst()
                .orElse("");
    }

    /**
     * Find the sum of lengths of all strings in a list
     */
    public int sumOfStringLengths(String[] words) {
        return Arrays.stream(words)
                .mapToInt(String::length)
                .sum();
    }

    public int sumOfStringLengthsWithoutStream(String[] words) {
        int sum = 0;
        for (String word : words) {
            sum += word.length();
        }
        return sum;
    }

    /**
     * Find the count of strings that start with 'a' specific letter
     */
    public int countStringsThatStartWithLetterWithoutStream(String[] words) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith("a")) {
                count++;
            }
        }
        return count;
    }

    public int countStringsThatStartWithLetter(String[] words) {
        return (int) Arrays.stream(words)
                .filter(s -> s.startsWith("a"))
                .count();
    }

    /**
     * Find the second longest word in a list of strings
     */
    public String findSecondLongestWordWithoutStream(String[] fruits) {
        List<String> words = Arrays.asList(fruits);
        words.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
        return words.get(1);
    }

    public String findSecondLongestWord2(String[] fruits) {
        return Arrays.stream(fruits)
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .skip(1)
                .findFirst()
                .orElse("");
    }

    public Map<Integer, List<String>> groupByLength(String[] words) {
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(String::length));
    }

    public Map<String, List<Integer>> groupByEvenAndOdd(Integer[] numbers) {
        return Arrays.stream(numbers)
                .collect(Collectors.groupingBy(n -> {
                    if (n % 2 == 0) {
                        return "even";
                    } else {
                        return "odd";
                    }
                }));
    }

    public Map<Integer, Long> groupByLengthAndCountWords(String[] words) {
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
    }

    public Map<Integer, List<Integer>> batchProcessEach2() {
        List<Integer> largeList = IntStream.range(1, 10).boxed().toList();
        Map<Integer, List<Integer>> result = new HashMap<>();

        int batchSize = 3;
        for (int i = 0; i < batchSize; i++) {
            List<Integer> batch = largeList.stream()
                    .skip((long) i * batchSize)
                    .limit(batchSize)
                    .toList();
            if (batch.isEmpty()) {
                break;
            }
            result.put(i + 1, batch);
        }

        return result;
    }
}
