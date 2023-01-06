public class Mobile_phone implements ITelephone {
    private String phone_number;
    private boolean is_mobile_phone_ringing;
    private boolean is_mobile_on;

    public Mobile_phone(String phone_number, boolean is_mobile_on) {
        this.phone_number = phone_number;
        this.is_mobile_on = is_mobile_on;
    }

    @Override
    public void turn_power_on() {
        if (!this.is_mobile_on) {
            System.out.println("THe power if turned off");
        } else {
            System.out.println("The power is turned on");
        }
    }

    @Override
    public void dial(String phone_number) {

    }

    @Override
    public void answer() {

    }

    @Override
    public boolean call_phone(String phone_number) {
        return false;
    }

    @Override
    public boolean check_if_phone_ringing() {
        return false;
    }
}
