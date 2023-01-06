public class Leap_year {

    public static boolean is_leap(int year) {

        if (year < 1 || year > 9999) {
            System.out.println("invalid Value");
            return false;
        } else {
            if ((year % 4 == 0 ) && (year % 100 == 0) && (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
                return true;
            } else {
                System.out.println(year + " is not a leap year.");
                return false;
            }
        }
    }
}
