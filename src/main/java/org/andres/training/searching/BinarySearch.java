package org.andres.training.searching;

/**
 * Binary Search Algorithm is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half.
 * The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(log N).
 * Consider an array arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, and the target = 23.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println(implementBinarySearch(array, 100));
    }

    private static boolean implementBinarySearch(int[] array, int target) {
        int sizeArray = array.length;
        int low = 0, high = sizeArray - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == array[mid]) {
                return true;
            }
            if (target < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false; // not present
    }
}
