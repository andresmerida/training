package org.andres.training.coderbyte.longest_word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestWordTest {
    private final LongestWord longestWord = new LongestWord();

    @Test
    void longestWord_when_word_not_contain_any_punctuation() {
        String result = longestWord.longestWord("I love dogs");
        assertEquals("love", result);
    }

    @Test
    void longestWord_when_word_contain_punctuation() {
        String result = longestWord.longestWord("fun&!! time");
        assertEquals("time", result);
    }

    @Test
    void longestWord2_when_word_not_contain_any_punctuation() {
        String result = longestWord.longestWord2("I love dogs");
        assertEquals("love", result);
    }

    @Test
    void longestWord2_when_word_contain_punctuation() {
        String result = longestWord.longestWord2("fun&!! time");
        assertEquals("time", result);
    }

    @Test
    void longestWord_when_sen_is_empty() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> longestWord.longestWord2(""));
        assertEquals("Empty String", exception.getMessage());
    }

    @Test
    void ignorePunctuation_when_word_contains_punctuation() {
        String result = longestWord.ignorePunctuation("Abc!");
        assertEquals("Abc", result);
    }
}