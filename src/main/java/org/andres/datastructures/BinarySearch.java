package org.andres.datastructures;

import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public int binarySearch(int[] arr, int key){
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int lowIndex = 0;
        int highIndex = arr.length - 1;
        while(lowIndex <= highIndex) {
            int mid = lowIndex + (highIndex - lowIndex)/2;
            if(arr[mid] == key){
                return mid;
            } else if(arr[mid] < key){
                lowIndex = mid + 1;
            } else {
                highIndex = mid - 1;
            }
        }

        return -1;
    }

    public int binarySearchStream(List<String> arr, String key){
        if (arr == null) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        if(arr.isEmpty()) {
            return -1;
        }

        Collections.sort(arr);
        return Collections.binarySearch(arr, key);
    }
}
