package org.andres.training.coding_questions.unique_characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharactersTest {
    private final UniqueCharacters uniqueCharacters;

    public UniqueCharactersTest() {
        uniqueCharacters = new UniqueCharacters();
    }

    @Test
    void getUniqueCharacters() {
        String result = uniqueCharacters.getUniqueCharacters("Java Automation");
        assertEquals("Jav Automin", result);
    }

    @Test
    void getUniqueCharacters_returnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> uniqueCharacters.getUniqueCharacters(null));
    }
}