import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        int counter = 1;
        System.out.println("Enter value number " + counter);
        boolean is_int = true;

        while (counter <= 10) {
            is_int = input.hasNextInt();
            if (is_int) {
                num = input.nextInt();
                sum += num;
                System.out.println("Value = " + num);
                counter++;
            } else {
                System.out.println("Invalid value");
                //input.nextLine();
                //is_int = input.hasNextInt();
            }
            input.nextLine();
        }
        System.out.println("Sum is " + sum);
        input.close();
    }
}