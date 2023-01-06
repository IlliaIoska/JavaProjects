public class Main {
    public static void main(String[] args) {
        int number = 1;
        int counter = 0;
        while ((number < 20) && (counter != 5)) {
            if (check_even(number)) {
                counter++;
                System.out.println(number + " is even");
                number++;
            } else {
                number++;
            }
        }
    }

    public static boolean check_even(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}