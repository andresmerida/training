package org.andres.training.others;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesElementsArrayTest {
    private final RemoveDuplicatesElementsArray obj = new RemoveDuplicatesElementsArray();

    @Test
    public void removeDuplicates_OneElement() {
        int[] input = {2};
        Set<Integer> expected = new LinkedHashSet<>();
        expected.add(2);

        assertEquals(expected, obj.removeDuplicates(input));
    }

    @Test
    public void removeDuplicates_SevenElements() {
        int[] input = {1,2,2,3,3,4,5};
        Set<Integer> expected = new LinkedHashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        assertEquals(expected, obj.removeDuplicates(input));
    }

    @Test
    public void removeDuplicates_SevenElementsWithDuplicates() {
        int[] input = {1,2,3,4,5,6,7};
        Set<Integer> expected = new LinkedHashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);

        assertEquals(expected, obj.removeDuplicates(input));
    }

    @Test
    public void removeDuplicates_throwIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> obj.removeDuplicates(null));
    }

    @Test
    public void removeDuplicates_throwIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> obj.removeDuplicates(new int[0]));
    }

    // Soution 2

    @Test
    public void removeDuplicates2_OneElement() {
        int[] input = {2};
        List<Integer> expected = List.of(2);

        assertEquals(expected, obj.removeDuplicates2(input));
    }

    @Test
    public void removeDuplicates2_twoElementsDuplicate() {
        int[] input = {1,1};
        List<Integer> expected = List.of(1);

        assertEquals(expected, obj.removeDuplicates2(input));
    }

    @Test
    public void removeDuplicates2_twoElements() {
        int[] input = {1,2};
        List<Integer> expected = List.of(1,2);

        assertEquals(expected, obj.removeDuplicates2(input));
    }

    @Test
    public void removeDuplicates2_SevenElements() {
        int[] input = {1,2,2,3,3,4,5};
        List<Integer> expected = List.of(1,2,3,4,5);

        assertEquals(expected, obj.removeDuplicates2(input));
    }

    @Test
    public void removeDuplicates2_SevenElementsWithOutDuplicates() {
        int[] input = {1,2,3,4,5,6,7};
        List<Integer> expected = List.of(1,2,3,4,5,6,7);

        assertEquals(expected, obj.removeDuplicates2(input));
    }

    @Test
    public void removeDuplicates2_throwIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> obj.removeDuplicates(null));
    }

    @Test
    public void removeDuplicates2_throwIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> obj.removeDuplicates(new int[0]));
    }
}