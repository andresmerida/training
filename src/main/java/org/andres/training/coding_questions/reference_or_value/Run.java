package org.andres.training.coding_questions.reference_or_value;

public class Run {
    public static void spill(Mug myMug) {
        myMug.setContents("nothing");
    }

    public static void setFoo(int bar) {
        bar = 2;
    }

    public static void main(String[] args) {
        Mug mug = new Mug("tea");
        System.out.println(mug.getContents());

        spill(mug);   // myMug now contains "nothing"
        System.out.println(mug.getContents());

        System.out.println();
        int foo = 13;
        System.out.println(foo);

        setFoo(foo);
        System.out.println(foo);
    }
}
