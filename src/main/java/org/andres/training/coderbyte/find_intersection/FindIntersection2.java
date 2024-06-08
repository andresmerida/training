package org.andres.training.coderbyte.find_intersection;

import java.util.StringTokenizer;

/**
 * Have the function FindIntersection(strArr) read the array of strings stored in strArr
 * which will contain 2 elements: the first element will represent a list of comma-separated numbers sorted in ascending order,
 * the second element will represent a second list of comma-separated numbers (also sorted).
 * Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order.
 * If there is no intersection, return the string false.
 * Example
 * Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
 * Output: 1,4,13
 *
 */
public class FindIntersection2 {
    public static void main(String[] args) {
        String[] array = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        System.out.println(findIntersection(array));
    }

    public static String findIntersection(String[] arrayString) {
        int[] firstArray = getIntegerArray(new StringTokenizer(arrayString[0], ","));
        int[] secondArray = getIntegerArray(new StringTokenizer(arrayString[1], ","));
        StringBuilder stringBuilder = new StringBuilder();
        int counterIntersection = 0;
        for (int i=0; i<firstArray.length; i++) {
            for (int j=0; j<secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    if (counterIntersection != 0) {
                        stringBuilder.append(",").append(firstArray[i]);
                    } else {
                        stringBuilder.append(firstArray[i]);
                    }
                    counterIntersection++;
                }
            }
        }

        return stringBuilder.toString();
    }

    public static int[] getIntegerArray(StringTokenizer tokenizer) {
        int countTokens = tokenizer.countTokens();
        int[] array = new int[countTokens];
        for (int i=0; i<countTokens; i++) {
            array[i] = Integer.parseInt(tokenizer.nextToken().trim());
        }

        return array;
    }
}
