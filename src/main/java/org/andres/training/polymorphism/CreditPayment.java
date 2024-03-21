package org.andres.training.polymorphism;

public class CreditPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("this is credit payment process.");
    }
}
