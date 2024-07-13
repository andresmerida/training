package org.andres.training.hackerrank.extra_long_fatorials;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class ExtraLongFactorialTest {
    ExtraLongFactorial tested = new ExtraLongFactorial();

    @Test
    void extraLongFactorials_factorialForThreeValue() {
        BigInteger result = tested.extraLongFactorials(3);
        assertEquals(BigInteger.valueOf(6), result);
    }

    @Test
    void extraLongFactorials_factorialForFourValue() {
        BigInteger result = tested.extraLongFactorials(4);
        assertEquals(BigInteger.valueOf(24), result);
    }

    @Test
    void extraLongFactorials_factorialFor_TwentyFiveValue() {
        BigInteger result = tested.extraLongFactorials(25);
        assertEquals(new BigInteger("15511210043330985984000000"), result);
    }

    @Test
    void extraLongFactorials_factorialForZeroValue() {
        BigInteger result = tested.extraLongFactorials(0);
        assertEquals(BigInteger.valueOf(1), result);
    }

    @Test
    void extraLongFactorials_IllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> tested.extraLongFactorials(-1)
        );
        String expectedMessage = "n must be greater than or equal to 0";
        assertEquals(expectedMessage, exception.getMessage());
    }
}