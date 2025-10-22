package org.andres.training.others;

public class FactorialClass {

    public long factorial(int number) {
        long res =  1;

        if (number < 0) {
            throw new IllegalArgumentException("number is negative");
        }
        if (number == 0 || number == 1) {
            return 1;
        }

        for (int i = 2; i <= number; i++) {
            res =  res * i;
        }

        return res;
    }
}
