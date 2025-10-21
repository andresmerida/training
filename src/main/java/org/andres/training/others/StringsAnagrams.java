package org.andres.training.others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringsAnagrams {
    public boolean isAnagram(String s1, String s2) {
        checkArguments(s1, s2);

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> mapS1 = new HashMap<>();
        Map<Character, Integer> mapS2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if (mapS1.containsKey(s1.charAt(i))) {
                mapS1.put(s1.charAt(i), mapS1.get(s1.charAt(i)) + 1);
            } else {
                mapS1.put(s1.charAt(i), 1);
            }

            if (mapS2.containsKey(s2.charAt(i))) {
                mapS2.put(s2.charAt(i), mapS2.get(s2.charAt(i)) + 1);
            } else {
                mapS2.put(s2.charAt(i), 1);
            }
        }

        return mapS1.equals(mapS2);
    }

    public boolean isAnagramSolution2(String s1, String s2) {
        checkArguments(s1, s2);
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return new String(chars1)
                .equals(new String(chars2));
    }

    private void checkArguments(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        } else if (s1.isEmpty() || s2.isEmpty()) {
            throw new IllegalArgumentException("Strings must not be empty");
        }
    }
}
