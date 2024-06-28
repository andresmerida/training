package org.andres.training.exceptions.custom_exception;

public class CustomException extends Exception {
    int num;
    CustomException(int num) {
        this.num = num;
    }

    public String toString() {
        return Integer.toString(num);
    }
}
