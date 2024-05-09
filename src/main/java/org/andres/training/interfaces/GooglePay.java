package org.andres.training.interfaces;

public class GooglePay implements Payment {
    @Override
    public void doTransaction() {
        Payment.staticMethod();
        System.out.println("Transaction from GooglePay");
    }

    public static void main(String[] args) {
        Payment payment = new GooglePay();
        payment.doTransaction();
    }
}
