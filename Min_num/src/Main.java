import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = create_num_array(5);
        System.out.println(return_min_int(array));

    }

    public static int[] create_num_array(int array_length) {
        int num;
        int[] num_array = new int[array_length];
        System.out.println("Your number is ");
        boolean is_int = true;

        for (int i = 0; i < array_length; i++) {
            is_int = input.hasNextInt();
            if (is_int) {
                num_array[i] = input.nextInt();
            } else {
                System.out.println("You have aentered a string type. Zero value will be added to the list");;
            }
            input.nextLine();
        }
        return num_array;
    }

    public static int[] sort_array(int[] array) {
        int[] sorted_array = array;
        int tmp;
        for (int i = 0; i < sorted_array.length; i++) {
            for (int j = 0; j < sorted_array.length - 1; j++) {
                if (sorted_array[j] >= sorted_array[j + 1]) {
                    tmp = sorted_array[j + 1];
                    sorted_array[j + 1] = sorted_array[j];
                    sorted_array[j] = tmp;
                }
            }
        }
        return sorted_array;
    }

    public static int return_min_int(int[] array) {
        int min_int = sort_array(array)[0];
        return min_int;
    }
}