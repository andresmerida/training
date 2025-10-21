package org.andres.training.others;

public class CountingVowelsCharacters {

    public int countingVowelsCharacters(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Strings must not be null or empty");
        }
        s = s.toLowerCase();

        int counterVowels = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                counterVowels++;
            }
        }

        return counterVowels;
    }

    private boolean isVowel(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
}
