package org.andres.training.interfaces;

public interface Payment {
    void doTransaction();
    default void addCoupon() {
        System.out.println("Adding Coupon from payment");
    }

    static void staticMethod() {
        System.out.println("sout from static method");
    }
}
