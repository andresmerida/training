package org.andres.training.coderbyte.find_intersection;

import java.util.Arrays;
import java.util.List;

/**
 * Have the function FindIntersection(strArr) read the array of strings stored in strArr
 * which will contain 2 elements: the first element will represent a list of comma-separated numbers sorted in ascending order,
 * the second element will represent a second list of comma-separated numbers (also sorted).
 * Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order.
 * If there is no intersection, return the string false.
 * Example
 * Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
 * Output: 1,4,13
 * Example 2
 * Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
 * Output: 1,9,10
 */
public class FindIntersection {

    public String findIntersection(String[] arrayString) {
        List<String> list1 = Arrays.asList(arrayString[0].split(", "));
        List<String> list2 = Arrays.asList(arrayString[1].split(", "));

        List<String> intersectionList = list1.stream().filter(list2::contains).toList();
        return intersectionList.isEmpty() ? "false" : String.join(", ", intersectionList);
    }
}
