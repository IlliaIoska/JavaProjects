package src.Package.IdeaProjects;

public class Desk_phone implements ITelephone {
    private String phone_number;
    private boolean is_phone_ringing;

    public Desk_phone(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public void turn_power_on() {
        System.out.println("Turning the power on");
    }

    @Override
    public void dial(String phone_number) {
        System.out.println("Diling the phone number " + phone_number);

    }

    @Override
    public void answer() {
        if (is_phone_ringing) {
            System.out.println("Answering");
            is_phone_ringing = false;
        }
    }

    @Override
    public boolean call_phone(String phone_number) {
        this.phone_number = phone_number;
        System.out.println("Calling the phone number");
        return true;
    }

    @Override
    public boolean check_if_phone_ringing() {
        boolean is_phone_ringing = false;
        if (call_phone(this.phone_number)) {
            is_phone_ringing = true;
        }
        return is_phone_ringing;
    }
}
