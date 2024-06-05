package org.andres.training.sorting.selection;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {29, 10, 14, 37, 13};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        int sizeArray = array.length;
        for (int i = 0; i < sizeArray - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < sizeArray; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // swap arr[i] and arr[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
