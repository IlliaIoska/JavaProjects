public class Bank_account {

    private int account_num;
    private int balance;
    private String owner_name;
    private String owner_email;

    public Bank_account(int account_num, int balance, String owner_name, String owner_email) { // acts as a global setter
        this.account_num = account_num;
        this.balance = balance;
        this.owner_name = owner_name;
        this.owner_email = owner_email;
    }

    public String getOwner_email() {
        return this.owner_email;
    }

    public int getAccount_num() {
        return this.account_num;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getOwner_name() {
        return this.owner_name;
    }

    public int deposit(int amount) {
        int deposit_amount = amount;
        if (deposit_amount < 0) {
            System.out.println("you are going to withdraw " + ((-1) * amount) + " from your bank account");
            deposit_amount *= (-1);
        }

        System.out.println("Account balance is ");
        this.balance += deposit_amount;
        return this.balance;
    }

    public int withdraw(int amount) {
        int withdraw_amount = amount;
        if (withdraw_amount < 0) {
            System.out.println("you are going to withdraw " + ((-1) * amount) + " from your bank account");
            withdraw_amount *= (-1);
        }
        if (withdraw_amount > this.balance) {
            System.out.println("Withdrawal failed. Insufficient funds. Your current balance is");
            return this.balance;
        } else {
            System.out.println("Account balance is ");
            this.balance -= withdraw_amount;
            return this.balance;
        }
    }




}
