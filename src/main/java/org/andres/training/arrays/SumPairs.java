package org.andres.training.arrays;

import java.util.HashSet;
import java.util.Set;

public class SumPairs {
    public static void main(String[] args) {
        int[] sum = {1,5,7,-1,5,4};
        System.out.println(getAllPairs(sum, 6));
    }

    public static String getAllPairs(int[] arr, int sum) {
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (sum == arr[i] + arr[j]) {
                    stringSet.add(String.format("(%s,%s)", arr[i], arr[j]));
                }
            }
        }
        return String.join(",", stringSet);
    }
}
