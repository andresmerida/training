package org.andres.hakerrank.string_tokens;

import java.util.Scanner;

public class StringTokens {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the entire line (handling spaces)
        if (!scanner.hasNextLine()) {
            IO.println(0);
            return;
        }
        String lineString = scanner.nextLine();

        // 2. IMPORTANT: Trim whitespace from edges
        lineString = lineString.trim();

        // 3. Edge Case: if string is empty after trimming, print 0
        if (lineString.isEmpty()) {
            IO.println(0);
            return;
        }

        // 4. Split by the special characters
        // the regex inside [] matches any ONE of those chars
        // the + means "if multiple delimiters appear together, treat as one split"
        String[] tokens = lineString.split("[ !,?._'@]+");

        // 5. Print the number of tokens
        IO.println(tokens.length);
        for (String token : tokens) {
            IO.println(token);
        }
        scanner.close();
    }
}
