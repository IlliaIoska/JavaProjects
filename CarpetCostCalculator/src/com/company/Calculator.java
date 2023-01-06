package com.company;

public class Calculator {

    private Floor area;
    private Carpet price;

    public Calculator(Floor area, Carpet price) {
        this.area = area;
        this.price = price;
    }

    public double getTotalCost() {
        return area.getArea() * price.getPrice();
    }
}
