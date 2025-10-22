package org.andres.training.others;

public class ReverseArray {

    public int[] reverse(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - i - 1];
        }

        return temp;
    }
}
