package org.andres.training.anytests.methods;

public class ChildClass extends ParentClass {
    @Override
    public void func(int x) {
        System.out.println("ChildClass func(x): " + x);
    }
}
