package org.andres.training.interview.keep_coding.overriding;

public class Dog extends Animal {
    @Override
    protected void eat() {
        System.out.println("eat() method from derived class. Dog is eating.");
    }

    protected void eatAsAnimal() {
        super.eat();
    }
}
