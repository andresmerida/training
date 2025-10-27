package org.andres.datastructures;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void binarySearch_onRightSite() {
        int[] input = new int[]{1,3,4,5,7,8,9,12};
        int expected = 6;
        assertEquals(expected, binarySearch.binarySearch(input, 9));
    }

    @Test
    void binarySearch_onLeftSite() {
        int[] input = new int[]{1,3,4,5,7,8,9,12};
        int expected = 1;
        assertEquals(expected, binarySearch.binarySearch(input, 3));
    }

    @Test
    void binarySearch_onMediumSite() {
        int[] input = new int[]{1,3,4,5,7,8,9,12};
        int expected = 3;
        assertEquals(expected, binarySearch.binarySearch(input, 5));
    }

    @Test
    void binarySearch_firstSite() {
        int[] input = new int[]{1,3,4,5,7,8,9,12};
        int expected = 0;
        assertEquals(expected, binarySearch.binarySearch(input, 1));
    }

    @Test
    void binarySearch_endSite() {
        int[] input = new int[]{1,3,4,5,7,8,9,12};
        int expected = 7;
        assertEquals(expected, binarySearch.binarySearch(input, 12));
    }

    @Test
    void binarySearch_notFound() {
        int[] input = new int[]{1,3,4,5,7,8,9,12};
        int expected = -1;
        assertEquals(expected, binarySearch.binarySearch(input, 100));
    }

    @Test
    void binarySearch_notFoundNumber() {
        int[] input = new int[]{1,3,4,5,7,8,9,12};
        int expected = -1;
        assertEquals(expected, binarySearch.binarySearch(input, 2));
    }

    @Test
    void binarySearch_throwIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> binarySearch.binarySearch(null, 1));
    }

    @Test
    void binarySearch_emptyList() {
        int[] input = new int[]{};

        assertThrows(IllegalArgumentException.class, () -> binarySearch.binarySearch(input, 1));
    }

    @Test
    void binarySearchStream_found() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        int expectedIndex = 2;

        assertEquals(expectedIndex, binarySearch.binarySearchStream(fruits, "Cherry"));
    }

    @Test
    void binarySearchStream_notFound() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        assertTrue(binarySearch.binarySearchStream(fruits, "OtherFruit") < 0);
    }
}