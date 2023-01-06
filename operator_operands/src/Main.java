public class Main {
    public static void main(String[] args) {

        double double1 = 20d;
        double double2 = 80d;

        double sum = double1 + double2;

        double multiplication_by100 = sum * 100d;

        double remainder = sum % 40d;

        boolean is_remainder_zero = (remainder == 0) ? true : false;

        if (!is_remainder_zero) {
            System.out.println("remainder = " + remainder);
        }


    }
}