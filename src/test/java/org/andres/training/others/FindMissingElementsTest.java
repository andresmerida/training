package org.andres.training.others;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingElementsTest {
    private final FindMissingElements findMissingElements = new FindMissingElements();

    @Test
    void findMissingElementsOneToFive() {
        int[] numbers = new int[] {1, 3, 3, 3, 5};
        assertEquals(List.of(2,4), findMissingElements.findMissingElements(numbers, 5));
    }

    @Test
    void findMissingElementsOneToSeven() {
        int[] numbers = new int[] {1, 2, 3, 4, 4, 7, 7};
        assertEquals(List.of(5,6), findMissingElements.findMissingElements(numbers, 7));
    }

    @Test
    void findMissingElements() {
        int[] numbers = new int[] {3, 3, 3, 5, 1};
        assertEquals(List.of(2,4), findMissingElements.findMissingElements(numbers, 5));
    }

    @Test
    void findMissingElements_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> findMissingElements.findMissingElements(new int[] {1, 3, 3, 3, 5}, -1));
    }
}