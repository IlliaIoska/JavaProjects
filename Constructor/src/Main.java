public class Main {
    public static void main(String[] args) {

        Bank_account account = new Bank_account(1, 15000, "Peter", "ioskosh@gmail.com");

        int account_num = account.getAccount_num();
        int balance = account.getBalance();
        String owner_email = account.getOwner_email();
        String owner_name = account.getOwner_name();

        System.out.println("Bank account number " + account_num + " is owned by " + owner_name + " whose email is " + owner_email + ".\n" + "Account balance is " + balance);
        balance = account.deposit(-15000);
        System.out.println(balance);
        balance = account.withdraw(-31000);
        System.out.println(balance);



        Vip_customer vip_customer = new Vip_customer("John", 1555);
        String email = vip_customer.getEmail();
        System.out.println(email);
    }
}