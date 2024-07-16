package org.andres.training.hackerrank.non_divisible_subset;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NonDivisibleSubsetTest {
    private final NonDivisibleSubset test = new NonDivisibleSubset();

    @Test
    void nonDivisibleSubset_sample_output() {
        int result = test.nonDivisibleSubset(3, List.of(1,7,2,4));
        assertEquals(3, result);
    }

    @Test
    void nonDivisibleSubset_test_case1() {
        int result = test.nonDivisibleSubset(7,
                List.of(278,576,496,727,410,124,338,149,209,702,282,718,771,575,436));
        assertEquals(11, result);
    }

    @Test
    void nonDivisibleSubset_invalid_k() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            test.nonDivisibleSubset(101, List.of(1,7,2,4));
        });
        assertTrue(exception.getMessage().contains("Invalid k:"));
    }
}