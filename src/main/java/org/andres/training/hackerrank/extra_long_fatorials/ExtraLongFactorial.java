package org.andres.training.hackerrank.extra_long_fatorials;

import java.math.BigInteger;

public class ExtraLongFactorial {
    public BigInteger extraLongFactorials(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater than or equal to 0");
        }
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;

        while (n != 0) {
            result = result.multiply(BigInteger.valueOf(n));
            n--;
        }

        return result;
    }
}
