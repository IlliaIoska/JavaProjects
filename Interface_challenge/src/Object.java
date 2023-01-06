import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Object implements I_savable_object {
    private List<Object> objects = new ArrayList<>();
    private String string_value;
    private int int_value;

    private Scanner input;

    public Object() {
    }

    public Object(String string_value, int int_value) {
        this.string_value = string_value;
        this.int_value = int_value;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public String getString_value() {
        return string_value;
    }

    public int getInt_value() {
        return int_value;
    }

    public Scanner getInput() {
        return input;
    }

    @Override
    public Object populate_object_fields() {
        input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter an integer");
            boolean is_int = input.hasNextInt();
            if (is_int) {
                this.int_value = input.nextInt();
                System.out.println("The integer " + this.int_value + " has been accepted");
                break;
            } else {
                System.out.println("Not an integer");
            }
            input.nextLine();
        }

        System.out.println("Going to set string_value parameter's value next");

        while (true) {
            System.out.println("Enter a value of the type String");
            boolean is_string = input.hasNext();
            if (is_string) {
                String string_value = input.next();
                System.out.println("The String value has been accepted");
                break;
            } else {
                System.out.println("Not a string value");
            }
            input.nextLine();
        }
        input.close();
        return new Object(this.string_value, this.int_value);
    }

    @Override
    public List<Object> add_object_to_objects() {
        Object object = populate_object_fields();
        this.objects.add(object);
        System.out.println("The object " + object + " has been added to the object list");
        return this.objects;
    }
}
