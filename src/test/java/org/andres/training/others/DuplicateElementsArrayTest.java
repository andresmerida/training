package org.andres.training.others;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateElementsArrayTest {
    private final DuplicateElementsArray duplicateElementsArray = new DuplicateElementsArray();

    @Test
    void findDuplicate_sizeOne() {
        int[] input = new int[]{1};
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, duplicateElementsArray.findDuplicate(input));
    }

    @Test
    void findDuplicate_noDuplicates() {
        int[] input = new int[]{3,1,2};
        List<Integer> expected = List.of();

        assertEquals(expected, duplicateElementsArray.findDuplicate(input));
    }

    @Test
    void findDuplicate_sizeFive() {
        int[] input = new int[]{2,3,1,2,3};
        List<Integer> expected = List.of(2,3);

        assertEquals(expected, duplicateElementsArray.findDuplicate(input));
    }

    @Test
    void findDuplicate_sizeManyDuplicates() {
        int[] input = new int[]{2,3,1,2,3,2,2,5,3,3,7,8};
        List<Integer> expected = List.of(2,3);

        assertEquals(expected, duplicateElementsArray.findDuplicate(input));
    }

    @Test
    void findDuplicate_ThrowIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> duplicateElementsArray.findDuplicate(null));
    }

    @Test
    void findDuplicate_ThrowIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> duplicateElementsArray.findDuplicate(new int[0]));
    }

    // without map
    @Test
    void findDuplicateWithoutMap_sizeOne() {
        int[] input = new int[]{1};
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, duplicateElementsArray.findDuplicateWithoutMap(input));
    }

    @Test
    void findDuplicateWithoutMap_noDuplicates() {
        int[] input = new int[]{3,1,2};
        List<Integer> expected = List.of();

        assertEquals(expected, duplicateElementsArray.findDuplicateWithoutMap(input));
    }

    @Test
    void findDuplicateWithoutMap_sizeFive() {
        int[] input = new int[]{2,3,1,2,3};
        List<Integer> expected = List.of(2,3);

        assertEquals(expected, duplicateElementsArray.findDuplicateWithoutMap(input));
    }

    @Test
    void findDuplicateWithoutMap_sizeManyDuplicates() {
        int[] input = new int[]{2,3,1,2,3,2,2,5,3,3,7,8};
        List<Integer> expected = List.of(2,3);

        assertEquals(expected, duplicateElementsArray.findDuplicateWithoutMap(input));
    }

    @Test
    void findDuplicateWithoutMap_ThrowIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> duplicateElementsArray.findDuplicateWithoutMap(null));
    }

    @Test
    void findDuplicateWithoutMap_ThrowIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> duplicateElementsArray.findDuplicateWithoutMap(new int[0]));
    }
}