package org.andres.training.sorting.insertion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] anyArray = {45, 50, 98, 41};
        System.out.println(Arrays.toString(anyArray));
        insertionSort(anyArray);
        System.out.println(Arrays.toString(anyArray));
    }

    public static void insertionSort(int[] array) {
        int arraySize = array.length;
        for (int i = 1; i < arraySize; i++) {
            int key = array[i];
            int j = i -1;
            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
