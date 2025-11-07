package org.andres.leetcode.top_k_frequent_elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {
    private final TopKFrequentElements tk = new TopKFrequentElements();

    @Test
    void topKFrequent_example1() {
        int[] input = {1,1,1,2,2,3};
        int k = 2;
        int[] resultExpected = {2,1};

        assertArrayEquals(resultExpected, tk.topKFrequent(input, k));
    }

    @Test
    void topKFrequent_example2() {
        int[] input = {1};
        int k = 1;
        int[] resultExpected = {1};

        assertArrayEquals(resultExpected, tk.topKFrequent(input, k));
    }

    @Test
    void topKFrequent_example3() {
        int[] input = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        int[] resultExpected = {1,2};

        assertArrayEquals(resultExpected, tk.topKFrequent(input, k));
    }

    @Test
    void topKFrequent_example4() {
        int[] input = {1,3,4,3,4,2,3,4,2,5,4,5,5};
        int k = 3;
        int[] resultExpected = {5,3,4};

        assertArrayEquals(resultExpected, tk.topKFrequent(input, k));
    }
}