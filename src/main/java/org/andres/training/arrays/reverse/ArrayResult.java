package org.andres.training.arrays.reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ArrayResult {
    public static void main(String[] args) {
        Integer[] listIntegers = {1,2,3,4};
        System.out.println("Input");
        printCollection(Arrays.asList(listIntegers));

        System.out.println("");
        System.out.println("Output");
        printCollection(reverseArray(Arrays.asList(listIntegers)));
    }

    public static List<Integer> reverseArray(List<Integer> inputList) {
        List<Integer> revertedList = new ArrayList<>();

        Stack<Integer> stackInteger = new Stack<>();
        stackInteger.addAll(inputList);

        while (!stackInteger.isEmpty()) {
            revertedList.add(stackInteger.pop());
        }

        return revertedList;
    }

    public static void printCollection(List<?> list) {
        System.out.println(
                list.stream().map(Object::toString).collect(Collectors.joining(" "))
        );
    }
}
