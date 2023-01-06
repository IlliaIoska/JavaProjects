import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<>();

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public ArrayList<Branch> add_branch(String branch_name) {
        Branch branch = new Branch(branch_name);
        branches.add(branch);
        return branches;
    }

    public ArrayList<Branch> remove_branch(String branch_name) {
        Branch branch = check_if_branch(branch_name);
        if (branch != null) {
            branches.remove(find_branch_index(branch_name));
        } else {
            System.out.println("The customer has not been found");
        }
        return branches;
    }

    public ArrayList<Customer> add_customer(String branch_name, String customer_name, double initial_amount) {
        Branch branch = check_if_branch(branch_name);
        if (branch != null) {
            branch.add_customer(customer_name, initial_amount);
        } else {
            System.out.println("The branch does not exists, therefore you cannot add the customer");
        }
        return branch.getCustomers();
    }

    public ArrayList<Customer> remove_customer(String branch_name, String customer_name) {
        Branch branch = new Branch(branch_name);
        if (check_if_branch(branch_name) != null) {
            if (branch.check_if_customer(customer_name)) {
                branch.getCustomers().remove(branch.find_customer_index(customer_name));
            }
        }
        return branch.getCustomers();
    }
    private Branch check_if_branch(String branch_name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranch_name().equals(branch_name)) {
                return branches.get(i);
            }
        }
        return null;
    }

    private int find_branch_index(String branch_name) {
        for (int i = 0; i < branches.size(); i++) {
            if (check_if_branch(branch_name) != null) {
                return branches.indexOf(check_if_branch(branch_name));
            }
        }
        return -1;
    }

    public void get_customers() {
        for (int i = 0; i < branches.size(); i++) {
            System.out.println("Customers are " + branches.get(i).getCustomers().get(i).getCustomer_name());
        }

    }
}
