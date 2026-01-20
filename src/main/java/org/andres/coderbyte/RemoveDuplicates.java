package org.andres.coderbyte;

import java.util.*;

public class RemoveDuplicates {

    public Integer[] removeDuplicates(Integer[] numbersWithDuplicates) {
        if (numbersWithDuplicates == null || numbersWithDuplicates.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        Set<Integer> set = new HashSet<>(Arrays.asList(numbersWithDuplicates));
        return set.toArray(new Integer[0]);
    }

    public Integer[] removeDuplicatesWithStreams(Integer[] numbersWithDuplicates) {
        if (numbersWithDuplicates == null || numbersWithDuplicates.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        return Arrays.stream(numbersWithDuplicates)
                .distinct()
                .toArray(Integer[]::new);
    }
}
