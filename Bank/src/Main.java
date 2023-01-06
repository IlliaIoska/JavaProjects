public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.add_branch("Glassgow");
        bank.add_customer("Glassgow", "John", 200);
        System.out.println(bank.getBranches());
        bank.get_customers();

    }
}