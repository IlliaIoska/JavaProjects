package com.company;

public class Cat extends Animal_template{

    private boolean whiskers;

    public Cat(int size, String species, boolean whiskers) {
        super(size, species);
        this.whiskers = whiskers;
    }

    public boolean isWhiskers() {
        return whiskers;
    }

    @Override
    public void poop() {
        String animal_species = getSpecies();
        System.out.println(animal_species + "'s pooping like a " + animal_species);
    }


}
