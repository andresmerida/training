package org.andres.training.threads;

import java.util.Scanner;

public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Enter an integer, then press Enter");
        a = scanner.nextInt();
        System.out.println("Enter another integer: then press Enter");
        b = scanner.nextInt();
        System.out.println(solveMeFirst(a,b));
    }

    static int solveMeFirst(int a, int b) {
        return Integer.sum(a, b);
    }
}
