package org.andres.training.coding_questions.duplicate_characters;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInAString {

    public Map<Character, Integer> getDuplicateCharacters(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("null or empty String");
        }

        Map<Character, Integer> duplicates = new HashMap<>();

        Map<Character, Integer> characterMap = new HashMap<>();
        Character character;
        for (int i = 0; i < s.length(); i++) {
            character = s.charAt(i);
            if (character == ' ') {
                continue;
            }
            if (characterMap.containsKey(character)) {
                characterMap.put(character, characterMap.get(character) + 1);
            } else {
                characterMap.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characterMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.put(entry.getKey(), entry.getValue());
            }
        }

        return duplicates;
    }
}
