package org.andres.training.coding_questions.permutation;

import java.util.ArrayList;

public class PermuteString {
    public static void main(String[] args) {
        String str = "ABC";
        permuteString(str, 0, str.length() - 1);
    }

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param left starting index
     * @param right end index
     */
    private static void permuteString(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permuteString(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    private static String swap(String a, int i, int j) {
        char temp;
        char[] chars = a.toCharArray();
        temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }
}
