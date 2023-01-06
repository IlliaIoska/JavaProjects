import java.util.Scanner;

public class TimeTable {
    private Scanner input;

    public TimeTable() {
        this.input = new Scanner(System.in);
    }

    public void get_timetable() {
        boolean has_next_int = false;
        System.out.println("Input an integer");
        while(true) {
            has_next_int = input.hasNextInt();
            if(has_next_int) {
                int number = input.nextInt();
                for(int i = 1; i <= 10; i++) {
                    System.out.println(number + " * " + i + " = " + (number * i));
                }
                break;
            }
            input.nextLine();
        }
        input.close();
    }
}
