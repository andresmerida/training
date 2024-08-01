package org.andres.training.coding_questions.armstrong_number;

public class ArmstrongNumber {

    public boolean isArmstrong(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The given number is negative");
        }

        int numberOfDigits = getNumberOfDigits(number);
        int numberAux = number, rightDigit, sumExponentResult = 0;
        while (numberAux > 0) {
            rightDigit = numberAux % 10;
            sumExponentResult += (int) Math.pow(rightDigit, numberOfDigits);
            numberAux = numberAux / 10;
        }

        return sumExponentResult == number;
    }

    public int getNumberOfDigits(int number) {
        int counter = 0;
        while (number > 0) {
            number /= 10;
            counter++;
        }

        return counter;
    }
}
