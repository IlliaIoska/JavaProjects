public class Main {
    public static void main(String[] args) {

        System.out.println(find_greatest_common_divisor(81,153));
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

    public static int find_greatest_common_divisor(int num1, int num2) {

        int greater_number = return_greater(num1, num2);
        int smaller_number = return_smaller(num1, num2);

        if (greater_number % smaller_number == 0) {
            return smaller_number;
        } else {
            int greatest_common_divisor = 0;
            for (int i = 2; i < smaller_number; i++) {
                if ((smaller_number % i == 0) && (greater_number % i == 0)) {
                    greatest_common_divisor = i;
                }
            }
            return greatest_common_divisor;
        }
    }
}