package org.andres.training.hackerrank.anagram;

public class Anagrams {
    public static int minNumberOfDeletions(String str1, String str2) {
        if (str1.isEmpty() || str2.isEmpty()) {
            return -1;
        }
        String auxStr2 = str2;

        for (Character character : str1.toCharArray()) {
            str2 = str2.replaceFirst(String.valueOf(character), "");
        }

        for (Character character2 : auxStr2.toCharArray()) {
            str1 = str1.replaceFirst(String.valueOf(character2), "");
        }

        return str1.length() + str2.length();
    }

    public static int makingAnagrams(String str1, String str2) {
        int counter = 0;
        String strMin = str1.length() < str2.length() ? str1 : str2;
        String strMax = str1.length() >= str2.length() ? str1 : str2;
        int lenDif = Math.abs(str1.length() - str2.length());

        for (Character c : strMin.toCharArray()) {
            if (!strMax.contains(String.valueOf(c))) {
                counter = counter + 2;
            } else {
                strMin = strMin.replace(String.valueOf(c), "");
                strMax = strMax.replaceFirst(String.valueOf(c), "");
            }
        }

        return counter + lenDif;
    }
}
