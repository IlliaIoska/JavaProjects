public class Main {
    public static void main(String[] args) {

        System.out.println(sum_odd(99,99));
    }

    public static boolean is_odd(int num) {

        if (num <= 0) {
            System.out.println("Enter a number greater than 0");
            return false;
        } else {
            if (num % 2 != 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int sum_odd(int start, int end) {

        int sum = 0;

        if ((start <= 0) || (end <= 0)) {
            System.out.println("'Enter' and 'Start' must be greater than 0");
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (is_odd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}