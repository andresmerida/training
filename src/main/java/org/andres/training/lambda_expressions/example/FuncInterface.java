package org.andres.training.lambda_expressions.example;

import java.util.List;

/**
 * In Java, Lambda expressions basically express instances of functional interfaces
 * (An interface with a single abstract method is called a functional interface).
 * Lambda Expressions in Java are the same as lambda functions which are the short block of code
 * that accepts input as parameters and returns a resultant value.
 * Lambda Expressions are recently included in Java SE 8.
 */
public interface FuncInterface {
    void abstractFun(int x);    // an abstract function
    default void normalFun() {
        System.out.println("Hello");
    }

    static void main(String[] args) {
        // lambda expression to implement above functional interface.
        // This interface by default implements abstractFun()
        FuncInterface funcInterface = (int x) -> System.out.println(2 * x);

        // this calls above lambda expression and prints 10
        funcInterface.abstractFun(5);

        List<Integer> list = List.of(1, 2, 3, 4);
        System.out.println();
        System.out.println("Using lambda expression to print all elements");
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("Using lambda expression to print even elements");
        list.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
