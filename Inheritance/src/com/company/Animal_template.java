package com.company;

public class Animal_template {

    private int size;
    private String species;

    public Animal_template(int size, String species) {
        this.size = size;
        this.species = species;
    }

    public int getSize() {
        return size;
    }

    public String getSpecies() {
        return species;
    }

    public void poop() {
        String animal_species = this.species;
        System.out.println(animal_species + "'s pooping");
    }

    public void move() {
        String species = getSpecies();
        System.out.println("Move like a " + species);
    }
}
