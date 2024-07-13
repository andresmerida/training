package org.andres.training.hackerrank.append_and_delete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppendAndDeleteTest {
    AppendAndDelete appendAndDelete = new AppendAndDelete();

    @Test
    void appendAndDelete_abc_and_def() {
        String result = appendAndDelete.appendAndDelete("abc", "def", 6);
        assertEquals("Yes", result);
    }

    @Test
    void appendAndDelete_hackerHappy_and_hackerrank() {
        String result = appendAndDelete.appendAndDelete("hackerhappy", "hackerrank", 9);
        assertEquals("Yes", result);
    }

    @Test
    void appendAndDelete_aba_and_aba() {
        String result = appendAndDelete.appendAndDelete("aba", "aba", 7);
        assertEquals("Yes", result);
    }

    @Test
    void appendAndDelete_ashley_and_ash() {
        String result = appendAndDelete.appendAndDelete("ashley", "ash", 2);
        assertEquals("No", result);
    }
}