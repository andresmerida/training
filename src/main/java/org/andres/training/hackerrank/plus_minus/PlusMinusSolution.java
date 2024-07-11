package org.andres.training.hackerrank.plus_minus;

import java.util.List;

import static java.lang.String.format;

public class PlusMinusSolution {
    public static void main(String[] args) {
        List<Integer> list = List.of(-4,3,-9,0,4,1);
        plusMinus(list);
    }

    private static void plusMinus(List<Integer> list) {
        int positiveValues = 0, negativeValues = 0, zeroValues = 0;
        for (Integer integer : list) {
            if (integer > 0) {
                positiveValues++;
            } else if (integer < 0) {
                negativeValues++;
            } else {
                zeroValues++;
            }
        }

        if (!list.isEmpty()) {
            System.out.println(format("%.6f", (double) positiveValues/list.size()));
            System.out.println(format("%.6f", (double) negativeValues/list.size()));
            System.out.println(format("%.6f", (double) zeroValues/list.size()));
        }
    }
}
