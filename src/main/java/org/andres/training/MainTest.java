package org.andres.training;

import java.util.LinkedList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        String s1 = "hello";
        s1.concat(" world!");
        System.out.println(s1);
    }
}
