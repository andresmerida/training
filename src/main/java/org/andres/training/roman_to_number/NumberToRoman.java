package org.andres.training.roman_to_number;

/**
 * Suppose the input number is 3549. So, starting from thousand’s place we will start printing the roman equivalent.
 * In this case we will print in the order as given below:
 * 3549
 * So, the output will be: MMMDXLIX
 */
public class NumberToRoman {
    public static final String[] m = {"", "M", "MM", "MMM"};
    public static final String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    public static final String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    public static final String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public static String getRomanString(int number) {
        return m[number / 1000] +
                c[(number % 1000) / 100] +
                x[(number % 100) / 10] +
                i[number % 10];
    }

    public static void main(String[] args) {
        int input = 3549;
        System.out.println(getRomanString(input));
    }
}
