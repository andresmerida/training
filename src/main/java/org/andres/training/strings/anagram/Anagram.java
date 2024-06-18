package org.andres.training.strings.anagram;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Pagar";
        String str2 = "Praga";
        System.out.println(isAnagram(str1, str2));
        System.out.println(isAnagram2(str1, str2));
    }

    private static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        int count1 = 0, count2 = 0;
        for (char str1Value : str1.toCharArray()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1Value == str1.charAt(i)) {
                    count1++;
                }
                if (str1Value == str2.charAt(i)) {
                    count2++;
                }
            }
            if (count1 != count2) {
                return false;
            }
        }

        return true;
    }

    private static boolean isAnagram2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str2.length(); i++) {
            str1 = str1.replaceFirst(String.valueOf(str2.charAt(i)), "");
        }

        return str1.isEmpty();
    }
}
