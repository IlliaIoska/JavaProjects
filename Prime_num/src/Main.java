public class Main {
    private static int prime_count;
    public static void main(String[] args) {

        print_prime(50);
    }

    public static boolean check_prime(int num) {

        if (num <= 1) {
            return false;
        } else {
            int prime_counter;
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }

    public static void print_prime(int upto_num) {



        for (int i = 1; i <= upto_num; i++) {
            if(check_prime(i)) {
                prime_count += 1;
                System.out.println(i);
            }
        }
        System.out.println(prime_count);
    }

}
