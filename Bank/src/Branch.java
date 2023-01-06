import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers = new ArrayList<>();
    private String branch_name;

    public Branch(String branch_name) {
        this.branch_name = branch_name;
    }
    public String getBranch_name() {
        return branch_name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Branch getBranch() {
        return new Branch(branch_name);
    }

    public ArrayList<Customer> add_customer(String customer_name, double initial_amount) {
        Customer customer = new Customer(customer_name, initial_amount);
        customers.add(customer);
        return customers;
    }

    public ArrayList<Customer> remove_customer(String customer_name, double initial_amount) {
        Customer customer = new Customer(customer_name, initial_amount);
        boolean is_customer = check_if_customer(customer_name);
        if (is_customer) {
            customers.remove(find_customer_index(customer_name));
        } else {
            System.out.println("The customer has not been found");
        }
        return customers;
    }
    public boolean check_if_customer(String customer_name) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomer_name().equals(customer_name)) {
                return true;
            }
        }
        return false;
    }

    public int find_customer_index(String customer_name) {
        for (int i = 0; i < customers.size(); i++) {
            if (check_if_customer(customer_name)) {
                double customers_initial_amount = customers.get(i).getInitial_amount();
                return customers.indexOf(new Customer(customer_name, customers_initial_amount));
            }
        }
        return -1;
    }
}
