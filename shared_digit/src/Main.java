public class Main {
    public static void main(String[] args) {

        System.out.println(check_shared(12,341));
    }

    public static boolean check_shared(int num1, int num2) {

        int number1 = 0;
        int number2 = 0;
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

        int last_number1 = 0;
        int last_number2 = 0;

        while (number1 > 0) {
            last_number1 = number1 % 10;
            number1 /= 10;
            System.out.println("last number1 is " + last_number1);
            while (number2 > 0) {
                last_number2 = number2 % 10;
                System.out.println("last number2 is " + last_number2);
                number2 /= 10;
                if (last_number1 == last_number2) {
                    return true;
                }
            }
            number2 = num2;
        }
        return false;
    }
}