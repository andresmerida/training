package org.andres.training.coding_questions.fibonacci;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {
    private final FibonacciSeries fibSeries = new FibonacciSeries();

    @Test
    void getFibonacciSeries_shouldReturnTwoFibonacciSeries() {
        var result = fibSeries.getFibonacciSeries(2);
        assertEquals(List.of(0,1), result);
    }

    @Test
    void getFibonacciSeries_shouldReturnFiveFibonacciSeries() {
        var result = fibSeries.getFibonacciSeries(5);
        List<Integer> expected = List.of(0,1,1,2,3);
        assertEquals(expected, result);
    }

    @Test
    void getFibonacciSeries_shouldReturnEightFibonacciSeries() {
        var result = fibSeries.getFibonacciSeries(8);
        List<Integer> expected = List.of(0,1,1,2,3,5,8,13);
        assertEquals(expected, result);
    }
}