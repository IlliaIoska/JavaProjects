package com.company;

public class Carpet {

    private double price;

    public Carpet(double price) {
        if(price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public Carpet() {
        this(1);
    }

    public double getPrice() {
        return price;
    }
}
