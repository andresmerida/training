package org.andres.training.hackerrank.sherlock_and_squares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndSquaresTest {
    private final SherlockAndSquares squares = new SherlockAndSquares();

    @Test
    void squares() {
        int result = squares.squares(3,9);
        assertEquals(2, result);
    }

    @Test
    void squares_zero() {
        int result = squares.squares(17,24);
        assertEquals(0, result);
    }
}