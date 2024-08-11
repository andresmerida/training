package org.andres.training.design.patterns.decorator.example1;

public class PassengerCar extends DecoratorCar {
    public PassengerCar(Car car) {
        super(car);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("PassengerCar design.");
    }
}
