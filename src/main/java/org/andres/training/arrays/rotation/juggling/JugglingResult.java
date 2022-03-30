package org.andres.training.arrays.rotation.juggling;

import java.util.Arrays;

public class JugglingResult {
    public static void main(String[] args) {
        JugglingResult jugglingResult = new JugglingResult();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int numberOfRotation = 2;
        System.out.println(Arrays.toString(arr));
        System.out.println("Number of rotation: " + numberOfRotation);
        jugglingResult.leftRotate(arr, numberOfRotation, 7);
        System.out.println(Arrays.toString(arr));
    }

    public void leftRotate(int arr[], int d, int sizeArray) {
        // to handle if d >= n
        d = d % sizeArray;
        int i, j, k, temp;
        int g_d_c = this.gcd(d, sizeArray);

        for (i=0; i < g_d_c; i++) {
            // move i-th values of blocks
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= sizeArray) {
                    k = k - sizeArray;
                }
                if (k == i) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    /**
     * Function to get gcd of a and b
     * @param a
     * @param b
     */
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
