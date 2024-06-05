package org.andres.training.strings.palindrome;

/**
 * A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
 * In this article, we will learn how to check if a string is a palindrome in Java.
 * Input: str = “abba”
 * Output: Yes
 * Input: str = “geeks”
 * Output: No
 */
public class Palindrome {
    public static void main(String[] args) {
        String input = "lucio";
        System.out.printf("The String '%s' is palindrome OPTION1? %s\n", input, isPalindrome(input));
        System.out.printf("The String '%s' is palindrome OPTION2? %s", input, isPalindromeBetter(input));
    }

    public static String isPalindrome(String string) {
        char[] stringArray = string.toCharArray();
        int index = string.length() - 1;
        StringBuilder stringBuilder = new StringBuilder();
        while (index > -1) {
            stringBuilder.append(stringArray[index]);
            index--;
        }

        if (stringBuilder.toString().equals(string)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static String isPalindromeBetter(String string) {
        int i = 0, j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                return "No";
            }
            i++;
            j--;
        }

        return "Yes";
    }
}
