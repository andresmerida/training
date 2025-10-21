package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    private final ReverseInteger instance = new ReverseInteger();

    @Test
    void reverseOneDigit() {
        assertEquals(3,instance.reverse(3));
    }

    @Test
    void reverseTwoDigits() {
        assertEquals(2,instance.reverse(20));
    }

    @Test
    void reverseFourDigits() {
        assertEquals(4321,instance.reverse(1234));
    }

    @Test
    void reverseThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> instance.reverse(-1));
    }
}