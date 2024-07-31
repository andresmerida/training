package org.andres.training.coding_questions.prime_number;

public class PrimeNumber {
    public boolean isPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
