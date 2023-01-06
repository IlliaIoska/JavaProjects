public class Main {

    private static final String INVALID_VALUE = "Enter non-negative value";

    public static void main(String[] args) {
        check_equality(-3,-2,-4);
    }

    public static void check_equality(int num1, int num2, int num3) {

        if ((num1 == num2) && (num2 == num3)) {
            System.out.println("nums are equal");
        } else if ((num1 != num2) && (num2 != num3) && (num3 != num1)) {
            System.out.println("all nums are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}