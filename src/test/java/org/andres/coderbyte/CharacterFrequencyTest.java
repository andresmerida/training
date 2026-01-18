package org.andres.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterFrequencyTest {
    private final CharacterFrequency characterFrequency = new CharacterFrequency();

    @Test
    void getMostFrequencyCharacter() {
        String input = "programming is fun";
        assertEquals(2, characterFrequency.getMostFrequencyCharacter(input));
    }

    @Test
    void getMostFrequencyCharacterSecondTest() {
        String input = "programming is fun aaaa";
        assertEquals(5, characterFrequency.getMostFrequencyCharacter(input));
    }

    @Test
    void getMostFrequencyCharacter_emptyString_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> characterFrequency.getMostFrequencyCharacter(""));
    }

    @Test
    void getMostFrequencyCharacter_null_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> characterFrequency.getMostFrequencyCharacter(null));
    }
}