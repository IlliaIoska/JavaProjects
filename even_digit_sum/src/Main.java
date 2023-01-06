public class Main {
    public static void main(String[] args) {

        sum_even(1221);
    }

    public static boolean check_even(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void sum_even(int num) {

        int number = 0;
        int number2 = 0;
        if (num < 0) {
            number = -1 * num;
            number2 = -1 * num;
        } else {
            number = num;
            number2 = num;
        }

        int digit_counter = 0;
        int first_digit = 0;
        int last_digit = 0;
        while (number2 > 0) {
            digit_counter++;
            number2 /= 10;
        }
        System.out.println("Counter is " + digit_counter);

        int sum = 0;

        for (int i = digit_counter - 1; i >= 1; i -= 2) {
            first_digit = (int) (number / Math.pow(10, i));
            System.out.println("First digit is " + first_digit);
            last_digit = number % 10;
            System.out.println("Last digit is " + last_digit);
            number -= (int) (first_digit * Math.pow(10, i));
            number /= 10;
            System.out.println("number2 is " + number);

            if (check_even(first_digit)) {
                sum += first_digit;
            }
            if (check_even(last_digit)) {
                sum += last_digit;
            }

        }
        System.out.println("Sum is " + sum);

    }
}