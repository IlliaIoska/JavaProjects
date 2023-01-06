package series_package;

public class Series {

    public static int get_sum(int number) {
        if (number <= 0) {
            System.out.println("Enter a positive number");
            return -1;
        } else {
            int sum = 0;
            for (int i = 0; i < number; i++) {
                sum += i;
            }
            return sum;
        }
    }

    public static int get_factorial_product(int number) {
        if (number == 0) {
            return 1;
        }  else {
            return number * get_factorial_product(number - 1);
        }
    }

}
