package org.andres.training.coding_questions.swap_two_strings;

public class SwapTwoStrings {
    public static void main(String[] args) {
        String a = "Belinda";
        String b = "Ana";

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println(a);
        System.out.println(b);

        String indiceString = "0123456789";
        System.out.println(indiceString.substring(0, 2));
        System.out.println(indiceString.substring(2));
    }
}
