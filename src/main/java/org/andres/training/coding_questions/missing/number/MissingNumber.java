package org.andres.training.coding_questions.missing.number;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 4, 5, 6, 7};
        System.out.println(missingNumber(numbers));
        System.out.println(missingNumber2(numbers));
    }

    private static int missingNumber(int[] numbers) {
        int missingNumber = -1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != i + 1) {
                missingNumber = i + 1;
                break;
            }
        }
        return missingNumber;
    }

    private static int missingNumber2(int[] numbers) {
        int n = numbers[numbers.length - 1];
        int A = n * (n + 1) / 2;
        int B = 0;
        for (int i : numbers) {
            B += i;
        }
        return A - B;
    }
}
