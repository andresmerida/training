package org.andres.training.coderbyte.find_intersection;

import java.util.HashMap;
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
 * Example 2
 * Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
 * Output: 1,9,10
 */
public class FindIntersection {
    public static void main(String[] args) {
        String[] arrayString = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        findIntersection(arrayString);
    }

    public static void findIntersection(String[] arrayString) {
        StringTokenizer tokenizer = new StringTokenizer(arrayString[0], ",");
        HashMap<String, String> stringMap = toMap(tokenizer);

        StringTokenizer tokenizerSecond = new StringTokenizer(arrayString[1], ",");
        int tokenCount = tokenizerSecond.countTokens();
        int counter = 0;
        StringBuilder intersectionValues = new StringBuilder();
        for (int i=0; i < tokenCount; i++) {
            String tokenValue = tokenizerSecond.nextToken().trim();
            if (stringMap.containsKey(tokenValue)) {
                if (counter != 0) {
                    intersectionValues.append(",").append(tokenValue);
                } else {
                    intersectionValues.append(tokenValue);
                }
                counter++;
            }
        }

        System.out.println(intersectionValues.toString());
    }

    private static HashMap<String, String> toMap(StringTokenizer tokenizer) {
        HashMap<String, String> stringMap = new HashMap<>();
        int tokenCount = tokenizer.countTokens();
        for (int i=0; i < tokenCount; i++) {
            String tokenValue = tokenizer.nextToken().trim();
            stringMap.put(tokenValue, tokenValue);
        }

        return stringMap;
    }
}
