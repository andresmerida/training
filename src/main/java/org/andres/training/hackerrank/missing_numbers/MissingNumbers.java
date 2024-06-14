package org.andres.training.hackerrank.missing_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Given two arrays of integers, find which elements in the second array are missing from the first array.
 * Example
 * arr = [7,2,5,3,5,3]
 * brr = [7,2,5,4,6,3,5,3]
 * The  array is the original list. The numbers missing are [4,6].
 * Notes
 * If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same.
 * If that is not the case, then it is also a missing number.
 * Return the missing numbers sorted ascending.
 * Only include a missing number once, even if it is missing multiple times.
 * The difference between the maximum and minimum numbers in the original list is less than or equal to .
 */
public class MissingNumbers {
    public static void main(String[] args) {
        //List<Integer> arr = Arrays.asList(7,2,5,3,5,3);
        //List<Integer> brr = Arrays.asList(7,2,5,4,6,3,5,3);
        List<Integer> arr = Arrays.asList(203,204,205,206,207,208,203,204,205,206);
        List<Integer> brr = Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204);
        System.out.println(missingNumbers(arr, brr));
    }

    private static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> missingNumbers = new ArrayList<>();
        arr.sort(Comparator.comparingInt(Integer::intValue));
        brr.sort(Comparator.comparingInt(Integer::intValue));

        System.out.println(arr);
        System.out.println(brr);

        int indexArrayMissing = 0;
        for (int originalValue : brr) {
            if (originalValue == arr.get(indexArrayMissing)) {
                indexArrayMissing++;
            } else {
                missingNumbers.add(originalValue);
            }
        }

        return missingNumbers;
    }
}
