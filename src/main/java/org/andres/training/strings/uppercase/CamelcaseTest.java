package org.andres.training.strings.uppercase;

/**
 * There is a sequence of words in CamelCase as a string of letters, , having the following properties:
 *
 * It is a concatenation of one or more words consisting of English letters.
 * All letters in the first word are lowercase.
 * For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
 * Given , determine the number of words in .
 *
 * Example
 * s = oneTwoThree
 * There are  words in the string: 'one', 'Two', 'Three'.
 */
public class CamelcaseTest {
    public static void main(String[] args) {
        String str = "oneTwoThree";
        System.out.println(camelcase(str));
    }

    public static int camelcase(String str) {
        int counter = 1;
        char[] strArray = str.toCharArray();
        for (char c : strArray) {
            if (Character.isUpperCase(c)) {
                counter++;
            }
        }

        return counter;
    }
}
