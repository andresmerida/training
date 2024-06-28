package org.andres.training.adaface;

public class Cancer extends Disease {
    static {
        System.out.print("C ");
    }
    public Cancer() {
        System.out.print("D ");
    }

    {
        System.out.print("E ");
    }
    static {
        System.out.print("F ");
    }
}
