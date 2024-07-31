package org.andres.training.coding_questions.factorial;

public class FactorialNumber {

    public Long getFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }

        if (n == 0) {
            return 1L;
        }

        long result = 1L;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
