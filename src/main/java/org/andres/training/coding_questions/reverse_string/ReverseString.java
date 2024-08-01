package org.andres.training.coding_questions.reverse_string;

public class ReverseString {
    public static final String SPACE_CHARACTER = " ";

    public String reverseString(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("null or empty string");
        }

        return new StringBuilder(s).reverse().toString();
    }

    public String reverseStringUsingStringBuilder(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("null or empty string");
        }

        StringBuilder sbReverse = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sbReverse.append(s.charAt(i));
        }

        return sbReverse.toString();
    }

    public String reverseStringUsingArrays(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("null or empty string");
        }

        char[] charsReverse = new char[s.length()];
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            charsReverse[index] = s.charAt(i);
            index++;
        }

        return new String(charsReverse);
    }

    /**
     * Input: Java is good programming langauges
     * Output: avaJ si doog gnimmargorp seguagnal
     * @param s input
     * @return String reverse each word
     */
    public String reverseEachWord(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(SPACE_CHARACTER);
        for (String word : words) {
            sb.append(reverseString(word)).append(SPACE_CHARACTER);
        }

        return sb.toString().trim();
    }
}
