package org.andres.coderbyte;

import java.util.HashMap;
import java.util.Map;

/**
 * Count character frequency
 */
public class CharacterFrequency {

    public int getMostFrequencyCharacter(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map.values().stream()
                .max(Integer::compareTo)
                .orElse(0);
    }
}
