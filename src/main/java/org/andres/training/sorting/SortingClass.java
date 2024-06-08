package org.andres.training.sorting;

import java.util.Arrays;

public class SortingClass {
    public static void main(String[] args) {
        int[] exampleArray = {8,3,5,9,2,4,7,1,6};
        //bubbleSort(exampleArray);
        selectionSort(exampleArray);
    }

    /**
     * Buble Sort is a simple comparison-based algorithm that repeatedly steps through the list,
     * compare adjacent elements, and swaps them if they are in the wrong order.
     * This process is repeated until the list is sorted.
     * @param array integer array
     */
    public static void bubbleSort(int[] array) {
        int sizeArray = array.length;
        if (sizeArray < 2) {
            throw new IllegalArgumentException("Size of array should be greater than 1");
        }
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < sizeArray - 1; i++) {
            swapped = false;
            for (j = 0; j < sizeArray - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    // swap array[j] and array[j+1]
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            System.out.println("iteration: " + i + ", Array: " + Arrays.toString(array));
            // if no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Another comparison-based algorithm that works by dividing the input into a sorted and an unsorted region.
     * It repeatedly selects the smallest (or largest) element from the unsorted region and moves it to the end
     * of the sorted region
     * @param array integer values
     */
    public static void selectionSort(int[] array) {
        int sizeArray = array.length;
        for (int i = 0; i < sizeArray - 1; i++) {
            // find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < sizeArray; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            System.out.println(Arrays.toString(array));
        }
    }
}
