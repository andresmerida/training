package org.andres.training.coding_questions.duplicate_characters;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharactersInAStringTest {
    private final DuplicateCharactersInAString duplicateCharactersInAString = new DuplicateCharactersInAString();

    @Test
    void getDuplicateCharacters_shouldReturnDuplicateCharacters() {
        var result = duplicateCharactersInAString.getDuplicateCharacters("Learn Java Programming");
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 4);
        expected.put('g', 2);
        expected.put('m', 2);
        expected.put('n', 2);
        expected.put('r', 3);

        assertEquals(expected, result);
    }

    @Test
    void getDuplicateCharacters_shouldReturnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> duplicateCharactersInAString.getDuplicateCharacters(""));
        assertTrue(exception.getMessage().contains("empty String"));
    }
}