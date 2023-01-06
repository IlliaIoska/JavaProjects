package com.company;

public class Main {

    public static void main(String[] args) {

        ComplexNum num1 = new ComplexNum(1,1);
        ComplexNum num2 = new ComplexNum(2, 2);
        CalculateComplexNum calculator = new CalculateComplexNum(num1, num2);
        calculator.addComplexNums();
    }
}
