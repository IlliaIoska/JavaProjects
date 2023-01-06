import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        sum_input();
    }

    public static int input_int() {

        Scanner input = new Scanner(System.in);
        int num = 0;
        boolean is_int = true;

        while(true) {
            System.out.println("Enter an integer ");
            is_int = input.hasNextInt();
            if(is_int) {
                num = input.nextInt();
                return num;
            } else {
                System.out.println("invalid value. enter an integer");
            }
            input.nextLine();
        }
    }

    public static void sum_input() {

        int sum = 0;
        double avg = 0;
        int counter = 1;


        while(counter <= 10) {
            sum += input_int();
            avg = sum / counter;
            counter++;
        }

        System.out.println("sum = " + sum);
        System.out.println("AVG = " + avg);
    }

    public static int compare_input() {

        int num1 = input_int();
        int num2 = input_int();

        if (num1 >= num2) {
            System.out.println(num1 + " is greater");
            return num1;
        } else {
            System.out.println(num2 + " is greater");
            return num2;
        }
    }
}