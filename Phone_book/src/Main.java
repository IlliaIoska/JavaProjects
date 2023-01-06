public class Main {
    public static void main(String[] args) {
        Contact john = new Contact("john", "123");
        Contact lawn = new Contact("john", "123");
        Mobile_phone mobile_phone = new Mobile_phone();
        mobile_phone.add_contact(john);
        mobile_phone.show_contact_list();
        mobile_phone.add_contact(lawn);
        mobile_phone.show_contact_list();

    }
}