package com.company;

public class ComplexNum {

    private double imaginary;
    private double real;

    public ComplexNum() {
        this(0, 0);
    }

    public ComplexNum(double imaginary, double real) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }
}
