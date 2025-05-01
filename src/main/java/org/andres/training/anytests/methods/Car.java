package org.andres.training.anytests.methods;

public class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Car: pressing gas pedal...");
    }

    @Override
    void brake() {
        System.out.println("Car: applaying brakes...");
    }
}
