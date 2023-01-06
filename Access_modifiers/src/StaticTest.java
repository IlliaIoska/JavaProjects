public class StaticTest {
    private static int instance_number = 0;
    private String instance_name;

    public StaticTest(String name) {
        this.instance_name = name;
        this.instance_number++;
    }

    public static int getInstance_number() {
        return instance_number;
    }

    public String getInstance_name() {
        return instance_name;
    }
}
