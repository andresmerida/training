package org.andres.training.hackerrank.big_sum;

import java.util.List;

public class AVeryBigSum {
    public static void main(String[] args) {
        // 1000000001 1000000002 1000000003 1000000004 1000000005
        List<Long> longList = List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
        System.out.println(aVeryBigSum(longList));
    }

    static long aVeryBigSum(List<Long> ar) {
        return ar.stream().mapToLong(l -> l).sum();
    }
}
