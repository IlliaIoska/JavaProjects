import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            this.transactions.add(amount);
            this.balance += amount;
            System.out.println("the amount has been deposited. Current Balance - " + this.balance);
        } else {
            System.out.println("Cannot deposit a non-positive amount");
        }
    }

    public void withdraw(int amount) {
        int withdraw_amount = -amount;
        if(amount > 0) {
            this.transactions.add(withdraw_amount);
            this.balance += withdraw_amount;
            System.out.println("The amount " + amount + " has been withdrawn from the bank account. Your current balance = " + this.balance);
        } else {
            System.out.println("Cannot withdraw a non-positive amount");
        }
    }
}
