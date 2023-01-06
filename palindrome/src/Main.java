public class Main {
    public static void main(String[] args) {

        System.out.println(check_palindrome(123456));
    }

    public static boolean check_palindrome(int num) {

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

        for (int i = digit_counter - 1; i >= 1; i -= 2) {
            first_digit = (int) (number / Math.pow(10, i));
            System.out.println("First digit is " + first_digit);
            last_digit = number % 10;
            System.out.println("Last digit is " + last_digit);
            number -= (int) (first_digit * Math.pow(10, i));
            number /= 10;
            System.out.println("number2 is " + number);

            if (first_digit != last_digit) {
                return false;
            }
        }
        return true;

        }
    }

