import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        print_array(sort_array_desc(fill_array(10)));
    }

    public static int[] fill_array(int array_length) {
        int[] num_array = new int[array_length];

        for (int i = 0; i < array_length; i++) {
            System.out.println((i+1) + " ekenent of the array = ");
            num_array[i] = input.nextInt();
        }
        return num_array;
    }

    public static void print_array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " element of the array of numbers = " + array[i]);
        }
    }

    public static int[] sort_array(int[] array) {
        int[] sorted_num_array = array;
        int tmp;
        for (int i = 0; i < sorted_num_array.length; i++) {
            for (int j = 0; j < sorted_num_array.length - 1; j++) {
                if (sorted_num_array[j] >= sorted_num_array[j + 1]) {
                    tmp = sorted_num_array[j + 1];
                    sorted_num_array[j + 1] = sorted_num_array[j];
                    sorted_num_array[j] = tmp;
                }
            }
        }
        return sorted_num_array;
    }

    public static int[] sort_array_desc(int[] array) {
        int[] sorted_num_array_desc = array;
        int tmp;
        for (int i = 0; i < sorted_num_array_desc.length; i++) {
            for (int j = 0; j < sorted_num_array_desc.length - 1; j++) {
                if (sorted_num_array_desc[j] <= sorted_num_array_desc[j + 1]) {
                    tmp = sorted_num_array_desc[j + 1];
                    sorted_num_array_desc[j + 1] = sorted_num_array_desc[j];
                    sorted_num_array_desc[j] = tmp;
                }
            }
        }
        return sorted_num_array_desc;
    }
}