package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {
    private final FibonacciSeries f = new FibonacciSeries();

    @Test
    void generateFibonacciSeries_one() {
        int input = 1;
        int[] expected = new int[]{0};

        assertArrayEquals(expected, f.generateFibonacciSeries(input));
    }

    @Test
    void generateFibonacciSeries_two() {
        int input = 2;
        int[] expected = new int[]{0,1};

        assertArrayEquals(expected, f.generateFibonacciSeries(input));
    }

    @Test
    void generateFibonacciSeries_three() {
        int input = 3;
        int[] expected = new int[]{0,1,1};

        assertArrayEquals(expected, f.generateFibonacciSeries(input));
    }

    @Test
    void generateFibonacciSeries_ten() {
        int input = 10;
        int[] expected = new int[]{0,1,1,2,3,5,8,13,21,34};

        assertArrayEquals(expected, f.generateFibonacciSeries(input));
    }

    @Test
    void generateFibonacciSeries_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> f.generateFibonacciSeries(-1));
    }
}