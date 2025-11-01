package org.andres.leetcode.contains_duplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTwoTest {
    private final ContainsDuplicateTwo t = new ContainsDuplicateTwo();

    @Test
    void containsDuplicate_Example1() {
        int[] input = {1,2,3,1};

        assertTrue(t.containsDuplicate(input, 3));
    }

    @Test
    void containsDuplicate_Example2() {
        int[] input = {1,0,1,1};

        assertTrue(t.containsDuplicate(input, 1));
    }

    @Test
    void containsDuplicate_Example3() {
        int[] input = {1,2,3,1,2,3};

        assertFalse(t.containsDuplicate(input, 2));
    }

    @Test
    void containsDuplicate_ThrowIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> t.containsDuplicate(null, 3));
    }

    @Test
    void containsDuplicate_ThrowIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> t.containsDuplicate(new int[0], 3));
    }

    @Test
    void containsDuplicate_ThrowIllegalArgumentException_k() {
        int[] input = {1,2,3,1,2,3};
        assertThrows(IllegalArgumentException.class, () -> t.containsDuplicate(input, 200));
    }
}