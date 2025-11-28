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
}