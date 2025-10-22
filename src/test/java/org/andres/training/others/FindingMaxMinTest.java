package org.andres.training.others;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FindingMaxMinTest {
    private final FindingMaxMin obj = new FindingMaxMin();

    @Test
    void findingMaxMinFiveElements() {
        assertEquals(Map.of("Max", 9, "Min", 1),
                obj.findingMaxMinElements(new int[]{3,5,4,1,9}));
    }

    @Test
    void findingMaxMinSixElements() {
        assertEquals(Map.of("Max", 35, "Min", 3),
                obj.findingMaxMinElements(new int[]{22,14,8,17,35,3}));
    }

    @Test
    void getMaxTest() {
        int expectedMax = 9;
        assertEquals(expectedMax, obj.getMax(new int[]{3,5,4,1,9}));
    }

    @Test
    void getMinTest() {
        int expected = 1;
        assertEquals(expected, obj.getMin(new int[]{3,5,4,1,9}));
    }

    @Test
    void findingMaxMinElementsWithStreamFunctions_fiveElements() {
        assertEquals(Map.of("Max", 9, "Min", 1),
                obj.findingMaxMinElementsWithStreamFunctions(new int[]{3,5,4,1,9}));
    }

    @Test
    void findingMaxMinElementsWithStreamFunctions_sixElements() {
        assertEquals(Map.of("Max", 35, "Min", 3),
                obj.findingMaxMinElementsWithStreamFunctions(new int[]{22,14,8,17,35,3}));
    }

    @Test
    void findingMaxMinElementsWithStreamFunctions_Null() {
        assertThrows(IllegalArgumentException.class, () -> obj.findingMaxMinElementsWithStreamFunctions(null));
    }

    @Test
    void findingMaxMinElementsWithStreamFunctions_Empty() {
        assertThrows(IllegalArgumentException.class, () -> obj.findingMaxMinElementsWithStreamFunctions(new int[]{}));
    }

    @Test
    void findingMaxMinElementsWithSortTest() {
        Map<String, Integer> mapExpected = Map.of("Max", 35, "Min", 3);
        assertEquals(mapExpected,
                obj.findingMaxMinElementsWithStreamFunctions(new int[]{22,14,8,17,35,3}));
    }

    @Test
    void getMaxMin_WithPairTest() {
        assertEquals(Map.of("Max", 9, "Min", 1),
                obj.findingMaxMinElements(new int[]{3,5,4,1,9}));
    }

    @Test
    void getMaxMin_WithPair_Test() {
        assertEquals(Map.of("Max", 35, "Min", 3),
                obj.findingMaxMinElements(new int[]{22,14,8,17,35,3}));
    }

    @Test
    void getMaxMin_arraySizeOne() {
        assertEquals(Map.of("Max", 1, "Min", 1), obj.getMaxMin_WithPair(new int[]{1}));
    }

    @Test
    void getMaxMin_arraySizeTwo() {
        assertEquals(Map.of("Max", 2, "Min", 1), obj.getMaxMin_WithPair(new int[]{1,2}));
    }
}