package org.andres.training.exceptions.custom_exception;

public class ExecutingClass {

    static void calculate(int n) throws CustomException {
        throw new CustomException(n);
    }

    public static void main(String[] args) {
        try {
            calculate(42);
        } catch (CustomException e) {
            System.out.println("Catch22");
        }
    }
}
