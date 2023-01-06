import com.company.Animal_template;
import com.company.Cat;
import com.company.Dog;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(5,"cat", true);

        int cat_size = cat.getSize();
        System.out.println(cat_size);

        cat.poop();

        Animal_template animal = new Animal_template(5, "dog");

        animal.poop();

        cat.move();
        Dog dog = new Dog(5, "dog", "high thikness");
        dog.move();

    }
}