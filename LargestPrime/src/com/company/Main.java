package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(findGreatestPrime(7));
    }

    public static int findGreatestPrime(int num) {

        if(num > 0) {
            int actNum = num;
            while(actNum > 0) {
                if(num % actNum == 0) {
                    if(isPrime(actNum)) {
                        return actNum;
                    }
                }
                actNum--;
            }
        }
        return -1;
    }

    public static boolean isPrime(int num) {

        boolean isPrime = false;
        int actNum;
        int count = 1;
        if(num > 0) {
            actNum = num -1;
            while(actNum > 0) {
                if(num % actNum == 0) {
                    count++;
                }
                actNum--;
            }

            if(count == 2) {
                isPrime = true;
                return isPrime;
            }
        }
         return isPrime;
    }
}
