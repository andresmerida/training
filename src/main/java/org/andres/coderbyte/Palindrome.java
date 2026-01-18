package org.andres.coderbyte;

public class Palindrome {
    private static final String NO_ALPHANUMERIC_REGEX = "[^a-zA-Z0-9]";
    private static final String ALPHANUMERIC_REGEX = "^[a-zA-Z0-9]+$";

    public boolean isPalindromeUsingTwoPointers(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("Argument is blank");
        }
        str = str.replaceAll(NO_ALPHANUMERIC_REGEX, "").toLowerCase();
        int indexLeft = 0;
        int indexRight = str.length() - 1;
        while (indexLeft < indexRight) {
            if (str.charAt(indexLeft) != str.charAt(indexRight)) {
                return false;
            }
            indexLeft++;
            indexRight--;
        }
        return true;
    }

    public boolean isPalindromeUsingStringBuilder(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("Argument is blank");
        }
        str = str.replaceAll(NO_ALPHANUMERIC_REGEX, "").toLowerCase();

        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public boolean isAlphaNumericValues(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("Argument is blank");
        }
        return str.matches(ALPHANUMERIC_REGEX);
    }
}
