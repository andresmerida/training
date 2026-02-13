package org.andres.hakerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BirthdaySolutionTest {
    private final BirthdaySolution birthdaySolution = new BirthdaySolution();

    @Test
    void birthday() {
        List<Integer> input = List.of(2, 2, 1, 3, 2);
        int d = 4;
        int m = 2;
        int expected = 2;

        assertEquals(expected, birthdaySolution.birthday(input, d, m));
    }

    @Test
    void birthday_case2() {
        List<Integer> input = List.of(1,2,1,3,2);
        int d = 3;
        int m = 2;
        int expected = 2;

        assertEquals(expected, birthdaySolution.birthday(input, d, m));
    }

    @Test
    void birthday_case3() {
        List<Integer> input = List.of(1,1,1,1,1,1);
        int d = 3;
        int m = 2;
        int expected = 0;

        assertEquals(expected, birthdaySolution.birthday(input, d, m));
    }

    @Test
    void birthday_invalidDay() {
        List<Integer> input = List.of(1,2,1,3,2);
        int d = 32;
        int m = 2;

        assertThrows(IllegalArgumentException.class, () -> birthdaySolution.birthday(input, d, m));
    }

    @Test
    void birthday_invalidMonth() {
        List<Integer> input = List.of(1,2,1,3,2);
        int d = 3;
        int m = 13;

        assertThrows(IllegalArgumentException.class, () -> birthdaySolution.birthday(input, d, m));
    }

    @Test
    void birthday_monthGreaterThanSumOfDays() {
        List<Integer> input = List.of(1,2,1,3,2);
        int d = 3;
        int m = 6;

        assertEquals(0, birthdaySolution.birthday(input, d, m));
    }

    @Test
    void birthdayBestSolution() {
        List<Integer> input = List.of(2, 2, 1, 3, 2);
        int d = 4;
        int m = 2;
        int expected = 2;

        assertEquals(expected, birthdaySolution.birthdayBestSolution(input, d, m));
    }

    @Test
    void birthdayBestSolution_case2() {
        List<Integer> input = List.of(1,2,1,3,2);
        int d = 3;
        int m = 2;
        int expected = 2;

        assertEquals(expected, birthdaySolution.birthdayBestSolution(input, d, m));
    }

    @Test
    void birthdayBestSolution_case3() {
        List<Integer> input = List.of(1,1,1,1,1,1);
        int d = 3;
        int m = 2;
        int expected = 0;

        assertEquals(expected, birthdaySolution.birthdayBestSolution(input, d, m));
    }

    @Test
    void birthdayBestSolution_invalidDay() {
        List<Integer> input = List.of(1,2,1,3,2);
        int d = 32;
        int m = 2;

        assertThrows(IllegalArgumentException.class, () -> birthdaySolution.birthdayBestSolution(input, d, m));
    }

    @Test
    void birthdayBestSolution_invalidMonth() {
        List<Integer> input = List.of(1,2,1,3,2);
        int d = 3;
        int m = 13;

        assertThrows(IllegalArgumentException.class, () -> birthdaySolution.birthdayBestSolution(input, d, m));
    }

    @Test
    void birthdayBestSolution_monthGreaterThanSumOfDays() {
        List<Integer> input = List.of(1,2,1,3,2);
        int d = 3;
        int m = 6;

        assertEquals(0, birthdaySolution.birthdayBestSolution(input, d, m));
    }
}