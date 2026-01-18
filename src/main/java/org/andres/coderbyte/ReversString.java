package org.andres.coderbyte;

public class ReversString {

    public String reverseStringWithStringBuilder(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("str is null or empty");
        }

        return new StringBuilder(str).reverse().toString();
    }

    public String reverseStringWithCharAt(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public String reverseStringWithTwoPointers(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }
}
