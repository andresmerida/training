package org.andres.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {
    private final MissingNumber missingNumber = new MissingNumber();

    @Test
    void missingNumber() {
        int[] input = {1,2,3,5};
        int expected = 4;
        assertEquals(expected, missingNumber.missingNumber(input));
    }

    @Test
    void missingNumber_throwIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> missingNumber.missingNumber(null));
    }

    @Test
    void missingNumbers() {
        int[] input = {9, 6, 4, 5, 7, 0, 1};
        Integer[] expected = {2,3,8};
        assertArrayEquals(expected, missingNumber.missingNumbers(input));
    }

    @Test
    void missingNumbers_emptyArray() {
        assertThrows(IllegalArgumentException.class, () -> missingNumber.missingNumber(new int[0]));
    }
}
