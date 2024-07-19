package org.andres.training.coderbyte.first_factorial;

public class FirstFactorial {

    public int firstFactorial(int num) {
        if (num < 1 || num > 18) {
            throw new IllegalArgumentException("Invalid number: " + num);
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
