package org.andres.training.anytests.methods;

public class MainCar {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();

        System.out.println();

        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();
        ParentClass parentClass1 = new ChildClass();

        // method overloading (compile-time)
        parentClass.func();
        parentClass1.func(10);

        // method overriding (runtime)
        childClass.func(20);

        // Polymorphism in action
        parentClass1.func(30);
    }
}
