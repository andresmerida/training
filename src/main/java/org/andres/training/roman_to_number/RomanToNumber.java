package org.andres.training.roman_to_number;

/**
 * Converting Roman Numerals to Integer
 * Example:
 * Input: IX
 * Output: 9
 * Explanation: IX is a Roman symbol which represents 9
 * <p><p/>
 * Input: XL
 * Output: 40
 * Explanation: XL is a Roman symbol which represents 40
 * <p><p/>
 * Input: MCMIV
 * Output: 1904
 * Explanation: M is a thousand, CM is nine hundred and IV is four
 */
public class RomanToNumber {

    public static void main(String[] args) {
        String romanString = "MIV";
        System.out.println(romanToNumber(romanString));
    }

    private static int romanToNumber(String romanString) {
        int res = 0;

        for (int i=0; i < romanString.length(); i++) {
            int s1 = romanValue(romanString.charAt(i));
            if (i + 1 < romanString.length()) {
                int s2 = romanValue(romanString.charAt(i + 1));
                if (s1 >= s2) {
                    res += s1;
                } else {
                    // Value of current symbol is less than the nex symbol
                    res += s2 - s1;
                    i++;
                }
            } else {
                res += s1;
            }
        }

        return res;
    }

    private static int romanValue(char character) {
        return switch (character) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalStateException("Unexpected value: " + character);
        };
    }
}
