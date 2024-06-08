package org.andres.training.coderbyte.find_intersection;

import java.util.Arrays;
import java.util.List;

public class FindIntersectionCollection {
    public static void main(String[] args) {
        String[] array = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        System.out.println(findIntersection(array));
    }

    public static String findIntersection(String[] strArr) {
        List<String> listOne = Arrays.asList(strArr[0].split(", "));
        List<String> listTwo = Arrays.asList(strArr[1].split(", "));
        List<String> listIntersection = listOne.stream()
                .filter(listTwo::contains)
                .toList();

        return listIntersection.isEmpty() ? "false" : String.join(",", listIntersection);
    }
}
