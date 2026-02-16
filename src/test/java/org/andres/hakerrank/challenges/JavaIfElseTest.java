package org.andres.hakerrank.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaIfElseTest {
    private final JavaIfElse javaIfElse = new JavaIfElse();

    @Test
    void isWeird_1() {
        int input = 1;
        assertEquals("Weird", javaIfElse.isWeird(input));
    }

    @Test
    void isWeird_2() {
        int input = 2;
        assertEquals("Not Weird", javaIfElse.isWeird(input));
    }

    @Test
    void isWeird_9() {
        int input = 9;
        assertEquals("Weird", javaIfElse.isWeird(input));
    }

    @Test
    void isWeird_8() {
        int input = 9;
        assertEquals("Weird", javaIfElse.isWeird(input));
    }

    @Test
    void isWeird_greater_than_20() {
        int input = 24;
        assertEquals("Not Weird", javaIfElse.isWeird(input));
    }

    @Test
    void isWeird_throwIllegalArgumentException_negative() {
        assertThrows(IllegalArgumentException.class, () -> javaIfElse.isWeird(-1));
    }

    @Test
    void isWeird_throwIllegalArgumentException_zero() {
        assertThrows(IllegalArgumentException.class, () -> javaIfElse.isWeird(0));
    }

    @Test
    void isWeird_throwIllegalArgumentException_200() {
        assertThrows(IllegalArgumentException.class, () -> javaIfElse.isWeird(200));
    }
}