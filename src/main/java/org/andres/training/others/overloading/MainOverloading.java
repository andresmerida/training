package org.andres.training.others.overloading;

public class MainOverloading {
    public static void main(String[] args) {
        OverloadingClass overloadingClass = new OverloadingClass();
        overloadingClass.printParameter();
        overloadingClass.printParameter("param1");
        overloadingClass.printParameter("param1", "param2");
    }
}
