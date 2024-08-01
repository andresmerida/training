package org.andres.training.coding_questions.palindrome_number;

public class PalindromeNumber {

    public boolean isPalindrome(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }

        int rightDigit, reverseNumber = 0;
        int numberAux = number;

        while (numberAux > 0) {
            rightDigit = numberAux % 10;
            reverseNumber = reverseNumber * 10 + rightDigit;
            numberAux = numberAux / 10;
        }

        return number == reverseNumber;
    }
}
