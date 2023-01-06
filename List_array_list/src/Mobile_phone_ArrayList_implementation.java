import java.util.ArrayList;
import java.util.Hashtable;

public class Mobile_phone_ArrayList_implementation {
        private ArrayList<String> name_list = new ArrayList<>();
        private ArrayList<String> phone_number_list = new ArrayList<>();
        private Hashtable<ArrayList<String>, ArrayList<String>> contact_list = new Hashtable<>();

        private ArrayList<String> add_contact_name(String name) {
            name_list.add(name);
            return name_list;
        }

        private ArrayList<String> add_contact_phone_number(String phone_number) {
            phone_number_list.add(phone_number);
            return phone_number_list;
        }

        private ArrayList<String> remove_contact_name(String name) {
            int element_index = this.name_list.indexOf(name);
            this.name_list.remove(element_index);
            System.out.println("Contact name " + name + " has been removed");
            return this.name_list;
        }

        private  ArrayList<String> remove_contact_phone_number(String phone_number) {
            int element_index = this.phone_number_list.indexOf(phone_number);
            this.phone_number_list.remove(element_index);
            System.out.println("Contact phone number " + phone_number + " has been removed");
            return this.name_list;
        }
        public Hashtable<ArrayList<String>, ArrayList<String>> add_contact_info(String name, String phone_number) {
            this.contact_list.put(add_contact_name(name), add_contact_phone_number(phone_number));
            return this.contact_list;
        }

        public Hashtable<ArrayList<String>, ArrayList<String>> remove_contact_info(String name, String phone_number) {
            this.contact_list.remove(remove_contact_name(name));
            this.contact_list.remove(remove_contact_phone_number(phone_number));
            return this.contact_list;
        }
}
