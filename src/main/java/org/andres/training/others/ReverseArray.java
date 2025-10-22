package org.andres.training.others;

public class ReverseArray {

    public int[] reverse(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - i - 1];
        }

        return temp;
    }

    public int[] reverseSolution2(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        if (arr.length == 1) {
            return arr;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    public int[] reverseSolution3(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        if (arr.length == 1) {
            return arr;
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }
}
