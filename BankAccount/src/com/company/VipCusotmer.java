package com.company;

public class VipCusotmer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCusotmer() {
        this("name", 1, "iosko@gmail.com");
    }

    public VipCusotmer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCusotmer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
