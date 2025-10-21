package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemovingDuplicatesCharsTest {
    private final RemovingDuplicatesChars removingDuplicatesChars = new RemovingDuplicatesChars();

    @Test
    void removeDuplicatesCharacters() {
        String resultExpected = "geksfor";
        assertEquals(resultExpected, removingDuplicatesChars.removeDuplicatesCharacters("geeksforgeeks"));
    }

    @Test
    void removeDuplicatesCharacters_ThrowIllegalArgumentException_null() {
        assertThrows(IllegalArgumentException.class, () -> removingDuplicatesChars.removeDuplicatesCharacters(null));
    }

    @Test
    void removeDuplicatesCharacters_ThrowIllegalArgumentException_empty() {
        assertThrows(IllegalArgumentException.class, () -> removingDuplicatesChars.removeDuplicatesCharacters(""));
    }

    @Test
    void removeDuplicatesCharacters_withASCIIValuesTest() {
        String resultExpected = "geksfor";
        assertEquals(resultExpected,
                removingDuplicatesChars.removeDuplicatesCharacters_withASCIIValues("geeksforgeeks"));
    }
}