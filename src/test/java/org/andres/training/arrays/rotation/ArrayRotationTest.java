package org.andres.training.arrays.rotation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRotationTest {
    private ArrayRotation arrayRotation;

    @BeforeEach
    void setUp() {
        arrayRotation = new ArrayRotation();
    }

    @Test
    void rotate_shouldRotateArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        var result = arrayRotation.rotate(array, 2);
        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 1, 2}, result);
    }

    @Test
    void rotate_shouldReturnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> arrayRotation.rotate(null, 2));
        assertTrue(exception.getMessage().contains("null or empty"));
    }

    @Test
    void rotateOneByOne_shouldRotateArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        var result = arrayRotation.rotateOneByOne(array, 2);
        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 1, 2}, result);
    }
}