package org.andres.training.others;

import java.util.Arrays;

public class SumElements {

    public int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Number array is null or empty");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public int sumWithStream(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Number array is null or empty");
        }

        return Arrays.stream(numbers).sum();
    }
}
