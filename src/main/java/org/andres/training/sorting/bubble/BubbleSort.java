package org.andres.training.sorting.bubble;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {45, 50, 98, 41};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] array) {
        int sizeArray = array.length;
        for (int i = 0; i < sizeArray - 1; i++) {
            for (int j = 0; j < sizeArray - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
