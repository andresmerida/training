package org.andres.training.arrays.second_highest;

import java.util.Arrays;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        Integer[] array = {2,4,6,3,6,5};
        System.out.println(getSecondHighest(array));
        System.out.println("Java8: " + getSecondHighestJava8(array));
    }

    public static int getSecondHighest(Integer[] array) {
        int highest = Integer.MIN_VALUE + 1;
        int secondHighest = Integer.MIN_VALUE;

        for (Integer i : array) {
            if (i > highest) { // new highest found?
                // highest becomes "second highest"
                secondHighest = highest; // make current highest to second highest
                highest = i; // make current value to highest
            } else if (i > secondHighest && i != highest) { // new "second highest" found?
                secondHighest = i;
            }
        }

        return secondHighest;
    }

    public static int getSecondHighestJava8(Integer[] array) {
        List<Integer> integerList = Arrays.asList(array);
        List<Integer> sortedUniqueNumbers = integerList.stream().distinct().sorted().toList();
        return sortedUniqueNumbers.get(sortedUniqueNumbers.size() - 2);
    }
}
