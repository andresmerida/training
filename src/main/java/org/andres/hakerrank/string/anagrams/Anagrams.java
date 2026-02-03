package org.andres.hakerrank.string.anagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public boolean areAnagrams(String s1, String s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            throw new IllegalArgumentException("Strings cannot be null or empty");
        }

        // Normalize to case-insensitive (HackerRank requirement) and also replease spaces
        s1 = s1.toLowerCase().replace(" ", "");
        s2 = s2.toLowerCase().replace(" ", "");

        if (s1.length() != s2.length()) {
            return false;
        }

        // create a frequency bucket for 26 English letters
        // 'a' will be at index 0, 'b' index 1... 'z' will be at index 25
        int[] frequency = new int[26];

        // iterate through both strings
        for (int i = 0; i < s1.length(); i++) {
            frequency[s1.charAt(i) - 'a']++;
            frequency[s2.charAt(i) - 'a']--;
        }

        // check if all frequencies are 0
        for (int freq : frequency) {
            if (freq != 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagramHashing(String s1, String s2) {
        s1 = s1.toLowerCase().replace(" ", "");
        s2 = s2.toLowerCase().replace(" ", "");

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        return map.values().stream().allMatch(count -> count == 0);
    }

    public boolean isAnagramSorting(String s1, String s2) {
        s1 = s1.toLowerCase().replace(" ", "");
        s2 = s2.toLowerCase().replace(" ", "");

        if (s1.length() != s2.length()) {
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
