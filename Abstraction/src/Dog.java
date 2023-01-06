public class Dog extends Animal {

    public Dog() {
        super("mammal");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}
