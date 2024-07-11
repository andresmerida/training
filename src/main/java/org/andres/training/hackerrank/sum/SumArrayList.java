package org.andres.training.hackerrank.sum;

import java.util.List;

public class SumArrayList {
    public static void main(String[] args) {
        System.out.println(simpleArraySum(List.of(1,2,3,4)));
    }

    static int simpleArraySum(List<Integer> ar) {
        return ar.stream().mapToInt(i -> i).sum();
    }
}
