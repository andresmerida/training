package org.andres.training.strings.split;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to divide a string in n equal parts.
 * The given string is: abcdefghijklmnopqrstuvwxy
 * The string divided into 5 parts and they are:
 *
 * abcde
 * fghij
 * klmno
 * pqrst
 * uvwxy
*/
public class TestStringSplit {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxy"; // length 25
        int splitNumber = 5;
        System.out.println(splitString(str, splitNumber));

        str = "abcfdefghijkl"; // length 13
        splitNumber = 3;
        System.out.println(splitString(str, splitNumber));

        str = "abcfdefghi"; // length 10
        splitNumber = 2;
        System.out.println(splitString(str, splitNumber));
    }

    public static List<String> splitString(String str, int n) {
        List<String> resSplitString = new ArrayList<>();
        int sizeSubString = str.length() / n;
        char[] strArray = str.toCharArray();
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : strArray) {
            counter++;
            stringBuilder.append(c);
            if (sizeSubString == counter) {
                resSplitString.add(stringBuilder.toString());
                counter = 0;
                stringBuilder.setLength(0);
            }
        }

        if (counter > 0) {
            System.out.println("It's not possible split the string, left: " + stringBuilder.toString());
        }

        return resSplitString;
    }
}
