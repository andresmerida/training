package org.andres.training.coding_questions.swap_two_numbers;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        swapTwoNumbers(1,2);
        swapTwoNumbersWithoutUsingThirdVariable(2,3);
    }

    public static void swapTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println("First number: " + firstNumber+ ", second number: " + secondNumber);
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("AFTER SWAPPED");
        System.out.println("First number: " + firstNumber+ ", second number: " + secondNumber);
    }

    public static void swapTwoNumbersWithoutUsingThirdVariable(int firstNumber, int secondNumber) {
        System.out.println("First number: " + firstNumber+ ", second number: " + secondNumber);
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("AFTER SWAPPED");
        System.out.println("First number: " + firstNumber+ ", second number: " + secondNumber);
    }
}
