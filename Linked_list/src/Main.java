import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("John", 20.25);
        Customer customer2 = customer1;
        customer2.setCustomer_name("Sow");
        System.out.println(customer1.getCustomer_name());

        ArrayList<Integer> int_array = new ArrayList<>();
        int_array.add(1);
        int_array.add(3);
        int_array.add(6);

        for (int i = 0; i < int_array.size(); i++) {
            System.out.println((i + 1) + " element of the array of integers = " + int_array.get(i));
        }

        int_array.add(0, 2);

        for (int i = 0; i < int_array.size(); i++) {
            System.out.println((i + 1) + " element of the array of integers = " + int_array.get(i));
        }

    }
}