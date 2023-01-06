import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        calc_buckets_per_wall(5,5);
    }

    public static int input_int() {

        Scanner input = new Scanner(System.in);
        int num = 0;
        boolean is_int = true;

        while(true) {
            is_int = input.hasNextInt();

            if(is_int) {
                num = input.nextInt();
                return num;
            } else {
                System.out.println("Invalid value");
            }
            input.nextLine();
        }
    }

    public static void calc_buckets_per_wall(int width, int height) {

        int bucket_area_coverage = 5;
        int area = width * height;
        int buckets_home = 0;
        int buckets_needed = 0;

        System.out.println("Enter number of buckets at home ");
        buckets_home = input_int();
        buckets_needed = area / bucket_area_coverage;

        if (buckets_home >= buckets_needed) {
            System.out.println("You have sufficient number of buckets at home");
            System.out.println("You need " + buckets_needed + " buckets");
        } else {
            int buckets_to_buy = buckets_needed - buckets_home;
            System.out.println("You need " + buckets_to_buy + " buckets");
        }
    }
}