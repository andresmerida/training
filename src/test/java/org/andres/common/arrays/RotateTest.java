package org.andres.common.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RotateTest {
    private final Rotate rotate = new Rotate();

    @Test
    void leftRotateTest_twoTimes() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        assertArrayEquals(new int[] { 3, 4, 5, 6, 7, 1, 2 }, rotate.leftRotate(nums, k));
    }

    @Test
    void leftRotateTest_threeTimes() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        assertArrayEquals(new int[] { 4, 5, 6, 7, 1, 2, 3 }, rotate.leftRotate(nums, k));
    }

    @Test
    void leftRotateTest_nullArray() {
        assertThrows(IllegalArgumentException.class, () -> rotate.leftRotate(null, 2));
    }

    @Test
    void leftRotateTest_emptyArray() {
        assertThrows(IllegalArgumentException.class, () -> rotate.leftRotate(new int[] {}, 2));
    }

    @Test
    void leftRotateTest_negativeK() {
        assertThrows(IllegalArgumentException.class, () -> rotate.leftRotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, -2));
    }

    @Test
    void leftRotateTest_kGreaterThanArrayLength() {
        assertThrows(IllegalArgumentException.class, () -> rotate.leftRotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 8));
    }
}
