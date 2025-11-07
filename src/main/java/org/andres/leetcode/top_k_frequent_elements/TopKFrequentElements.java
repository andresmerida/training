package org.andres.leetcode.top_k_frequent_elements;

import java.util.*;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]

 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]

 * Example 3:
 * Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
 * Output: [1,2]

 * Constraints:
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }

        int[] res = new int[k];
        Map<Integer, Integer> counterMap = new HashMap<>();
        for (int num : nums) {
            counterMap.put(num, counterMap.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
                (a, b) -> counterMap.get(a) - counterMap.get(b)
        );

        for (int num : counterMap.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            res[i] = heap.poll();
        }

        return res;
    }
}
