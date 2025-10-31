package org.andres.leetcode.contains_duplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    private final ContainsDuplicate solution = new ContainsDuplicate();

    @Test
    void containsDuplicate_Example1_true() {
        int[] input = {1,2,3,1};

        assertTrue(solution.containsDuplicate(input));
    }

    @Test
    void containsDuplicate_Example2_false() {
        int[] input = {1,2,3,4};

        assertFalse(solution.containsDuplicate(input));
    }

    @Test
    void containsDuplicate_Example3_true() {
        int[] input = {1,1,1,3,3,4,3,2,4,2};

        assertTrue(solution.containsDuplicate(input));
    }

    @Test
    void containsDuplicate_ThrowIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> solution.containsDuplicate(null));
    }

    @Test
    void containsDuplicate_ThrowIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> solution.containsDuplicate(new int[0]));
    }
}