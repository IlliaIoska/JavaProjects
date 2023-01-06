public class Main {
    public static void main(String[] args) {

        System.out.println(sum_digits(121));
    }

    public static int sum_digits(int number) {


        if (number < 10) {
            return -1;
        } else {
            int sum = 0;
            int last_digit = 0;
            int num = number;
            while (num > 0) {
                last_digit = num % 10;
                
                System.out.println("the last digit is " + last_digit);
                sum += last_digit;
                System.out.println("sum is " + sum);
                num /= 10;
                System.out.println("num is " + num);

            }
            return sum;

        }
    }
}