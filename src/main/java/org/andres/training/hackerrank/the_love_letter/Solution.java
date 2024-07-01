package org.andres.training.hackerrank.the_love_letter;

/**
 * James found a love letter that his friend Harry has written to his girlfriend. James is a prankster,
 * so he decides to meddle with the letter. He changes all the words in the letter into palindromes.
 * To do this, he follows two rules:
 * He can only reduce the value of a letter by , i.e. he can change d to c, but he cannot change c to d or d to b.
 * The letter  may not be reduced any further.
 * Each reduction in the value of any letter is counted as a single operation.
 * Find the minimum number of operations required to convert a given string into a palindrome.
 * <p/>
 * Example
 * 'cde' => The following two operations are performed: cde → cdd → cdc. Return .
 * 'abcba' => For the second query, abcba is already a palindromic string.
 * 'abcd' => For the third query, abcd → abcc → abcb → abca → abba.
 * 'cba' => For the fourth query, cba → bba → aba.
 */
public class Solution {
    public static void main(String[] args) {
        String input = "abcd";
        System.out.println(theLoveLetterMystery(input));
    }

    public static int theLoveLetterMystery(String s) {
        int operationsPerformed = 0;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            operationsPerformed += Math.abs(s.charAt(i) - s.charAt(j));
            i++;
            j--;
        }
        return operationsPerformed;
    }
}
