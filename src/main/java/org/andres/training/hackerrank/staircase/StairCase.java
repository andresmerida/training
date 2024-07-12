package org.andres.training.hackerrank.staircase;

public class StairCase {
    public static void main(String[] args) {
        stairCase(4);
    }

    public static void stairCase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
