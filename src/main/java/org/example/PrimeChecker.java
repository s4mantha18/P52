package org.example;

public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 17; // Change the number to check for primality
        System.out.println(num + " is prime: " + isPrime(num));
    }
}
