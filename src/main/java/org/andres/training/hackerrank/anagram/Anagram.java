package org.andres.training.hackerrank.anagram;

import java.util.HashMap;
import java.util.Map;

/**
 * Two words are anagrams of one another if their letters can be rearranged to form the other word.
 * Given a string, split it into two contiguous substrings of equal length.
 * Determine the minimum number of characters to change to make the two substrings into anagrams of one another.
 * Example:
 * s = xyyx, output=0
 * s = aaabbb, output=3
 * s = ab, output=1
 * s = abc, output=-1
 * s = xaxbbbxx, output=1
 */
public class Anagram {
    public static int minChangeToAnagram(String input) {
        if (input.length() % 2 != 0) {
            return -1;
        }
        String str1 = input.substring(0, input.length() / 2);
        String str2 = input.substring(input.length() / 2);

        for (char str1CharValue : str1.toCharArray()) {
            str2 = str2.replaceFirst(String.valueOf(str1CharValue), "");
        }
        return str2.length();
    }

    public static int minChangeToAnagram2(String input) {
        if (input.length() % 2 > 0) {
            return -1;
        }
        String str1 = input.substring(0, input.length() / 2);
        String str2 = input.substring(input.length() / 2);
        int counter = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : str1.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Character c2 : str2.toCharArray()) {
            if (map.containsKey(c2)) {
                if (map.get(c2) == 1) {
                    map.remove(c2);
                } else {
                    map.put(c2, map.get(c2) - 1);
                }
            } else {
                counter++;
            }
        }

        return counter;
    }
}
