package org.andres.training.coding_questions.reverse_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    private final ReverseString reverseString = new ReverseString();

    @Test
    void reverseString_should_return_reversed_string() {
        var result = reverseString.reverseString("hello");
        assertEquals("olleh", result);
    }

    @Test
    void reverseString_should_return_reversed_long_string() {
        var result = reverseString.reverseString("hello world");
        assertEquals("dlrow olleh", result);
    }

    @Test
    void reverseString_emptyString() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> reverseString.reverseString(""));
        assertTrue(exception.getMessage().contains("empty string"));
    }

    @Test
    void reverseString_nullString() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> reverseString.reverseString(null));
        assertTrue(exception.getMessage().contains("null"));
    }

    @Test
    void reverseStringUsingStringBuilder() {
        var result = reverseString.reverseStringUsingStringBuilder("hello world");
        assertEquals("dlrow olleh", result);
    }

    @Test
    void reverseStringUsingArrays() {
        var result = reverseString.reverseStringUsingArrays("hello world");
        assertEquals("dlrow olleh", result);
    }

    @Test
    void reverseEachWord() {
        var result = reverseString.reverseEachWord("Java is good programming langauges");
        assertEquals("avaJ si doog gnimmargorp seguagnal", result);
    }
}