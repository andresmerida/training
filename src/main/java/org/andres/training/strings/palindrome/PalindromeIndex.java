package org.andres.training.strings.palindrome;

/**
 * Palindrome Index
 * Determine which character(s) must be removed to make a string a palindrome.
 */
public class PalindromeIndex {

    public static void main(String[] args) {
        String inputString = "bcbc";
        System.out.println(palindromeIndex(inputString));
    }

    private static int palindromeIndex(String inputString) {
        int startIndex = 0, endIndex = inputString.length() - 1;
        while (startIndex < endIndex && inputString.charAt(startIndex) == inputString.charAt(endIndex)) {
            startIndex++;
            endIndex--;
        }
        if (startIndex >= endIndex) { // is palindrome
            return -1;
        }
        // we need to delete here
        if (isPalindrome(inputString, startIndex + 1, endIndex)) {
            return startIndex;
        }
        if (isPalindrome(inputString, startIndex, endIndex - 1)) {
            return endIndex;
        }

        return -1;
    }

    private static boolean isPalindrome(String inputString, int startIndex, int endIndex) {
        do {
            if (inputString.charAt(startIndex) != inputString.charAt(endIndex)) {
                return false;
            }
        } while (startIndex++ < endIndex--);

        return true;
    }
}
