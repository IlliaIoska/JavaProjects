package com.company;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String color;

    public void setModel(String model) {
        this.model = model;
        model = model.toLowerCase();
        if(model.equals("carrera")) {
            System.out.println("Model " + model + " has benn successfully added to the list");
        } else {
            System.out.println("The model is unknown");
        }
    }

    public String getModel() {
        return this.model;
    }
}
