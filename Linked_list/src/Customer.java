public class Customer {
    private String customer_name;
    private double customer_balance;

    public Customer(String customer_name, double customer_balance) {
        this.customer_name = customer_name;
        this.customer_balance = customer_balance;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setCustomer_balance(double customer_balance) {
        this.customer_balance = customer_balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public double getCustomer_balance() {
        return customer_balance;
    }
}
