public class Main {
    public static void main(String[] args) {

        System.out.println(check_if_same_last_digit(41, 21, 71));
    }

    public static boolean check_if_same_last_digit(int num1, int num2, int num3) {

        int number1 = 0;
        int number2 = 0;
        int number3 = 0;

        if (num1 < 0) {
            number1 = -1 * num1;
        } else {
            number1 = num1;
        }

        if (num2 < 0) {
            number2 = -1 * num2;
        } else {
            number2 = num2;
        }

        if (num3 < 0) {
            number3 = -1 * num3;
        } else {
            number3 = num3;
        }

        int last_digit1 = number1 % 10;
        int last_digit2 = number2 % 10;
        int last_digit3 = number3 % 10;

        if ((last_digit2 == last_digit1) && (last_digit1 == last_digit3)) {
            System.out.println("All three last digits are equal");
            return true;
        } else {
            System.out.println("Not all or none of the last digits are equal");
            return false;
        }
    }
}