package org.andres.training.coderbyte.questions_marks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionMarkTest {
    private QuestionMark questionMark;

    @BeforeEach
    void setUp() {
        questionMark = new QuestionMark();
    }

    @Test
    void questionsMarks_isTrue() {
        String inputStr = "arrb6???4xxbl5???eee5";
        var result = questionMark.questionsMarks(inputStr);
        assertTrue(result);
    }

    @Test
    void questionsMarks_isTrueComplex() {
        String inputStr = "arrb6???axxbl5???eee5";
        var result = questionMark.questionsMarks(inputStr);
        assertTrue(result);
    }

    @Test
    void questionsMarks_isFalse() {
        String inputStr = "aa6?9";
        var result = questionMark.questionsMarks(inputStr);
        assertFalse(result);
    }

    @Test
    void questionsMarks_returnsIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> questionMark.questionsMarks(""));
        assertTrue(exception.getMessage().contains("empty"));
    }
}