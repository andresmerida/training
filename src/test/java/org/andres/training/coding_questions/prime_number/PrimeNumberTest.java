package org.andres.training.coding_questions.prime_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    private final PrimeNumber primeNumber = new PrimeNumber();

    @Test
    void isPrime_shouldReturnTrue_2() {
        assertTrue(primeNumber.isPrime(2));
    }

    @Test
    void isPrime_shouldReturnTrue_97() {
        assertTrue(primeNumber.isPrime(97));
    }

    @Test
    void isPrime_shouldReturnFalse_4() {
        assertFalse(primeNumber.isPrime(4));
    }

    @Test
    void isPrime_shouldReturnFalse_45() {
        assertFalse(primeNumber.isPrime(45));
    }
}