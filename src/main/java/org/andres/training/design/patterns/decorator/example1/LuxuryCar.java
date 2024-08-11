package org.andres.training.design.patterns.decorator.example1;

public class LuxuryCar extends DecoratorCar {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("Luxury Car design.");
    }
}
