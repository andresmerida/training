package org.andres.training.arrays.rotation;

public class ArrayRotation {
    public int[] rotate(int[] array, int d) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty");
        }

        int[] tempArray = new int[array.length];
        // keeping track of the current index of temp[]
        int index = 0;

        // Storing the n-d elements of array arr[] to the front of temp[]
        for (int i = d; i < array.length; i++) {
            tempArray[index] = array[i];
            index++;
        }

        // Storing the first d elements of array arr[] into temp
        for (int i = 0; i < d; i++) {
            tempArray[index] = array[i];
            index++;
        }

        return tempArray;
    }

    public int[] rotateOneByOne(int[] array, int d) {
        int rotations = 0;
        while (rotations < d) {
            int lastValue = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = lastValue;
            rotations++;
        }

        return array;
    }
}
