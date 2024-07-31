package org.andres.training.coding_questions.reverse_number;

public class ReverseNumber {
    public int reverseNumber(int number) {
        if (number <= 10) {
            throw new IllegalArgumentException("number must be greater than ten");
        }

        int reversedNumber = 0, lastNumber;
        while (number > 0) {
            lastNumber = number % 10;
            reversedNumber = reversedNumber * 10 + lastNumber;
            number /= 10;
        }
        return reversedNumber;
    }
}
