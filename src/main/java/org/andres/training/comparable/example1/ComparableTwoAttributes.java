package org.andres.training.comparable.example1;

import java.util.Arrays;

public class ComparableTwoAttributes {
    public static void main(String[] args) {
        Pair[] pairs = new Pair[4];
        pairs[0] = new Pair("abc", 3);
        pairs[1] = new Pair("a", 4);
        pairs[2] = new Pair("bc", 5);
        pairs[3] = new Pair("a", 2);

        System.out.println("Before sorting: ");
        printPairs(pairs);

        // Sorting the array
        System.out.println();
        Arrays.sort(pairs);
        printPairs(pairs);
    }

    private static void printPairs(Pair[] pairs) {
        for (Pair pair : pairs) {
            System.out.println(pair.toString());
        }
    }
}
