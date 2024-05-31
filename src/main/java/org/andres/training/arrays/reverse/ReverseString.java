package org.andres.training.arrays.reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String anyString = "hello";
        System.out.println(getReverseStringBuilder(anyString));
        System.out.println(getReverseCharArray(anyString));
        System.out.println(getReverseStream(anyString));
    }

    public static String getReverseStringBuilder(String input) {
        char[] inputArray = input.toCharArray();
        int lastIndex = input.length()-1;
        StringBuilder reverseStringBuilder = new StringBuilder();

        while (lastIndex > -1) {
            reverseStringBuilder.append(inputArray[lastIndex]);
            lastIndex--;
        }

        return reverseStringBuilder.toString();
    }

    public static String getReverseCharArray(String input) {
        char[] charsInput = input.toCharArray();
        char[] reverseArray = new char[input.length()];
        int index = 0;
        for (int i = input.length() - 1; i > -1; i--) {
            reverseArray[index] = charsInput[i];
            index++;
        }

        return String.valueOf(reverseArray);
    }

    public static String getReverseStream(String input) {
        char[] inputArray = input.toCharArray();
        List<Character> reverseList = new ArrayList<>();
        for (Character c : input.toCharArray()) {
            reverseList.add(c);
        }
        Collections.reverse(reverseList);

        return reverseList.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
