package org.andres.training.java_coding_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSecondLargestNumberTest {
    private final FindSecondLargestNumber f = new FindSecondLargestNumber();

    @Test
    void secondLargestNumberTest() {
        int[] nums = new int[]{4,8,3,9,6,7,1,5};
        int expected = 8;

        assertEquals(expected, f.secondLargestNumber(nums));
    }

    @Test
    void secondLargestNumber_orderedTest() {
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        int expected = 7;

        assertEquals(expected, f.secondLargestNumber(nums));
    }

    @Test
    void secondLargestNumber_orderedSwappedTest() {
        int[] nums = new int[]{1,2,3,8,5,6,7,4};
        int expected = 7;

        assertEquals(expected, f.secondLargestNumber(nums));
    }

    @Test
    void secondLargestNumber_sizeTwoTest() {
        int[] nums = new int[]{1,5};
        int expected = 1;

        assertEquals(expected, f.secondLargestNumber(nums));
    }

    @Test
    void secondLargestNumber_sizeThreeTest() {
        int[] nums = new int[]{1,5,4};
        int expected = 4;

        assertEquals(expected, f.secondLargestNumber(nums));
    }

    @Test
    void secondLargestNumber_throwIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> f.secondLargestNumber(null));
    }

    @Test
    void secondLargestNumber_throwIllegalArgumentException_sizeOne() {
        assertThrows(IllegalArgumentException.class, () -> f.secondLargestNumber(new int[]{1}));
    }

    // more efficient method
    @Test
    void findSecondLargestNumberTest() {
        int[] nums = new int[]{4,8,3,9,6,7,1,5};
        int expected = 8;

        assertEquals(expected, f.findSecondLargestNumber(nums));
    }

    @Test
    void findSecondLargestNumber_orderedTest() {
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        int expected = 7;

        assertEquals(expected, f.findSecondLargestNumber(nums));
    }

    @Test
    void findSecondLargestNumber_orderedSwappedTest() {
        int[] nums = new int[]{1,2,3,8,5,6,7,4};
        int expected = 7;

        assertEquals(expected, f.findSecondLargestNumber(nums));
    }

    @Test
    void findSecondLargestNumber_sizeTwoTest() {
        int[] nums = new int[]{1,5};
        int expected = 1;

        assertEquals(expected, f.findSecondLargestNumber(nums));
    }

    @Test
    void findSecondLargestNumber_sizeThreeTest() {
        int[] nums = new int[]{1,5,4};
        int expected = 4;

        assertEquals(expected, f.findSecondLargestNumber(nums));
    }

    @Test
    void findSecondLargestNumber_throwIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> f.findSecondLargestNumber(null));
    }

    @Test
    void findSecondLargestNumber_throwIllegalArgumentException_sizeOne() {
        assertThrows(IllegalArgumentException.class, () -> f.findSecondLargestNumber(new int[]{1}));
    }
}