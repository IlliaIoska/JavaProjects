public class Main {
    public static void main(String[] args) {
//        Class instance1 = new Class("Jojo");
//        Class instance2 = new Class("jja");
//        System.out.println(instance1.getInstance_number());
//        System.out.println(instance2.getInstance_number());

        Password password = new Password(123);
        password.is_pass_valid(123);
        System.out.println(password.getEncrypted_password());
    }
}