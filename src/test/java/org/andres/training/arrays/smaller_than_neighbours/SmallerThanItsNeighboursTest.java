package org.andres.training.arrays.smaller_than_neighbours;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallerThanItsNeighboursTest {
    private final SmallerThanItsNeighbours smallerThanItsNeighbours = new SmallerThanItsNeighbours();

    @Test
    void smallerThanNeighbours_shouldReturnSmallerThanItsNeighbours() {
        var result = smallerThanItsNeighbours.smallerThanNeighbours(new int[]{5, 10, 20, 15});
        int resultExpected = 20;
        assertEquals(resultExpected, result);
    }

    @Test
    void smallerThanNeighbours_shouldReturnZero() {
        var result = smallerThanItsNeighbours.smallerThanNeighbours(new int[]{5, 6, 9, 15});
        int resultExpected = 0;
        assertEquals(resultExpected, result);
    }

    @Test
    void smallerThanNeighbours_shouldReturnIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> smallerThanItsNeighbours.smallerThanNeighbours(null) );

        assertTrue(exception.getMessage().contains("null"));
    }
}