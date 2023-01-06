public abstract class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public abstract void eat();

    public String getSpecies() {
        return species;
    }
}
