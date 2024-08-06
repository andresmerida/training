package org.andres.training.coding_questions.vowels_consonants;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VowelsConsonantsTest {
    private final VowelsConsonants vowelsConsonants;

    VowelsConsonantsTest() {
        vowelsConsonants = new VowelsConsonants();
    }

    @Test
    void vowelsConsonantsCounter_returnOkValue() {
        var result = vowelsConsonants.vowelsConsonantsCounter("Hello World");
        Map<String, Integer> resultExpected = Map.ofEntries(Map.entry(VowelsConsonants.VOWELS_STRING, 3),
                Map.entry(VowelsConsonants.CONSONANTS_STRING, 7));
        assertEquals(resultExpected, result);
    }

    @Test
    void vowelsConsonantsCounter_returnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> vowelsConsonants.vowelsConsonantsCounter(null));
        assertTrue(exception.getMessage().contains("null"));
    }
}