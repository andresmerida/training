package org.andres.training.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        filterAndMapList(Arrays.asList(1,2,3,4));
        int[] input = {1,1,2,3,-2,-2};
        System.out.println(Arrays.toString(removeDuplicateInPlace(input)));
        String abc = "abc";
    }

    public static void filterAndMapList(List<Integer> integerList) {
        Integer secondLargestNumber = integerList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondLargestNumber);
    }

    public static int[] removeDuplicateInPlace(int[] data) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (data[i] == data[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                data[index] = data[i];
                index++;
            }
        }

        return Arrays.copyOf(data, index);
    }
}

