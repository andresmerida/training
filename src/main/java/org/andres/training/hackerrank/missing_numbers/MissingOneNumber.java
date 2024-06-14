package org.andres.training.hackerrank.missing_numbers;

import java.util.Arrays;

/**
 * Let’s imagine that we’ve got the numbers array with integers in the range [1-9], both inclusive:
 * { 1, 4, 5, 2, 7, 8, 6, 9 }
 * Now, we aim to find the missing number from the array in the range [1-9].
 * Missing number 3
 */
public class MissingOneNumber {
    public static void main(String[] args) {
        int[] integers = {1, 4, 5, 2, 7, 8, 6, 9};
        int limitNumber = 9;
        System.out.println(getMissingNumber(integers, limitNumber));
        System.out.println(getMissingNumberSorting(integers, limitNumber));
    }

    private static int getMissingNumber(int[] integers, int limitNumber) {
        int expectedSum = (limitNumber * (limitNumber + 1)) / 2;
        int sum = Arrays.stream(integers).sum();
        return expectedSum - sum;
    }

    private static int getMissingNumberSorting(int[] numbers, int limitNumber) {
        Arrays.sort(numbers);
        int missingNumber = -1;
        for (int i = 0; i < limitNumber; i++) {
            if (numbers[i] != i + 1) {
                missingNumber = i + 1;
                break;
            }
        }

        return missingNumber;
    }
}
