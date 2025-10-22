package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {
    private final ReverseArray obj = new ReverseArray();

    @Test
    void reverse() {
        int[] input = new int[]{1,2,3,4,5};
        int[] expected = new int[]{5,4,3,2,1};

        assertArrayEquals(expected, obj.reverse(input));
    }

    @Test
    void reverse_ThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> obj.reverse(null));
    }

    @Test
    void reverse_ThrowIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> obj.reverse(new int[0]));
    }

    @Test
    void reverseSolution2_sizeOne() {
        int[] input = new int[]{1};
        int[] expected = new int[]{1};
        assertArrayEquals(expected, obj.reverseSolution2(input));
    }

    @Test
    void reverseSolution2_sizeTwo() {
        int[] input = new int[]{1,2};
        int[] expected = new int[]{2,1};
        assertArrayEquals(expected, obj.reverseSolution2(input));
    }

    @Test
    void reverseSolution2_sizeFive() {
        int[] input = new int[]{1,2,3,4,5};
        int[] expected = new int[]{5,4,3,2,1};
        assertArrayEquals(expected, obj.reverseSolution2(input));
    }

    @Test
    void reverseSolution2_ThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> obj.reverseSolution2(null));
    }

    @Test
    void reverseSolution3_sizeOne() {
        int[] input = new int[]{1};
        int[] expected = new int[]{1};
        assertArrayEquals(expected, obj.reverseSolution2(input));
    }

    @Test
    void reverseSolution3_sizeTwo() {
        int[] input = new int[]{1,2};
        int[] expected = new int[]{2,1};
        assertArrayEquals(expected, obj.reverseSolution2(input));
    }

    @Test
    void reverseSolution3_sizeFive() {
        int[] input = new int[]{1,2,3,4,5};
        int[] expected = new int[]{5,4,3,2,1};
        assertArrayEquals(expected, obj.reverseSolution2(input));
    }

    @Test
    void reverseSolution3_ThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> obj.reverseSolution2(null));
    }
}