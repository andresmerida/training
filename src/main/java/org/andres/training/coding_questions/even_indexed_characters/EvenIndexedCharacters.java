package org.andres.training.coding_questions.even_indexed_characters;

public class EvenIndexedCharacters {

    public String getEvenIndexedCharacters(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
