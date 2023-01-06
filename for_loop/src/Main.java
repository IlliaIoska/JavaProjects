public class Main {
    public static void main(String[] args) {

        System.out.println(calc_interest(2000,0.02,4));
        System.out.println(3/2);
    }

    public static double calc_interest(double amount, double interest_rate, double years) {

        if ((amount <= 0) || (interest_rate <= 0) || (years <= 0)) {
            return -1;
        } else {
            double amount_of_interest = amount;
            double interest;
            for (double i = 0; i < years; i++) {
                interest = interest_rate * amount_of_interest;
                System.out.println(interest);
                amount_of_interest -= interest;
                System.out.println(amount_of_interest);
            }
            return amount_of_interest;
        }
    }
}