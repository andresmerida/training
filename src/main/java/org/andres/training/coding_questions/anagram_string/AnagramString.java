package org.andres.training.coding_questions.anagram_string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramString {
    public boolean areAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        Map<Character, Integer> charCountMap = new HashMap<>(); // create a hashmap to store character frequencies
        for (char c : s1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Decrement frequency of each character in the second string
        for (char c : s2.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        // Check if all frequencies are zero
        for (int count : charCountMap.values()) {
            if (count != 0) return false;
        }

        return true;
    }

    public boolean areAnagram2(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}
