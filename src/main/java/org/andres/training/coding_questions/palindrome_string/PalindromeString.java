package org.andres.training.coding_questions.palindrome_string;

public class PalindromeString {

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("null or empty string");
        }

        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public boolean isPalindrome2(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("null or empty string");
        }

        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
