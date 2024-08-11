package org.andres.training.design.patterns.decorator.example1;

public class MainPerson {

    public static void main(String[] args) {
        BasicCar basicCar = new BasicCar();
        Car passengerCar = new PassengerCar(basicCar);
        passengerCar.design();

        System.out.println();

        System.out.println(" --------- Luxury car + basic car ------------");
        Car luxuryCar = new LuxuryCar(basicCar);
        luxuryCar.design();

        System.out.println();

        System.out.println(" --------- Luxury car + passenger car + basic car ------------");
        Car lpCar = new LuxuryCar(passengerCar);
        lpCar.design();

        System.out.println();

        System.out.println(" --------- Basic car ---------");
        basicCar.design();
    }
}
