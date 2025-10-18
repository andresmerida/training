package org.andres.leetcode.string_compression2;

import java.util.HashMap;
import java.util.Map;

public class StringCompression2 {

    public String getStringCompression(char[] str) {
        if (str == null || str.length == 0) {
            throw new IllegalArgumentException("String is null or empty");
        }
        Map<Character, Integer> mapChar = new HashMap<>();

        for (char c : str) {
            if (mapChar.containsKey(c)) {
                mapChar.put(c, mapChar.get(c) + 1);
            } else {
                mapChar.put(c, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : mapChar.entrySet()) {
            if (entry.getValue() == 1) {
                sb.append(entry.getKey());
            }  else {
                sb.append(entry.getKey());
                sb.append(entry.getValue());
            }
        }

        return sb.toString();
    }
}
