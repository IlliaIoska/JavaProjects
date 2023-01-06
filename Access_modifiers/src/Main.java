public class Main {
    public static int multiplier = 8; // non-static variables and methods exists when there is an instance of a class,
    // otherwise non-static variables and methods cannot be accessed
    public static void main(String[] args) {
//        Account account = new Account("Jojo");
//        account.deposit(2000);
//        account.withdraw(100);
//        System.out.println("Balance = " + account.getBalance());
//        StaticTest test1 = new StaticTest("First Instance");
//        System.out.println("First Instance's name and number repectively: " + test1.getInstance_name() + ":" + StaticTest.getInstance_number());
//        StaticTest test2 = new StaticTest("Second Instance");
//        System.out.println("Second Instance's name and number repectively: " + test2.getInstance_name() + ":" + StaticTest.getInstance_number());
        int answer = multiply(2);
    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
