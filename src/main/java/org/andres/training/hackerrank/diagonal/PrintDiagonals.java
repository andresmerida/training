package org.andres.training.hackerrank.diagonal;

public class PrintDiagonals {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {1,2,3,4},
                {5,6,7,8}
        };
        printPrincipalDiagonal(a, a[0].length);
        printSecondaryDiagonal(a, a[0].length);
    }

    private static void printPrincipalDiagonal(int[][] a, int length) {
        System.out.println("Principal diagonal: ");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    System.out.print(a[i][j] + ", ");
                }
            }
        }
        System.out.println();
    }

    private static void printSecondaryDiagonal(int[][] a, int length) {
        System.out.println("Secondary diagonal: ");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i+j) == length - 1) {
                    System.out.print(a[i][j] + ", ");
                }
            }
        }
        System.out.println();
    }
}
