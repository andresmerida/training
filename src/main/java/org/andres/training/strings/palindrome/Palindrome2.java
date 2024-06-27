package org.andres.training.strings.palindrome;

public class Palindrome2 {
    public static void main(String[] args) {
        String input = "level";
        System.out.println(isPalindrome2(input));
    }

    private static boolean isPalindrome2(String input) {
        int startIndex = 0, endIndex = input.length() - 1;
        do {
            if (input.charAt(startIndex) != input.charAt(endIndex)) {
                return false;
            }
        } while (startIndex++ < endIndex--);

        return true;
    }
}
