package org.andres.training.hackerrank.find_digits;

public class FindDigits {
    public int findDigits(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must greater than 0");
        }

        int lastDigit = 0, nTemp = n, digitsCounter = 0;
        while (nTemp != 0) {
            lastDigit = nTemp % 10;     // get the last digit of the nTemp number
            if (lastDigit != 0 && n % lastDigit == 0) {
                digitsCounter++;
            }
            nTemp = nTemp / 10;
        }

        return digitsCounter;
    }
}
