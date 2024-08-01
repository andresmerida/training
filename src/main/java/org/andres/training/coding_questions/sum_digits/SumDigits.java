package org.andres.training.coding_questions.sum_digits;

public class SumDigits {

    public int sumDigits(int n) {
        if (n < 0) {
            // number must be non-negative
            throw new IllegalArgumentException("Number must be non-negative");
        }

        int rightDigit, sumDigits = 0;
        while (n > 0) {
            rightDigit = n % 10;
            sumDigits += rightDigit;
            n /= 10;
        }

        return sumDigits;
    }
}
