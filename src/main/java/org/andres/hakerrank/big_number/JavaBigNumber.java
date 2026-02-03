package org.andres.hakerrank.big_number;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigNumber {
    static void main() {
        try (Scanner scanner = new Scanner(System.in)) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            // initialize BigInteger objects using the String constructor
            BigInteger bi1 = new BigInteger(s1);
            BigInteger bi2 = new BigInteger(s2);

            // Perform addition and multiplication
            IO.println(bi1.add(bi2));
            IO.println(bi1.multiply(bi2));
        }
    }
}
