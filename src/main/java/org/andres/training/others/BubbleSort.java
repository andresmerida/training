package org.andres.training.others;

public class BubbleSort {

    public int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        if (arr.length == 1) {
            return arr;
        }

        int lastIndex = arr.length - 1;
        boolean swaped;
        while (lastIndex > 0) {
            swaped = false;
            for (int i = 0; i < lastIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swaped = true;
                }
            }
            lastIndex--;
            if (!swaped) {
                break;
            }
        }

        return arr;
    }
}
