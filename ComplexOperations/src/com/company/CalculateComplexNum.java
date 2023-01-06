package com.company;

public class CalculateComplexNum {

    private ComplexNum num1;
    private ComplexNum num2;

    public CalculateComplexNum(ComplexNum num1, ComplexNum num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addComplexNums() {
        double totalImaginary = num1.getImaginary() + num2.getImaginary();
        double totalReal = num1.getReal() + num2.getReal();
        System.out.println("Num1 = " + num1.getReal() + " + " + num1.getImaginary() + "i"
        + " Num2 =" + num2.getReal() + " + " + num2.getImaginary() + "i = " + totalReal + " + " + totalImaginary + "i");

    }
}
