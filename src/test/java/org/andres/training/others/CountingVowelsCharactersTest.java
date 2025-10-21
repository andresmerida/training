package org.andres.training.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingVowelsCharactersTest {
    private final CountingVowelsCharacters countingVowels = new CountingVowelsCharacters();

    @Test
    void countingVowelsCharacters() {
        assertEquals(5, countingVowels.countingVowelsCharacters("GeeksForGeeks"));
    }

    @Test
    void countingVowelsCharactersWithUpperCase() {
        assertEquals(2,  countingVowels.countingVowelsCharacters("ChETaN"));
    }

    @Test
    void countingVowelsCharacters_ThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> countingVowels.countingVowelsCharacters(""));
    }

    @Test
    void countingVowelsCharacters_ThrowIllegalArgumentExceptionNullValue() {
        assertThrows(IllegalArgumentException.class, () -> countingVowels.countingVowelsCharacters(null));
    }
}