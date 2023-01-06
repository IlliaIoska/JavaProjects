public class Main {
    public static void main(String[] args) {

        draw_diagonal(7);
    }

    public static void draw_diagonal(int length) {

        if (length <= 0) {
            System.out.println("Enter positive value");
        }

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j < i; j++) {
                System.out.printf(" ");
            }
            System.out.println("x");
        }
    }
}