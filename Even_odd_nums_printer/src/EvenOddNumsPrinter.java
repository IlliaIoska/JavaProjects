import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class has the implementation of a program printing a sequence of either even or odd numbers (to console or a file
 * as per user's choice).
 * The type of numbers in a sequence depends on the count of elements which have been read either from console or a file
 * (decided by the user).
 *<p>
 * The class has six fields:
 * 1. {@code Scanner input}  to get input from user
 * 2. {@code ArrayList<Integer>} to store value from input.
 * 3. {@code final String NO_DATA_TO_PRINT} to print out a message signifying that there was no input from user and, therefore,
 * no content to print
 * 4. {@code final String PROGRAM_EXIT} holds a value of which is meant to show that, by the user's choice,
 * the program has been closed.
 * 5. {@code fina String NO_SUCH_CHOICE} rendering an invalidity of the user's choice
 * 6. {@code final String INVALID_INPUT_TYPE} to show that the user's input is invalid
 *<p>
 *Methods:
 * 1. {@code public void run_app()} executes successively 2 choices:
 * - input from console or a file
 * - output to console or a file
 * 2. {@code private void make choice1()}:
 * Asks for valid choice input until the condition is met.
 * If met, executes either method <i>4</i> or <i>5</i> depending on the input choice from the user,
 * then executes method <i>3</i>.
 * 3. {@code prvate void make choice2()}:
 * Asks for valid choice input until the condition is met.
 * If met, prints out either to console or a file by executing methods <i>9</i> or <i>6</i> respectively.
 * When method <i>9</i> is executed, prompted to further choose to print either sorted or unsorted values
 * using methods <i>7</i> for the "sorted" or <i>8</i> for the  "unsorted" option.
 * 4. {@code private ArrayList<Integer> read_from_console()}
 * 5. {@code private ArrayList<Integer> read_from_file()}
 * 6. {@code private File write_to_file()}
 * 7. {@code private ArrayList<Integer> print_sorted()}
 * 8. {@code private ArrayList<Integer> print_unsorted()}
 * 9. {@code private void print_nums()}
 * 10. {@code public ArrayList<Integer> getNumbers()}
 * 11. {@code private sort_numbers()}
 * <p>
 * Constructor EvenOddNumsPrinter with no parameters to initiate the public method {@code run_app()}
 *
 *
 */
public class EvenOddNumsPrinter {
    private Scanner input;
    private ArrayList<Integer> numbers;

    private final String NO_DATA_TO_PRINT = "No data to print";
    private final String PROGRAM_EXIT = "The program has been closed";

    private final String INVALID_INPUT_TYPE = "Invalid input type";

    private final String NO_SUCH_CHOICE = "There is no such choice";
    public EvenOddNumsPrinter() {

    }
    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void run_app() {
        input = new Scanner(System.in);
        make_choice1();
        make_choice2();
    }

    private void make_choice1() {
        boolean is_string;
        while (true) {
            System.out.println("1. Read from a console (input 'console') \n 2. Read from a file (input 'file') \n 3. To exit (input 'exit')");
            is_string = input.hasNext();
            if (is_string) {
                String choice1 = input.next();
                System.out.println("Choice1 = " + choice1);
                switch (choice1) {
                    case "console":
                        read_from_console();
                        System.out.println("Reading from console has been successful");
                        make_choice2();
                        break;
                    case "file":
                        read_from_file();
                        System.out.println("Reading from the file has been successful");
                        make_choice2();
                        break;
                    case "exit":
                        System.out.println(PROGRAM_EXIT);
                        System.exit(0);
                    default:
                        System.out.println(NO_SUCH_CHOICE);
                        break;
                }
            } else {
                System.out.println(INVALID_INPUT_TYPE);
            }
            input.nextLine();
        }
    }

    private void make_choice2() {
        boolean is_string;
        while (true) {
            System.out.println("1. Print to console (input 'console') \n 2. Print to a file (input 'file') \n 3. To exit (input 'exit')");
            is_string = input.hasNext();
            if (is_string) {
                String choice2 = input.next();
                switch(choice2) {
                    case "console":
                        System.out.println("You have chosen the option of printing values to console");
                        print_nums();
                        break;
                    case "file":
                        System.out.println("You have chosen the option of printing values to a file");
                        write_to_file();
                        System.out.println("Writing to the file has been successful");
                        System.exit(0);
                    case "exit":
                        System.out.println(PROGRAM_EXIT);
                        System.exit(0);
                    default:
                        System.out.println(NO_SUCH_CHOICE);
                }
            } else {
                System.out.println(INVALID_INPUT_TYPE);
            }
            input.nextLine();
        }
    }

    private ArrayList<Integer> read_from_file() {
        System.out.println("Reading values from a file");
        System.out.println("Enter file path");
        this.numbers = new ArrayList<>();
        while (true) {
            File file = new File(input.next());
            boolean is_file = file.isFile();
            if (!is_file) {
                System.out.println("The file in the given directory does not exists. Try again");
            } else {
                System.out.println("Found the file");
                try {
                    if (file.canRead()) {
                        System.out.println("I can read the file");
                        Scanner file_reader = new Scanner(file);

                        while (file_reader.hasNextLine()) {
                            try {
                                this.numbers.add(file_reader.nextInt());
                            } catch (InputMismatchException e) {
                                System.out.println("File contains non-integer characters");
                                System.exit(0);
                            }

                        }
                        file_reader.close();
                        return numbers;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            input.nextLine();
        }
    }

    private File write_to_file() {
        System.out.println("Writing values to file");
        System.out.println("Enter file path");
        File file;
        while (true) {
            file = new File(input.next());
            boolean is_file = file.isFile();
            if (!is_file) {
                System.out.println("There is no such file");
            } else {
                if (file.canWrite()) {
                    System.out.println("Can write to the file");
                    try {
                        while (true) {
                            System.out.println("1. Write sorted numbers (input 'sorted') \n 2. Write unsorted numbers (input 'unsorted') \n 3. To exit (input 'exit')");
                            boolean is_string = input.hasNext();
                            if (is_string) {
                                String sort_option = input.next();
                                switch (sort_option) {
                                    case "sorted":
                                        sort_nums();
                                        break;
                                    case "unsorted":
                                        break;
                                    case "exit":
                                        System.out.println(PROGRAM_EXIT);
                                        System.exit(0);
                                    default:
                                        System.out.println("Writing values as is");
                                }
                                break;
                            } else {
                                System.out.println(INVALID_INPUT_TYPE);
                            }
                            input.nextLine();
                        }
                        FileWriter file_writer = new FileWriter(file);
                        for (int i = 0; i < getNumbers().size(); i++) {
                            file_writer.write(Integer.toString(getNumbers().get(i)));
                            System.out.println("Value " + getNumbers().get(i) + " has been added the the output file");
                        }
                        file_writer.close();
                        break;
                    } catch (IOException e) {
                        System.out.println("Error when attempting to write to the file");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Cannot write to the file");
                    break;
                }
            }
            input.nextLine();
        }
        return file;
    }
    private ArrayList<Integer> read_from_console() {
        int values_number;
        System.out.println("Reading values from console");
        System.out.println("How many values do you want to read?");
        input.nextLine();
        while (true) {
            boolean is_valid_values_number = input.hasNextInt();
            if (is_valid_values_number) {
                values_number = input.nextInt();
                break;
            } else {
                System.out.println("Invalid value");
            }
            input.nextLine();
        }

        this.numbers = new ArrayList<>(values_number);
        ArrayList<Integer> number_list = new ArrayList<>(values_number);
        int value_position = 1;
        boolean is_int;
        input.nextLine();
        while (values_number > 0) {
            System.out.printf("Value #" + value_position + " = ");
            is_int = input.hasNextInt();
            if (is_int) {
                int number = input.nextInt();
                number_list.add(Integer.valueOf(number));
                System.out.println("The input of number " + number + " has been successful");
                values_number--;
                value_position++;
            } else {
                System.out.println("Invalid value. Try again");
            }
            input.nextLine();
        }

        values_number = number_list.size();
        if (values_number % 2 == 0) {
            System.out.println("Going to print even numbers");
            for (int i = 0; i < values_number; i++) {
                if (number_list.get(i) % 2 == 0) {
                    this.numbers.add(number_list.get(i));
                }
            }
        } else {
            System.out.println("Going to print odd numbers");
            for (int i = 0; i < values_number; i++) {
                if(number_list.get(i) % 2 != 0) {
                    this.numbers.add(number_list.get(i));
                }
            }
        }

        return this.numbers;
    }
    private ArrayList<Integer> sort_nums() {
        ArrayList<Integer> sorted_values = getNumbers();
        for (int i = 0; i < sorted_values.size(); i++) {
            for (int j = 0; j < sorted_values.size() - 1; j++) {
                if (sorted_values.get(j) >= sorted_values.get(j + 1)) {
                    int tmp = Integer.valueOf(sorted_values.get(j + 1));
                    sorted_values.set(j + 1, sorted_values.get(j));
                    sorted_values.set(j, tmp);
                }
            }
        }
        return sorted_values;
    }

    private void print_unsorted() {
        System.out.println("Numbers = " + getNumbers());
        ArrayList<Integer> unsorted_values = getNumbers();
        System.out.println("File elements = " + unsorted_values.size());
        if (unsorted_values.size() > 0) {
            for (int i = 0; i < unsorted_values.size(); i++) {
                System.out.println("Number " + (i + 1) + " = " + unsorted_values.get(i));
            }
        } else {
            System.out.println(NO_DATA_TO_PRINT);
        }

    }

    private void print_sorted() {
        System.out.println("Numbers = " + getNumbers());
        ArrayList<Integer> sorted_values = sort_nums();
        System.out.println("File elements = " + sorted_values.size());
        if (sorted_values.size() > 0) {
            for (int i = 0; i < sorted_values.size(); i++) {
                System.out.println("Value " + (i + 1) + " = " + sorted_values.get(i));
            }
        } else {
            System.out.println(NO_DATA_TO_PRINT);
        }

    }

    private void print_nums() {
        boolean is_string;
        while (true) {
            System.out.println("1. Print sorted numbers (input 'sorted') \n 2. Print unsorted numbers (input 'unsorted') \n 3. To exit (input 'exit')");
            is_string = input.hasNext();
            if (is_string) {
                String sort_option = input.next();
                switch (sort_option) {
                    case "sorted":
                        System.out.println("Printing sorted numbers");
                        print_sorted();
                        System.exit(0);
                    case "unsorted":
                        System.out.println("Printing unsorted numbers");
                        print_unsorted();
                        System.exit(0);
                    case "exit":
                        System.out.println(PROGRAM_EXIT);
                        System.exit(0);
                    default:
                        System.out.println(NO_SUCH_CHOICE);
                }
            } else {
                System.out.println(INVALID_INPUT_TYPE);
            }
            input.nextLine();
        }
    }
}
