public class Main {
    public static void main(String[] args) {
        ITelephone phone;
        phone = new Desk_phone("777629166");
        System.out.println(desk_phone.check_if_phone_ringing());

        phone = new Mobile_phone("777629166", true);

    }
}