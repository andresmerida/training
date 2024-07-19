package org.andres.training.coderbyte.longest_word;

/**
 * Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string.
 * If there are two or more words that are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty.
 * Words may also contain numbers, for example "Hello world123 567"
 */
public class LongestWord {
    public static final String onlyLettersRegex = "^[a-zA-Z]*$";

    public String longestWord(String sen) {
        sen = sen.replaceAll("[^0-9a-zA-Z\\s]", "");
        String[] words = sen.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public String longestWord2(String sen) {
        if (sen.isEmpty()) {
            throw new IllegalArgumentException("Empty String");
        }
        String longestWord = "";
        String[] words = sen.split(" ");
        for (String word : words) {
            if (!word.matches(onlyLettersRegex)) {
                word = ignorePunctuation(word);
            }
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public String ignorePunctuation(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).matches(onlyLettersRegex)) {
                result.append(word.charAt(i));
            }
        }
        return result.toString();
    }
}
