package org.andres.coderbyte;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public int missingNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int n = numbers.length + 1;
        int sumArray = n*(n+1)/2;

        return sumArray - Arrays.stream(numbers).sum();
    }

    public Integer[] missingNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        Arrays.sort(numbers);
        Set<Integer> set = new HashSet<>();
        for (int i = numbers[0]; i <= numbers[numbers.length - 1]; i++) {
            set.add(i);
        }

        for (int num : numbers) {
            set.remove(num);
        }

        return set.toArray(Integer[]::new);
    }
}
