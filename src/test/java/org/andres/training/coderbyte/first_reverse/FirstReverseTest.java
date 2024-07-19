package org.andres.training.coderbyte.first_reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstReverseTest {
    private final FirstReverse firstReverse = new FirstReverse();
    @Test
    void firstReverse_example() {
        String result = firstReverse.firstReverse("Hello World and Coders");
        assertEquals("sredoC dna dlroW olleH", result);
    }

    @Test
    void firstReverse_when_input_is_null() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            firstReverse.firstReverse(null);
        });
        assertEquals("String cannot be null or empty", exception.getMessage());
    }

    @Test
    void firstReverse_when_input_is_empty() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            firstReverse.firstReverse("");
        });
        assertEquals("String cannot be null or empty", exception.getMessage());
    }
}