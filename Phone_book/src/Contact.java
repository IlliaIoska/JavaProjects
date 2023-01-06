public class Contact {
    private String name;
    private String phone_number;

    public Contact(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    //public Contact create_contact(String name, String phone_number) {
    //    return new Contact(name, phone_number);
    //}
}
