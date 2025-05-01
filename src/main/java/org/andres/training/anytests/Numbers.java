package org.andres.training.anytests;

public class Numbers {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void sum() {
        System.out.println(a + b);
    }

    public void subtract() {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.setA(1);
        numbers.setB(2);

        numbers.sum();
        numbers.subtract();
    }
}
