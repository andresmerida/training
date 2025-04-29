package org.andres.training.youtube1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotationArrayTest {
    RotationArray rotationArray = new RotationArray();

    @Test
    void rotateWithTempTest() {
        int[] inputArray = { 1, 2, 3, 4, 5, 6};
        int[] result = rotationArray.rotateWithTemp(inputArray, 3);
        assertArrayEquals(new int[] { 4, 5, 6, 1, 2, 3 }, result);
    }
}