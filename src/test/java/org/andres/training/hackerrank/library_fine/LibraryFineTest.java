package org.andres.training.hackerrank.library_fine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryFineTest {
    private final LibraryFine libraryFine = new LibraryFine();

    @Test
    void libraryFine_same_month() {
        int result = libraryFine.libraryFine(14, 7, 2018,
                5, 7, 2018);
        assertEquals(135, result);
    }

    @Test
    void libraryFine_same_month2() {
        int result = libraryFine.libraryFine(9, 6, 2015,
                6, 6, 2015);
        assertEquals(45, result);
    }

    @Test
    void libraryFine_different_month() {
        int result = libraryFine.libraryFine(9, 8, 2015,
                6, 6, 2015);
        assertEquals(1000, result);
    }
}