public class Main {
    private static int count;
    private static int sum;
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (i % 15 == 0) {
                count++;
                sum += i;
                System.out.println(i);
            }

            if (count == 5) {
                System.out.println("Sum of first primes meeting the conditions is " + sum);
                break;
            }
        }
    }

}