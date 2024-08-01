package org.andres.training.coding_questions.number_of_words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfWordsTest {
    private final NumberOfWords numberOfWords = new NumberOfWords();

    @Test
    void numberOfWordsTest() {
        var result = numberOfWords.numberOfWords("Welcome to Java World");
        assertEquals(4, result);
    }

    @Test
    void numberOfWords_returnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> numberOfWords.numberOfWords(null));
        assertTrue(exception.getMessage().contains("null"));
    }

    @Test
    void numberOfWords2() {
        var result = numberOfWords.numberOfWords2("Welcome to Java World");
        assertEquals(4, result);
    }
}