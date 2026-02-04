package org.andres.hakerrank.data_structures.java_stack;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    static void main() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String input = scanner.nextLine();
                if (input.equals("exit")) {
                    break;
                }
                IO.println(isBalanced(input));
            }
        } catch (Exception e) {
            IO.println(e.getMessage());
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty() || (c != ')' && c != '}' && c != ']')) {
                return false;
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
