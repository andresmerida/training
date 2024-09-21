package org.andres.training.arrays.matrix;

import java.util.Arrays;

public class MatrixArray {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrixOneLine(matrix);
        System.out.println();
        printMatrixUsingForEach(matrix);
        System.out.println();
        printMatrixOnMatrix(matrix);
        System.out.println();
        printMatrixDeepToString(matrix);
    }

    public static void printMatrixOneLine(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static void printMatrixUsingForEach(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
        }
    }

    public static void printMatrixOnMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printMatrixDeepToString(int[][] matrix) {
        System.out.println(Arrays.deepToString(matrix));
    }
}
