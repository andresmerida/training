package org.andres.training.hackerrank.diagonal;

import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(9, 8, 9));
        System.out.println(getDiagonalDifference(matrix));
    }

    private static int getDiagonalDifference(List<List<Integer>> matrix) {
        return Math.abs(sumDiagonal(matrix, true) - sumDiagonal(matrix, false));
    }

    private static int sumDiagonal(List<List<Integer>> matrix, boolean leftToRightDiagonal) {
        int diagonalSum = 0;
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                if (leftToRightDiagonal) {
                    if (i == j) {
                        diagonalSum += matrix.get(i).get(j);
                    }
                } else if (i + j == matrix.size() - 1) {
                    diagonalSum += matrix.get(i).get(j);
                }
            }
        }

        return diagonalSum;
    }
}
