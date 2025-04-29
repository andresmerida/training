package org.andres.training.youtube1;

public class RotationArray {

    public int[] rotateWithTemp(int[] array, int numberOfRotation) {
        // storing rotated version of array
        int[] rotatedArray = new int[array.length];
        int index = 0;  // Keeping track of the current index of temp[]

        for (int i = numberOfRotation; i < array.length; i++) {
            rotatedArray[index] = array[i];
            index++;
        }

        // Storing the first numberOfRotation array[] into temp
        for (int i = 0; i < numberOfRotation; i++) {
            rotatedArray[index] = array[i];
            index++;
        }

        return rotatedArray;
    }
}
