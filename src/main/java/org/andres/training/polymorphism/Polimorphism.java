package org.andres.training.polymorphism;

public class Polimorphism {
    public static void main(String[] args) {
        // Here the runtime polymorphism fundamental is not applied, it is of single CashPayment form
        CashPayment cashPayment = new CashPayment();
        cashPayment.pay();

        // Now the initialization is done using runtime polymorphism and it can have many forms at runtime
        Payment payment = new CashPayment();
        payment.pay();

        payment = new CreditPayment();
        payment.pay();
    }
}
