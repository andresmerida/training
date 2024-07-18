package org.andres.training.coderbyte.codeland_username_validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsernameValidationTest {
    private final UsernameValidation usernameValidation = new UsernameValidation();

    @Test
    void usernameValid_returnsTrue() {
        boolean res = usernameValidation.usernameValid("u__hello_world123");
        assertTrue(res);
    }

    @Test
    void usernameValid_returnsFalse() {
        boolean res = usernameValidation.usernameValid("aa_");
        assertFalse(res);
    }

    @Test
    void usernameValid_numberInit_returnsFalse() {
        boolean res = usernameValidation.usernameValid("1aa_");
        assertFalse(res);
    }

    @Test
    void usernameValid_letterUpperCaseInit_returnsFalse() {
        boolean res = usernameValidation.usernameValid("Aaa_hello_world123");
        assertTrue(res);
    }
}