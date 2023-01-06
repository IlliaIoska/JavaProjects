public class EqualityPrinter {

    public static void main(String[] args) {

        printEqual(1, 3, 1);
    }

    public static void printEqual(int p1, int p2, int p3) {

        if (p1 < 0 || p2 < 0 || p3 < 0) {
            System.out.println("Invalid input");
        }
        else {
            if (p1 == p2 && p1 == p3) {
                System.out.println("All the numbers are equal");
            }
            else {
                System.out.println("Neither All of the numbers are equal or different");
            }
        }
    }
}
