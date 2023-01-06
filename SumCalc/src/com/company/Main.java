package com.company;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        double num1 = 0;
        calculator.setNum1(num1);
        double num2 = 1;
        calculator.setNum2(num2);
        double sum = calculator.getAdditionResult();
        System.out.println("Num1 = " + num1 + " Num2 = " + num2 + " = " + sum);
    }
}
