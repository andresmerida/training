package org.andres.training.coding_questions.unique_characters;

public class UniqueCharacters {
    public String getUniqueCharacters(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }

        StringBuilder sbUniqueCharacters = new StringBuilder();
        boolean[] unique = new boolean[128];    // ASCII characters [0-127]
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!unique[c]) {
                unique[c] = true;
                sbUniqueCharacters.append(c);
            }
        }
        return sbUniqueCharacters.toString();
    }
}
