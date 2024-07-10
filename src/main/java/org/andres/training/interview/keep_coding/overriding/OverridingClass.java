package org.andres.training.interview.keep_coding.overriding;

public class OverridingClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.eatAsAnimal();
    }
}
