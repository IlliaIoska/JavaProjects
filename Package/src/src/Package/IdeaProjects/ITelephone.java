package src.Package.IdeaProjects;

public interface ITelephone {
    void turn_power_on();
    void dial(String phone_number);
    void answer();
    boolean call_phone(String phone_number);
    boolean check_if_phone_ringing();
}
