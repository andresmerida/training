package org.andres.training.strings.common.prefix;

import java.util.Arrays;

/**
 * Problem Statement: Given a set of strings, find the longest common prefix.
 * Examples:
 * Input: {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
 * Output: “gee”
 * </p>
 * Input: {“apple”, “ape”, “april”}
 * Output: “ap”
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = {"apple", "ape", "april"};
        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] stringsArray) {
        int size = stringsArray.length;
        // if size is 0, return empty string
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return stringsArray[0];
        }

        // sort the array of strings
        Arrays.sort(stringsArray);

        // find the minimum length from first and last string
        int end = Math.min(stringsArray[0].length(), stringsArray[size -1].length());

        // find the common length from first and last string
        int i = 0;
        while (i < end && stringsArray[0].charAt(i) == stringsArray[size - 1].charAt(i)) {
            i++;
        }

        return stringsArray[0].substring(0, i);
    }
}
