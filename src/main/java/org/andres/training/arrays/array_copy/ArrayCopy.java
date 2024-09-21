package org.andres.training.arrays.array_copy;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4};
        copyIteratingEachElement(arrayA);
        copyArrayWithCloneMethod(arrayA);
        copyArrayWithCopyOfRange(arrayA);
    }

    private static void copyArrayWithCopyOfRange(int[] arrayA) {
        System.out.println();
        System.out.println("==== copyArrayWithCopyOfRange ====");
        int[] arrayB = Arrays.copyOfRange(arrayA, 2, arrayA.length);
        printArray(arrayA);
        System.out.println();
        arrayB[1]++;
        printArray(arrayB);
    }

    public static void copyArrayWithCloneMethod(int[] arrayA) {
        System.out.println("==== copy array with clone method ====");
        int[] arrayB = arrayA.clone();
        printArray(arrayA);
        System.out.println();
        arrayB[3]++;        // changing arrayB to see difference
        printArray(arrayB);
    }

    public static void copyIteratingEachElement(int[] arrayA) {
        int[] arrayB = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayA[i];
        }

        printArray(arrayA);
        System.out.println();
        arrayB[0]++;        // changing arrayB to see difference
        printArray(arrayB);
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
