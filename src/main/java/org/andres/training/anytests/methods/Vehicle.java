package org.andres.training.anytests.methods;

abstract class Vehicle {
    abstract void accelerate();
    abstract void brake();

    void startEngine() {
        System.out.println("Starting engine");
    }
}
