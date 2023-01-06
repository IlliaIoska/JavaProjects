package com.company;

public class Main {

    public static void main(String[] args) {

        printPrimeFromUpTo(50);
    }

    public static void calcInterest(double amount) {

        double discountedAmount = amount;
        for(double interestRate = 2; interestRate < 9; interestRate++) {
            discountedAmount = amount * (interestRate/100);
            System.out.println(discountedAmount);
        }
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        } else {
            for(int i = 2; i <= n / 2; i++) {
                if(n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void printPrimeFromUpTo(int n) {

        int primeNumContainer = 0;
        for(int i = 10; i < n; i++) {
            if(i <= 1) {
                System.out.println("No prime in the given range");
            } else {
                if(isPrime(i) && primeNumContainer < 3) {
                    primeNumContainer += 1;
                    System.out.println("The prime " + i + " is number " + primeNumContainer);
                }
            }
        }
    }
}
