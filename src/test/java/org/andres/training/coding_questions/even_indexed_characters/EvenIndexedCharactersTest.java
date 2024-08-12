package org.andres.training.coding_questions.even_indexed_characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenIndexedCharactersTest {
    private final EvenIndexedCharacters evenIndexedCharacters = new EvenIndexedCharacters();

    @Test
    void getEvenIndexedCharacters_returnExpected() {
        var result = evenIndexedCharacters.getEvenIndexedCharacters("Automation");
        assertEquals("Atmto", result);
    }

    @Test
    void getEvenIndexedCharacters_returnNotExpected() {
        var result = evenIndexedCharacters.getEvenIndexedCharacters("Automation");
        assertNotEquals("Automa", result);
    }

    @Test
    void getEvenIndexedCharacters_ThrowIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> evenIndexedCharacters.getEvenIndexedCharacters(null));
        assertTrue(exception.getMessage().contains("null"));
    }
}