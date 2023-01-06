package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Min " + myMinFloat);
        System.out.println("Max " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Min " + myMinDouble);
        System.out.println("Max " + myMaxDouble);

        int intNum = 5;
        float floatNum = 5f / 3;
        double doubleNum = 5d / 3;
        System.out.println("My float " + floatNum);
        System.out.println("my double " + doubleNum);
    }
}
