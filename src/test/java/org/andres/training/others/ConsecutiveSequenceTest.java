package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveSequenceTest {
    private final ConsecutiveSequence consecutiveSequence = new ConsecutiveSequence();

    @Test
    void consecutiveSequence_4() {
        int[] nums = new int[]{100,4,200,101,1,2,3};
        int expected = 4;

        assertEquals(expected, consecutiveSequence.consecutiveSequence(nums));
    }

    @Test
    void consecutiveSequence_8() {
        int[] nums = new int[]{3,7,2,5,4,6,0,1};
        int expected = 8;

        assertEquals(expected, consecutiveSequence.consecutiveSequence(nums));
    }

    @Test
    void consecutiveSequence_3() {
        int[] nums = new int[]{3,8,1,2,9,20};
        int expected = 3;

        assertEquals(expected, consecutiveSequence.consecutiveSequence(nums));
    }

    @Test
    void consecutiveSequence_5() {
        int[] nums = new int[]{23,3,8,21,2,1,22,9,10,20,24};
        int expected = 5;

        assertEquals(expected, consecutiveSequence.consecutiveSequence(nums));
    }

    @Test
    void consecutiveSequence_ThrowIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> consecutiveSequence.consecutiveSequence(null));
    }

    @Test
    void consecutiveSequence_ThrowIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> consecutiveSequence.consecutiveSequence(new int[0]));
    }
}