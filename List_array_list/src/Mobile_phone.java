import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Mobile_phone {
    private Hashtable<String, String> contact_list = new Hashtable<>();
    private Scanner input = new Scanner(System.in);
    public Hashtable<String, String> add_contact(String name, String phone_number) {
        this.contact_list.put(name, phone_number);
        return this.contact_list;
    }

    public Hashtable<String, String> find_contact(String method) {

        switch (method) {
            case "name":
                System.out.println("You have chosen to find the contact by name. The name you are looking for is ");
                boolean is_string = true;
                Enumeration<String> names = this.contact_list.keys();
                System.out.println("Names = " + names);
                while (names.hasMoreElements()) {
                    is_string = input.hasNext();
                    if (is_string) {
                        String name = input.nextLine();
                        System.out.println("Your input name is " + name);
                        String name_in_list = names.nextElement();
                        System.out.println("Current compared name in the list of names is " + name_in_list);
                        if (name_in_list.equals(name)) {
                            return this.contact_list;
                        }
                    }
                    input.nextLine();
                }
                System.out.println("Given name has not been found");
                break;
            case "phone number":
                System.out.println("You have chosen to search for a contact using a phone number. Enter the phone number");
                is_string = true;
                Enumeration<String> phone_numbers = this.contact_list.elements();
                System.out.println("Names = " + phone_numbers);
                while (phone_numbers.hasMoreElements()) {
                    is_string = input.hasNext();
                    if (is_string) {
                        String phone_number = input.nextLine();
                        String name_in_list = phone_numbers.nextElement();
                        if (name_in_list.equals(phone_number)) {
                            return this.contact_list;
                        }
                    }
                    input.nextLine();
                }
                System.out.println("Given phone number has not been found");
                break;
        }
        return this.contact_list;
    }
    public Hashtable<String, String> remove_contact(String name) {
        Enumeration<String> names  = this.contact_list.keys();
        String contact_to_remove_by_name = name;
        while (names.hasMoreElements()) {
            String name_in_list = names.nextElement();
            if (name_in_list.equals(contact_to_remove_by_name)) {
                this.contact_list.remove(contact_to_remove_by_name);
            }
        }
        return this.contact_list;
    }


}
