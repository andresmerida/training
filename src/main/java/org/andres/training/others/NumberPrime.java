package org.andres.training.others;

public class NumberPrime {

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
