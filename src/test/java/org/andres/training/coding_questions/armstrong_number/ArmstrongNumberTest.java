package org.andres.training.coding_questions.armstrong_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongNumberTest {
    private final ArmstrongNumber armstrongNumber = new ArmstrongNumber();

    @Test
    void isArmstrong_shouldReturnTrueWithThreeDigits() {
        assertTrue(armstrongNumber.isArmstrong(153));
    }

    @Test
    void isArmstrong_shouldReturnTrueWithFourDigits() {
        assertTrue(armstrongNumber.isArmstrong(1634));
    }

    @Test
    void isArmstrong_shouldReturnFalse() {
        assertFalse(armstrongNumber.isArmstrong(154));
    }

    @Test
    void isArmstrong_shouldReturnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> armstrongNumber.isArmstrong(-1));
        assertTrue(exception.getMessage().contains("The given number is negative"));
    }

    @Test
    void getNumberOfDigits_shouldReturnThreeDigits() {
        var result = armstrongNumber.getNumberOfDigits(123);
        assertEquals(3, result);
    }

    void getNumberOfDigits_shouldReturnFiveDigits() {
        var result = armstrongNumber.getNumberOfDigits(12345);
        assertEquals(5, result);
    }
}