import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions = new ArrayList<>();
    private double initial_amount;
    private String customer_name;
    public Customer(String customer_name, double initial_amount) {
        this.initial_amount = initial_amount;
        transactions.add(initial_amount);
        this.customer_name = customer_name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public double getInitial_amount() {
        return initial_amount;
    }

    public ArrayList<Double> add_transaction(double transaction) {
        transactions.add(transaction);
        System.out.println("Transaction " + transaction + " has been added to transactions list");
        return this.transactions;
    }

    public boolean check_if_transaction(Double transaction) {
        for (int i = 0; i < transactions.size(); i++) {
            if (transactions.get(i).equals(transaction)) {
                System.out.println("The transaction " + transaction + " has been found");
                return true;
            }
        }
        System.out.println("there is not such transaction");
        return false;
    }

    public int find_transaction_index(double transaction) {
        transaction = Double.valueOf(transaction);
        for (int i = 0; i < transactions.size(); i++) {
            if (check_if_transaction(transaction)) {
                return transactions.indexOf(transaction);
            }
        }
        return -1;
    }
}
