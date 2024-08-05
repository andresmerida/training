package org.andres.training.coding_questions.permutations_string;

import java.util.ArrayList;
import java.util.List;

public class PermutationsString {

    public List<String> permutationsString(String s) {
        List<String> permutations = new ArrayList<>();
        permutations.add(String.valueOf(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            for (int j = permutations.size() - 1; j >= 0; j--) {
                String temp = permutations.remove(j);
                for (int k = 0; k <= temp.length(); k++) {
                    permutations.add(temp.substring(0, k) + s.charAt(i) + temp.substring(k));
                }
            }
        }

        return permutations;
    }
}
