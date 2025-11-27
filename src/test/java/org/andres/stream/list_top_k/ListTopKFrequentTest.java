package org.andres.stream.list_top_k;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTopKFrequentTest {
    private final ListTopKFrequent listTopK = new ListTopKFrequent();

    @Test
    void topKFrequent_kTwo() {
         int[] input = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5};
         List<Integer> expected = Arrays.asList(5,3);

         assertEquals(expected, listTopK.topKFrequent(input, 2));
    }

    @Test
    void topKFrequent_kThree() {
        int[] input = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5};
        List<Integer> expected = Arrays.asList(5,3,1);

        assertEquals(expected, listTopK.topKFrequent(input, 3));
    }

    @Test
    void topKFrequentFullStream() {
        int[] input = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5};
        List<Integer> expected = Arrays.asList(5,3);

        assertEquals(expected, listTopK.topKFrequent(input, 2));
    }

    @Test
    void topKFrequentFullStream_kThree() {
        int[] input = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5};
        List<Integer> expected = Arrays.asList(5,3,1);

        assertEquals(expected, listTopK.topKFrequent(input, 3));
    }
}