package org.andres.training.coding_questions.permutation;

import java.util.ArrayList;

public class PermuteString {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("Java");
        list.add("JDBC");
        list.add("SpringBoot");
        list.add(4, "JPA");
        System.out.println(list);
    }
}
