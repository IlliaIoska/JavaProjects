public class isLeapYear {

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
