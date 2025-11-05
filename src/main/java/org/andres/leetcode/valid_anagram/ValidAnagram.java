package org.andres.leetcode.valid_anagram;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true

 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false

 * Constraints:
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) {
            throw new IllegalArgumentException("Strings cannot be null or empty");
        }

        if (!containsOnlyLowercaseEnglish(s) ||
                !containsOnlyLowercaseEnglish(t)) {
            throw new IllegalArgumentException("Strings do not contain only english lowercase letters");
        }

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        int[] charCounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounts[sArr[i] - 'a']++;
            charCounts[tArr[i] - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (charCounts[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagramSolutionTwo(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) {
            throw new IllegalArgumentException("Strings cannot be null or empty");
        }

        if (!containsOnlyLowercaseEnglish(s) ||
                !containsOnlyLowercaseEnglish(t)) {
            throw new IllegalArgumentException("Strings do not contain only english lowercase letters");
        }

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    private static boolean containsOnlyLowercaseEnglish(String str) {
        String regex = "^[a-z]+$";
        return str.matches(regex);
    }
}
