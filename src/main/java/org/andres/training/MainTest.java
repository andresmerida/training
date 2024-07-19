package org.andres.training;

import java.util.LinkedList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(3, 4);
        System.out.println(linkedList);
        String s1 = "hello";
        s1.concat(" world!");
        System.out.println(s1);

        System.out.println(100 + 100 + "KeepOnCoding");
        System.out.println("KeepOnCoding" + 100 + 100);

        String test = "Abc";
        System.out.println(test.matches("^[a-zA-Z]*$"));
    }
}
