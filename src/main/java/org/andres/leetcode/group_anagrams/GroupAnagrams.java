package org.andres.leetcode.group_anagrams;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.

 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Explanation:
 * There is no string in strs that can be rearranged to form "bat".
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]

 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]

 * Constraints:
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) {
            throw new IllegalArgumentException("Array of strings cannot be null");
        }
        if (!containsOnlyLowercaseEnglishLetters(strs)) {
            throw new IllegalArgumentException("Strings must only contains english lowercase letters only");
        }

        if (strs.length == 0) {
            return Collections.emptyList();
        }

        Map<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private static boolean  containsOnlyLowercaseEnglishLetters(String[] strs) {
        String regex = "^[a-z]+$";
        for (String s : strs) {
            if (!s.matches(regex)) {
                return false;
            }
        }

        return true;
    }
}
