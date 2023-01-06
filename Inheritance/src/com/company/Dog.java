package com.company;

public class Dog extends Animal_template{

    private String mane_thickness;

    public Dog(int size, String species, String mane_thickness) {
        super(size, species);
    }

    public String getMane_thickness() {
        return mane_thickness;
    }


}
