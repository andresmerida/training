package org.andres.training.coding_questions.vowels_consonants;

import java.util.HashMap;
import java.util.Map;

public class VowelsConsonants {
    public static final String VOWELS_STRING = "Vowels";
    public static final String CONSONANTS_STRING = "Consonants";

    public Map<String, Integer> vowelsConsonantsCounter(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("null or empty String");
        }
        s = s.toLowerCase();
        Map<String, Integer> vowelsConsonantsCounter = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (isVowel(c)) {
                    vowelsConsonantsCounter.put(VOWELS_STRING, vowelsConsonantsCounter.getOrDefault(VOWELS_STRING, 0) + 1);
                } else {
                    vowelsConsonantsCounter.put(CONSONANTS_STRING, vowelsConsonantsCounter.getOrDefault(CONSONANTS_STRING, 0) + 1);
                }
            }
        }

        return vowelsConsonantsCounter;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
