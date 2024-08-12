package org.andres.training.design.patterns.decorator.example2;

public class MainDecorator {
    public static void main(String[] args) {
        INotifier notifyAll = new FacebookDecorator(new WhatsappDecorator(new Notifier("Geekific")));
        notifyAll.send("Like and Subscribe!!!");

        System.out.println("===================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("Geekific"));
        notifyFbMail.send("Like and Subscribe!!!");
    }
}
