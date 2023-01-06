package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 and 2 are operands "+" is an operator
        int remainder = result % 2; // = 1
        System.out.println("remainder = " + remainder);
        System.out.println("result = " + result);
        result++;
        System.out.println("result = " + result);
        result += 100;
        System.out.println("result = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Not an Alien");
            System.out.println("Not an Alien");
        }

        int topScore = 100;
        if (topScore <= 100) {
            System.out.println("You are at the top");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("newValue = " + newValue);
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("true");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        } else {
            System.out.printf("wasCar is false");
        }

        double var1 = 20.00d;
        double var2 = 80.00d;
        double sum = (var1 + var2) * 100;
        double rem = sum % 40.00d;
        boolean isRemZero = rem == 0 ? true : false;
        if (!isRemZero) {
            System.out.println("Got some reminder");
        } else {
            System.out.println("No reminder");
        }
    }
}
