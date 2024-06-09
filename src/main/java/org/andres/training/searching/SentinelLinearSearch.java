package org.andres.training.searching;

public class SentinelLinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 180, 30, 60, 50, 110, 100, 70};
        sentinelLinearSearch(array, 180);
    }

    private static void sentinelLinearSearch(int[] array, int searchValue) {
        int lastValue = array[array.length - 1];    // last element of the array
        // element to be searched is placed at the last index
        array[array.length-1] = searchValue;

        int i=0;
        while (array[i] != searchValue) {
            i++;
        }

        // put the last element back
        array[array.length-1] = lastValue;
        if ((i < array.length - 1) || (array[array.length-1] == searchValue)) {
            System.out.println(searchValue + " is present at index " + i);
        } else {
            System.out.println("Element not present!");
        }
    }
}
