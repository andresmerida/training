package org.andres.training.others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateElementsArray {

    public List<Integer> findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("nums is null");
        }
        List<Integer> duplicates = new ArrayList<>();

        if (nums.length == 1) {
            return duplicates;
        }

        Map<Integer, Integer> mapAux = new HashMap<>();
        for (int num : nums) {
            if (mapAux.containsKey(num)) {
                if (mapAux.get(num) == 1) {
                    duplicates.add(num);
                }
                mapAux.put(num, mapAux.get(num) + 1);
            } else {
                mapAux.put(num, 1);
            }
        }

        return duplicates;
    }

    public List<Integer> findDuplicateWithoutMap(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("nums is null");
        }
        List<Integer> duplicates = new ArrayList<>();

        if (nums.length == 1) {
            return duplicates;
        }

        int[] arrayAux = new int[nums.length + 1];
        for (int num : nums) {
            arrayAux[num]++;
        }

        for (int i = 1; i < arrayAux.length; i++) {
            if (arrayAux[i] > 1) {
                duplicates.add(i);
            }
        }

        return duplicates;
    }
}
