package org.andres.training.others;

import java.util.Arrays;

public class LargestNumberFinder {

    public int largestNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        if (numbers.length == 1) {
            return numbers[0];
        }

        int largestElement = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestElement) {
                largestElement = numbers[i];
            }
        }

        return largestElement;
    }

    public int getMaxNumberElement(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        if (numbers.length == 1) {
            return numbers[0];
        }

        return Arrays.stream(numbers).max().getAsInt();
    }
}
