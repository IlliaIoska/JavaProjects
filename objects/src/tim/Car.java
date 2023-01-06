package tim;

import java.util.Scanner;

public class Car {

    private int doors_num;
    private int wheels_num;
    private String model_name;

    public static String input_string() {

        Scanner input = new Scanner(System.in);
        String string = "";
        boolean is_string = true;

        while (true) {
            is_string = input.hasNext();

            if(is_string) {
                string = input.next();
                input.close();
                return string;
            } else {
                System.out.println("Invalid value");
            }
            input.nextLine();
        }
    }

    public void set_model_name() {
        System.out.printf("Model name is ");
        this.model_name = input_string();
    }

    public String get_model_name() {
        return this.model_name;
    }
}
