package org.andres.training.hackerrank.angry_professor;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AngryProfessorTest {
    private final AngryProfessor angryProfessor = new AngryProfessor();

    @Test
    void angryProfessor_class_is_canceled() {
        String result = angryProfessor.angryProfessorCancelledClass(3, List.of(-1,-3,4,2));
        assertEquals("YES", result);
    }

    @Test
    void angryProfessor_class_not_canceled() {
        String result = angryProfessor.angryProfessorCancelledClass(2, List.of(0,-1,2,1));
        assertEquals("NO", result);
    }

    @Test
    void angryProfessor_IllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            angryProfessor.angryProfessorCancelledClass(0, List.of(-1,-3,4,2));
        });
        assertTrue(exception.getMessage().contains("K must be grater than to 0"));
    }
}