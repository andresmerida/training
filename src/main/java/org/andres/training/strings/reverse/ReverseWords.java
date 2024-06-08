package org.andres.training.strings.reverse;

/**
 * Given a string, the task is to reverse the order of the words in the given string.
 * Examples:
 * Input: s = “geeks quiz practice code”
 * Output: s = “code practice quiz geeks”
 * <p>
 * Input: s = “i love programming very much”
 * Output: s = “much very programming love i”
 */
public class ReverseWords {
    public static void main(String[] args) {
        String input = "geeks quiz practice code";
        System.out.println(input);
        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String input) {
        String[] stringsArray = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int lastIndex = stringsArray.length - 1;
        while (lastIndex > -1) {
            if (lastIndex != 0) {
                stringBuilder.append(stringsArray[lastIndex]).append(" ");
            } else {
                stringBuilder.append(stringsArray[lastIndex]);
            }
            lastIndex--;
        }

        return stringBuilder.toString();
    }
}
