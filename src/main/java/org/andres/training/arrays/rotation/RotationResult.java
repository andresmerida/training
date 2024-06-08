package org.andres.training.arrays.rotation;

import java.util.Arrays;

public class RotationResult {

    public static void main(String[] args) {
        RotationResult rotationResult = new RotationResult();
        int intArray[] = {1,2,3,4,5,6,7};
        int numberOfRotation = 2;
        System.out.println(Arrays.toString(intArray));
        rotationResult.leftRotate(intArray, numberOfRotation);
        System.out.println("Number of rotation: " + numberOfRotation);
        System.out.println(Arrays.toString(intArray));
    }

    public void leftRotate(int arr[], int numberOfRotation) {
        for (int i = 0; i < numberOfRotation; i++) {
            this.rotateOneByOne(arr, arr.length);
        }
    }

    public void rotateOneByOne(int arr[], int sizeArray) {
        int temp = arr[0];
        for (int i = 0; i < sizeArray - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[sizeArray-1] = temp;
    }
}
