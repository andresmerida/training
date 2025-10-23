package org.andres.training.others.overriging;

public class MainOverriding {
    public static void main(String[] args) {
        Figure figure = new Figure();
        System.out.println("Figure area: " + figure.getArea());

        Figure figure2 = new Rectangle(2,2.5f);
        Figure figure3 = new Square(2.5f);

        System.out.println("Rectangle area: " + figure2.getArea());
        System.out.println("Square area: " + figure3.getArea());
    }
}
