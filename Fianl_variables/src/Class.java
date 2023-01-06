public class Class {
//    public static final int instance_number = 0;
    public final int instance_number;
    public static int instance_counter = 0;
    private final String instance_name;

    public Class(String instance_name) {
        this.instance_name = instance_name;
        instance_counter++;
        instance_number = instance_counter;
    }

    public int getInstance_number() {
        return instance_number;
    }
}
