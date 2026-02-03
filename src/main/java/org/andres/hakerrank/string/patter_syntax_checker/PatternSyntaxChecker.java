package org.andres.hakerrank.string.patter_syntax_checker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    static void main() {
        try (Scanner scanner = new Scanner(System.in)){
            int testCases = Integer.parseInt(scanner.nextLine());

            while (testCases > 0) {
                String pattern = scanner.nextLine();
                try {
                    Pattern.compile(pattern);
                    IO.println("Valid");
                } catch (PatternSyntaxException pse) {
                    IO.println("Invalid");
                }
                testCases--;
            }
        }
    }
}
