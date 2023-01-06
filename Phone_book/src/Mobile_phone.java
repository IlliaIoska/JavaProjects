import java.util.ArrayList;

public class Mobile_phone {
    private ArrayList<Contact> contact_list = new ArrayList<>();

    public ArrayList<Contact> add_contact(Contact contact) {
        boolean is_contact = check_if_contact_exists(contact);

        for (int i = 0; i < contact_list.size(); i++) {
            if (is_contact) {
                System.out.println("The contact already exists");
                return contact_list;
            } else {
                System.out.println("going to add " + contact.getName() + " to the contact list");
                contact_list.add(contact);
                break;
            }
        }
        contact_list.add(contact);
        System.out.println("Contact " + contact.getName() + " has been added to your mobile phone's phonebook");
        return contact_list;
    }

    public void show_contact_list() {
        for (int i = 0; i < contact_list.size(); i++) {
            System.out.println("Contact " + (i + 1) + " = " + contact_list.get(i).getName());
        }
    }
    public boolean check_if_contact_exists(Contact contact) {
        for (int i = 0; i < contact_list.size(); i++) {
            if (contact_list.get(i).getName().equals(contact.getName())){
                return true;
            }
        }
        return false;
    }

    public int find_contact_index(Contact contact) {
        int contact_index = 0;
        boolean is_contact = check_if_contact_exists(contact);
        if (is_contact) {
            contact_index = contact_list.indexOf(contact);
        } else {
            System.out.println("There is no such contact");
        }
        return contact_index;
    }

    public ArrayList<Contact> remove_contact(Contact contact) {
        boolean is_contact = check_if_contact_exists(contact);
        for (int i = 0; i < contact_list.size(); i++) {
            if (is_contact) {
                System.out.println("Going to remove " + contact_list.indexOf(contact) + " from the phonebook");
                contact_list.remove(find_contact_index(contact));
                System.out.println("Contact removed successfully");
            } else {
                System.out.println("There is no such contact in the phonebook");
            }
        }

        return contact_list;
    }

    public ArrayList<Contact> update_contact(Contact contact, String new_name, String new_phone_number) {
        boolean is_contact = check_if_contact_exists(contact);
        if (is_contact) {
            int current_contact_index = contact_list.indexOf(contact);
            Contact updated_contact = new Contact(new_name, new_phone_number);
            contact_list.set(current_contact_index,updated_contact);
            System.out.println("Index is " + current_contact_index);
            System.out.println(contact_list.get(current_contact_index).getName());
        }

        return contact_list;
    }
}
