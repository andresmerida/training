package org.andres.hakerrank.advanced.lambda_expressions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    private final MyMath myMath = new MyMath();

    @Test
    void checker_isOddTrue() {
        int input = 3;
        assertTrue(MyMath.checker(myMath.isOdd(), input));
    }

    @Test
    void checker_isOddFalse() {
        int input = 2;
        assertFalse(MyMath.checker(myMath.isOdd(), input));
    }

    @Test
    void checker_isPrimeTrue() {
        int input = 11;
        assertTrue(MyMath.checker(myMath.isPrime(), input));
    }

    @Test
    void checker_isPrimeFalse() {
        int input = 12;
        assertFalse(MyMath.checker(myMath.isPrime(), input));
    }

    @Test
    void checker_isPalindromeTrue() {
        int input = 121;
        assertTrue(MyMath.checker(myMath.isPalindrome(), input));
    }

    @Test
    void checker_isPalindromeFalse() {
        int input = 123;
        assertFalse(MyMath.checker(myMath.isPalindrome(), input));
    }
}