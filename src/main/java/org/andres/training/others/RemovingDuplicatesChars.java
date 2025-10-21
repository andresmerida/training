package org.andres.training.others;

import java.util.HashMap;
import java.util.Map;

/**
 * Description problem
 * <p>
 * Input: s = geeksforgeeks
 * Output: geksfor
 * Explanation: After removing duplicate characters such as e, k, g, s, we have string as "geksfor".
 * <p>
 * Input: s = HappyNewYear
 * Output: HapyNewYr
 * Explanation: After removing duplicate characters such as p, e, a, we have string as "HapyNewYr".
 */

public class RemovingDuplicatesChars {

    public String removeDuplicatesCharacters(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Null or empty String");
        }

        StringBuilder sbRes = new StringBuilder();
        Map<Character, Character> auxMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (i != 0 && auxMap.containsKey(c)) {
                continue;
            }
            auxMap.put(c, c);
            sbRes.append(c);
        }

        return sbRes.toString();
    }

    public String removeDuplicatesCharacters_withASCIIValues(String s) {
        StringBuilder sb = new StringBuilder();
        boolean[] booleansASCIIValues = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!booleansASCIIValues[c]) {
                sb.append(c);
                booleansASCIIValues[c] = true;
            }
        }

        return sb.toString();
    }
}