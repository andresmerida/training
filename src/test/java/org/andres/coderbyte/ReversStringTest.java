package org.andres.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversStringTest {
    final ReversString reversString = new ReversString();

    @Test
    void reverseStringWithStringBuilderTest() {
        String input = "hello";
        String expected = "olleh";
        assertEquals(expected, reversString.reverseStringWithStringBuilder(input));
    }

    @Test
    void reverseStringWithStringBuilderWithNullValue_throwExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> reversString.reverseStringWithStringBuilder(null));
    }

    @Test
    void reverseStringWithStringBuilderWithEmptyValue_throwExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> reversString.reverseStringWithStringBuilder(" "));
    }

    @Test
    void reverseStringWithCharAtTest() {
        String input = "hello";
        String expected = "olleh";
        assertEquals(expected, reversString.reverseStringWithCharAt(input));
    }

    @Test
    void reverseStringWithCharAtWithNullValue_throwExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> reversString.reverseStringWithStringBuilder(null));
    }

    @Test
    void reverseStringWithCharAtWithEmptyValue_throwExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> reversString.reverseStringWithStringBuilder(" "));
    }

    @Test
    void reverseStringWithTwoPointersTest() {
        String input = "hello";
        String expected = "olleh";
        assertEquals(expected, reversString.reverseStringWithTwoPointers(input));
    }

    @Test
    void reverseStringWithTwoPointersWithNullValue_throwExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> reversString.reverseStringWithStringBuilder(null));
    }

    @Test
    void reverseStringWithTwoPointersWithEmptyValue_throwExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> reversString.reverseStringWithStringBuilder(" "));
    }
}