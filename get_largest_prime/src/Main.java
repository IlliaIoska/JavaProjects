public class Main {
    public static void main(String[] args) {

        System.out.println(get_largest_prime_factor(10));
    }

    public static boolean check_prime(int number) {

        if (number <= 0) {
            return false;
        } else if ((number == 1) || (number == 2)) {
            return true;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int get_largest_prime_factor(int number) {

        if (number < 0) {
            return -1;
        }

        int largest_prime_factor = 0;
        int prime_factor = 0;

        for (int i = 2; i <= number / 2; i++) {
            if (check_prime(i) && (number % i == 0)) {
                 prime_factor = i;

                 if (prime_factor >= largest_prime_factor) {
                     largest_prime_factor = prime_factor;
                 }
            }
        }

        if (largest_prime_factor == 0) {
            System.out.println("No prime factors");
            return -1;
        }
        return largest_prime_factor;
    }

    public static int get_largest_prime(int number) {

        int prime = 0;

        for (int i = 2; i < number; i++) {
            if (check_prime(i)) {
                prime = i;
            }
        }
        return prime;

    }
}