package org.andres.training.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MiniMaxSumTest {
    private final MiniMaxSum miniMaxSum = new MiniMaxSum();

    @Test
    void getMiniMaxSum_orderedListTest() {
        List<Long> arr = new ArrayList<>();
        arr.add(1L);
        arr.add(2L);
        arr.add(3L);
        arr.add(4L);
        arr.add(5L);

        List<Long> minMaxSumResult = miniMaxSum.getMiniMaxSum(arr);

        assertEquals(List.of(10L, 14L), minMaxSumResult);
    }

    @Test
    void getMiniMaxSum_NoOrderedListTest() {
        List<Long> arr = new ArrayList<>();
        arr.add(4L);
        arr.add(2L);
        arr.add(5L);
        arr.add(1L);
        arr.add(3L);

        List<Long> minMaxSumResult = miniMaxSum.getMiniMaxSum(arr);

        assertEquals(List.of(10L, 14L), minMaxSumResult);
    }
}