package org.andres.training.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElements {

    public List<Integer> findMissingElements(int[] nums, int N) {
        if (1 == N || N < 1) {
            throw new IllegalArgumentException("N should be greater than 1");
        }
        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (nums[i - 1] != i) {
                result.add(i);
            }
        }

        return result;
    }
}
