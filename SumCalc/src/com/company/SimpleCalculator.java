package com.company;

public class SimpleCalculator {

    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        if(num1 > 0) {
            this.num1 = num1;
        } else {
            System.out.println("The number is less than 0");
        }
    }

    public void setNum2(double num2) {
        if(num2 > 0) {
            this.num2 = num2;
        } else {
            System.out.println("The number is less than 0");
        }
    }

    public double getAdditionResult() {
        double result = num1 + num2;
        return result;
    }

    public double getMultiplicationResult() {
        double result = num1 * num2;
        return result;
    }

    public double getDivisionResult() {
        if(num2 == 0) {
            return 0;
        } else {
            double result = num1 / num2;
            return result;
        }
    }
}
