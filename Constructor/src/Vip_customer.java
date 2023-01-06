public class Vip_customer {

    private String name;
    private int credit_limit;
    private String email;

    public Vip_customer(String name, int credit_limit, String email) {
        this.credit_limit = credit_limit;
        this.name = name;
        this.email = email;
    }

    public Vip_customer(String name, int credit_limit) {
        this(name, credit_limit, "ioskosh@gmail.com");
    }

    public Vip_customer(String name) {
        this(name, 15000, "ioskosh@gmail.com");
    }

    public String getName() {
        return this.name;
    }

    public int getCredit_limit() {
        return this.credit_limit;
    }

    public String getEmail() {
        return this.email;
    }
}
