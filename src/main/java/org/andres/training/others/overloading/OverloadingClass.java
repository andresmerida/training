package org.andres.training.others.overloading;

public class OverloadingClass {

    public void printParameter() {
        System.out.println("Printing without cero parameter");
    }

    public void printParameter(String param) {
        System.out.println("Printing with one parameter: " + param);
    }

    public void printParameter(String param, String param2) {
        System.out.println("Printing with two parameters: param1: " + param + " param2: " + param2);
    }
}
