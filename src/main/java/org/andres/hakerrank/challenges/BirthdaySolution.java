package org.andres.hakerrank.challenges;

import java.util.List;

public class BirthdaySolution {

    public int birthday(List<Integer> s, int d, int m) {
        if (d < 1 || d > 31) {
            throw new IllegalArgumentException("Invalid day");
        }

        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("Invalid month");
        }

        if (s.size() < m) {
            return 0;
        }

        int sumDay = 0;
        int counter = 0;
        for (int i = 0; i < s.size() - m; i++) {
            for (int j = i; j < i + m; j++) {
                sumDay += s.get(j);
            }
            if (sumDay == d) {
                counter++;
            }
            sumDay = 0;
        }

        return counter;
    }

    public int birthdayBestSolution(List<Integer> s, int d, int m) {
        if (d < 1 || d > 31) {
            throw new IllegalArgumentException("Invalid day");
        }

        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("Invalid month");
        }

        if (s.size() < m) {
            return 0;
        }

        int currentSum = 0;
        int counter = 0;

        for (int i = 0; i < m; i++) {
            currentSum += s.get(i);
        }

        if (currentSum == d) {
            counter++;
        }

        for (int i = m; i < s.size(); i++) {
            currentSum += s.get(i) - s.get(i - m);
            if (currentSum == d) {
                counter++;
            }
        }

        return counter;
    }
}
