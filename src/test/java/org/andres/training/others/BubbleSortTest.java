package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    void bubbleSort_sizeOne() {
        int[] input = new int[] {1};
        int[] expected = new int[] {1};

        assertArrayEquals(expected, bubbleSort.bubbleSort(input));
    }

    @Test
    void bubbleSort_sizeTwo() {
        int[] input = new int[] {2,1};
        int[] expected = new int[] {1,2};

        assertArrayEquals(expected, bubbleSort.bubbleSort(input));
    }

    @Test
    void bubbleSort_sizeSeven() {
        int[] input = new int[] {2,1,5,3,4,7,6};
        int[] expected = new int[] {1,2,3,4,5,6,7};

        assertArrayEquals(expected, bubbleSort.bubbleSort(input));
    }

    @Test
    void bubbleSort_throwIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> bubbleSort.bubbleSort(null));
    }

    @Test
    void bubbleSort_throwIllegalArgumentException_emptyArray() {
        assertThrows(IllegalArgumentException.class, () -> bubbleSort.bubbleSort(new int[0]));
    }
}