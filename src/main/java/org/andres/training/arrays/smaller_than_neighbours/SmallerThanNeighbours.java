package org.andres.training.arrays.smaller_than_neighbours;

/**
 * Find a peak element which is not smaller than its neighbours
 * Example:
 * Input: array[]= {5, 10, 20, 15}
 * Output: 20
 * Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
 */
public class SmallerThanNeighbours {

    public static void main(String[] args) {
        int[] array = {5, 10, 20, 15};
        System.out.println(getSmallerThanNeighbours(array));
    }

    private static int getSmallerThanNeighbours(int[] array) {
        int sizeArray = array.length;
        int res = 0;
        if (array[0] > array[1]) {
            return array[0];
        }

        if (array[sizeArray - 1] > array[sizeArray - 2]) {
            return array[sizeArray - 1];
        }

        for (int i = 1; i < sizeArray - 1; i++) {
            if (array[i] > array[i-1] && array[i] > array[i+1]) {
                res = array[i];
                break;
            }
        }

        return res;
    }
}

