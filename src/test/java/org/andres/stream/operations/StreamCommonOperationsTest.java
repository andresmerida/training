package org.andres.stream.operations;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StreamCommonOperationsTest {
    private final StreamCommonOperations streamCommonOperations = new StreamCommonOperations();

    @Test
    void getMergeTwoListTest() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);

        assertEquals(expected, streamCommonOperations.getMergeTwoList(list1, list2));
    }

    @Test
    void getCommonElementsTest() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);

        List<Integer> expected = List.of(3);

        assertEquals(expected, streamCommonOperations.getCommonElements(list1, list2));
    }

    @Test
    void convertListToMapWithSizesTest() {
        List<String> list1 = Arrays.asList("apple", "banana", "orange");

        Map<String, Integer> expected = Map.of("apple", 5, "banana", 6, "orange", 6);

        assertEquals(expected, streamCommonOperations.convertListToMapWithSizes(list1));
    }

    @Test
    void reduceOperationsTest() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        Map<String, Object> expected = Map.of("sum", 10,
                "product", 24,
                "max", 4,
                "min", 1,
                "concat", "1234");

        assertEquals(expected, streamCommonOperations.reduceOperations(input));
    }

    @Test
    void filterNoPrimeNumbersTest() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = List.of(2, 3, 5, 7);

        assertEquals(expected, streamCommonOperations.filterNoPrimeNumbers(input));
    }

    @Test
    void getPartitionStringsByLengthTest() {
        List<String> input = List.of("apple", "banana", "cherry", "date", "fig", "grapefruit", "kiwi");
        Map<String, List<String>> mapExpected = Map.of("short", List.of("date", "fig", "kiwi"), "medium", List.of("apple", "banana", "cherry", "grapefruit"));

        assertEquals(mapExpected, streamCommonOperations.getPartitionStringsByLength(input));
    }

    @Test
    void findRepeatedCharactersTest() {
        String input = "programming";
        List<Character> expected = List.of('r', 'g', 'm');

        assertEquals(expected, streamCommonOperations.findRepeatedCharacters(input));
    }

    @Test
    void findFirstRecurrentElementTest() {
        int[] input = {1, 2, 3, 4, 5, 3, 6, 7};
        int expected = 3;
        assertEquals(expected, streamCommonOperations.findFirstRecurrentElement(input));
    }

    @Test
    void findFirstRecurrentElementTest_noRepeated() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int expected = -1;
        assertEquals(expected, streamCommonOperations.findFirstRecurrentElement(input));
    }

    @Test
    void findFirstRecurrentElementTest_null() {
        assertThrows(IllegalArgumentException.class, () -> streamCommonOperations.findFirstRecurrentElement(null));
    }

    @Test
    void longestCommonPrefix() {
        String[] input = {"flower", "flow", "flight"};
        String expected = "fl";

        assertEquals(expected, streamCommonOperations.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefix_ExampleTwo() {
        String[] input = {"flower", "flow", "flor", "flot"};
        String expected = "flo";

        assertEquals(expected, streamCommonOperations.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefix_Throw() {
        assertThrows(IllegalArgumentException.class, () -> streamCommonOperations.longestCommonPrefix(null));
    }

    @Test
    void longestCommonPostfix() {
        String[] input = {"Andrew", "Randrew", "Mastrew"};
        String expected = "rew";

        assertEquals(expected, streamCommonOperations.longestCommonPostfix(input));
    }

    @Test
    void longestCommonPostfix_ExampleFour() {
        String[] input = {"Andrew", "Randrew", "Mastrew", "Mathew"};
        String expected = "ew";

        assertEquals(expected, streamCommonOperations.longestCommonPostfix(input));
    }

    @Test
    void longestCommonPostfix_Throw() {
        assertThrows(IllegalArgumentException.class, () -> streamCommonOperations.longestCommonPostfix(null));
    }
}