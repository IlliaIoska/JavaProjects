public class Main {
    public static void main(String[] args) {

        find_greatest_common_divisor(81,153);
    }

    public static int return_greater(int num1, int num2) {

        if (num2 >= num1) {
            return num2;
        } else {
            return num1;
        }
    }

    public static int return_smaller(int num1, int num2) {

        if (num2 < num1) {
            return num2;
        } else {
            return num1;
        }
    }

    public static void find_greatest_common_divisor(int num1, int num2) {

        int greater_number = return_greater(num1, num2);
        int smaller_number = return_smaller(num1, num2);

        for (int i = 1; i <= smaller_number; i++) {
            if (smaller_number % i == 0) {
                System.out.println(i + " is a factor of " + smaller_number);
            }
        }

        for (int i = 1; i <= greater_number; i++) {
            if (greater_number % i == 0) {
                System.out.println(i + " is a factor of " + greater_number);
            }
        }
    }
}