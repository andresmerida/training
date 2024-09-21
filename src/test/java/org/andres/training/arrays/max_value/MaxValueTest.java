package org.andres.training.arrays.max_value;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxValueTest {
    private MaxValue maxValue;

    @BeforeEach
    void setUp() {
        maxValue = new MaxValue();
    }

    @Test
    void maxValue_shouldReturnMaxValue() {
        var result = maxValue.getMaxValue(new int[]{1, 4, 5, 2, 3});
        assertEquals(5, result);
    }

    @Test
    void maxValue_shouldReturnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> maxValue.getMaxValue(null));
        assertTrue(exception.getMessage().contains("null"));
    }
}