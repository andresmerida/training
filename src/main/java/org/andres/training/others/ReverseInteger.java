package org.andres.training.others;

public class ReverseInteger {
    public int reverse(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number is out of range");
        }

        int res = 0;
        while (number != 0) {
            int pop = number % 10;
            res = res * 10 + pop;
            number = number / 10;
        }
        return res;
    }
}
