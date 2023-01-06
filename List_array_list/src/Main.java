public class Main {
    public static void main(String[] args) {
        Mobile_phone mobile_phone = new Mobile_phone();
        System.out.println(mobile_phone.add_contact("John", "777629166"));
        System.out.println(mobile_phone.find_contact("name"));
    }
}