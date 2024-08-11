package org.andres.training.design.patterns.decorator.example1;

public class DecoratorCar implements Car {
    private final Car car;

    public DecoratorCar(Car car) {
        this.car = car;
    }

    @Override
    public void design() {
        this.car.design();
    }
}
