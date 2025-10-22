package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPrimeTest {
    private final NumberPrime numberPrime = new NumberPrime();

    @Test
    void isPrime_1() {
        assertFalse(numberPrime.isPrime(1));
    }

    @Test
    void isPrime_2() {
        assertTrue(numberPrime.isPrime(2));
    }

    @Test
    void isPrime_7() {
        assertTrue(numberPrime.isPrime(7));
    }

    @Test
    void isPrime_97() {
        assertTrue(numberPrime.isPrime(97));
    }

    @Test
    void isPrime_4() {
        assertFalse(numberPrime.isPrime(4));
    }

    @Test
    void isPrime_22() {
        assertFalse(numberPrime.isPrime(22));
    }
}