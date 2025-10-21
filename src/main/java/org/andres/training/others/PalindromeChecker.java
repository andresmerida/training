package org.andres.training.others;

public class PalindromeChecker {

    public boolean isPalindromeWithIndex(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Argument is blank");
        }
        String aux = str.toLowerCase();

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (aux.charAt(i) != aux.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public boolean isPalindromeWithStringBuilder(String str1) {
        StringBuilder stringBuilder = new StringBuilder(str1);
        stringBuilder.reverse();

        return stringBuilder.toString().equalsIgnoreCase(str1);
    }
}
