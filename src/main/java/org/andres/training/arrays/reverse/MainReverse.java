package org.andres.training.arrays.reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainReverse {

    public static void main(String[] args) {
        String stringReverse = "HELLO";
        char[] charArray = stringReverse.toCharArray();

        reverseUsingCollections(stringReverse.toCharArray());
        System.out.println();
        reverseCharArray(charArray);
        System.out.println();
        reverseInPlaceArray(charArray);
    }

    static void reverseUsingCollections(char[] chars) {
        System.out.println("reverseUsingCollections Initials: " + Arrays.toString(chars));
        List listArray = new ArrayList();
        for (char c : chars) {
            listArray.add(c);
        }

        Collections.reverse(listArray);
        // parse to string
        String stringReverse = (String) listArray.stream().map(String::valueOf).collect(Collectors.joining());

        System.out.println("reverseUsingCollections reversed: " +
                Arrays.toString(stringReverse.toCharArray())
        );
    }

    static void reverseCharArray(char[] charArray) {
        System.out.println("Original string: " + new String(charArray));
        char[] reverseCharArray = new char[charArray.length];
        int j = charArray.length - 1;
        for (int i=0; i<charArray.length; i++) {
            reverseCharArray[i] = charArray[j];
            j--;
        }
        System.out.println("Reverse string: " + new String(reverseCharArray));
    }

    /**
     * In-place Reversal Of Array
     * The third method of array reversal is reversing the elements
     * of array in-place without using a separate array. In this method,
     * the first element of the array is swapped with the last element of the array. Similarly,
     * the second element of the array is swapped with the second last element of the array and so on.
     */
    static void reverseInPlaceArray(char[] charArray) {
        System.out.println("reverseInPlaceArray initial: " + Arrays.toString(charArray));
        char temp;
        for (int i=0; i < charArray.length / 2; i++) {
            temp = charArray[0];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }
        System.out.println("reverseInPlaceArray reversed: " + Arrays.toString(charArray));
    }
}
