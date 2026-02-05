package org.andres.hakerrank.advanced.lambda_expressions;

public class MyMath {
    public static boolean checker(PerformOperation operation, int num){
        return operation.check(num);
    }

    public PerformOperation isOdd() {
        return (num) -> num % 2 != 0;
    }

    public PerformOperation isPrime() {
        return (num) -> {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return (num) -> {
            String str = String.valueOf(num);
            return str.contentEquals(new StringBuilder(str).reverse());
        };
    }
}
