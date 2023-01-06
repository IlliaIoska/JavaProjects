import java.util.ArrayList;
import java.util.Scanner;

public class Grocery_list {
    private static ArrayList<String> array_list = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    private ArrayList<String> getArray_list() {
        return array_list;
    }

    private Scanner getInput() {
        return input;
    }

    public void choose_grocery_list_operation(int operation) {
        if(operation <= 0) {
            System.out.println("Invalid operation value. Choose from 1 to 1 to 2 both ends included");
        } else {
            switch (operation) {
                case 1:
                    System.out.println("You have chosen operation adding to the list");
                    System.out.println("Type in the value you want to enter");
                    add_grocery_item(input.nextLine());
                    break;
                case 2:
                    System.out.println("You have chosen the operation find the element in the list");
                    System.out.println("Type in the value of the element you want to search for");
                    find_element_2(input.nextLine());
                    break;
            }
        }
    }
    public void add_grocery_item(String item) {
        array_list.add(item);
        System.out.println("Item " + item + " hs just been added");
    }

    public void print_grocery_item() {
        int grocery_list_size = array_list.size();

        for (int i = 0; i < grocery_list_size; i++) {
            System.out.println("Item " + array_list.get(i));
        }
    }

    public String find_element(String searhed_element_value, ArrayList<String> string_array) {
        String searched_element = "";
        for (int i = 0; i < string_array.size(); i++) {
            if (string_array.get(i).equals(searhed_element_value)) {
                System.out.println("Found the element");
                searched_element = searhed_element_value;
            } else {
                System.out.println("Searched for element has not been found");
            }
        }
        return searched_element;
    }

    public String find_element_2(String element) {
        String element_value = "";
        boolean has_element = array_list.contains(element);
        if (has_element) {
            int searched_element_index = array_list.indexOf(element);
            System.out.println("THe element's index is " + searched_element_index);
            element_value = array_list.get(searched_element_index);
        }
        return element_value;
    }
}
