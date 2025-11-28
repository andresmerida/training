package org.andres.stream.second_most_frequent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondMostFrequentElementTest {
    private final SecondMostFrequentElement secondMostFrequentElement = new SecondMostFrequentElement();

    @Test
    void getSecondMostFrequent() {
        int[] input = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int expected = 3;

        assertEquals(expected, secondMostFrequentElement.getSecondMostFrequent(input));
    }

    @Test
    void getSecondMostFrequent_throwNull() {
        assertThrows(IllegalArgumentException.class,() -> secondMostFrequentElement.getSecondMostFrequent(null));
    }

    @Test
    void getSecondMostFrequent_throwEmpty() {
        assertThrows(IllegalArgumentException.class,() ->
                secondMostFrequentElement.getSecondMostFrequent(new int[0]));
    }
}