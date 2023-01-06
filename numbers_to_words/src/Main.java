public class Main {
    public static void main(String[] args) {

        to_words(35);
    }

    public static void to_words(int number) {

        if (number < 0) {
            System.out.println("Input non-negative number");
        } else {
            int digit_counter = 0;
            int num = number;
            int num1 = number;
            int last_digit = 0;

            while (num > 0) {
                digit_counter++;
                last_digit = num % 10;
                num /= 10;

                switch (last_digit) {
                    case 0:
                        System.out.println("ZERO");
                        break;
                    case 1:
                        System.out.println("ONE");
                        break;
                    case 2:
                        System.out.println("TWO");
                        break;
                    case 3:
                        System.out.println("THREE");
                        break;
                    case 4:
                        System.out.println("FOUR");
                        break;
                    case 5:
                        System.out.println("FIVE");
                        break;
                    case 6:
                        System.out.println("SIX");
                        break;
                    case 7:
                        System.out.println("SEVEN");
                        break;
                    case 8:
                        System.out.println("EiGHT");
                        break;
                    case 9:
                        System.out.println("NINE");
                        break;
                }
            }

            int first_digit = 0;
            for (int i = digit_counter - 1; i >= 0; i--) {
                first_digit = (int) (num1 / Math.pow(10, i));
                first_digit -=  (int) (num1 / Math.pow(10, i+1)) * (int) Math.pow(10, i+1);
                System.out.println(first_digit);
                switch (first_digit) {
                    case 0:
                        System.out.println("ZERO");
                        break;
                    case 1:
                        System.out.println("ONE");
                        break;
                    case 2:
                        System.out.println("TWO");
                        break;
                    case 3:
                        System.out.println("THREE");
                        break;
                    case 4:
                        System.out.println("FOUR");
                        break;
                    case 5:
                        System.out.println("FIVE");
                        break;
                    case 6:
                        System.out.println("SIX");
                        break;
                    case 7:
                        System.out.println("SEVEN");
                        break;
                    case 8:
                        System.out.println("EiGHT");
                        break;
                    case 9:
                        System.out.println("NINE");
                        break;
                }
            }
        }
    }
}