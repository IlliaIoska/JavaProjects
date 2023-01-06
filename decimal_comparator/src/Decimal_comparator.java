public class Decimal_comparator {

    public static void compare(double double1, double double2) {

        int cmp_num1 = (int) (double1 * 1000);
        int cmp_num2 = (int) (double2 * 1000);
        if (cmp_num1 > cmp_num2) {
            System.out.println(double1 + " is greater");
        } else if (cmp_num1 < cmp_num2) {
            System.out.println(double2 + " is greater");
        } else {
            System.out.println(double1 + " and " + double2 + " are equal");
        }
    }
}
