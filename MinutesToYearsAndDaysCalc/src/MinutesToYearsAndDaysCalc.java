public class MinutesToYearsAndDaysCalc {

    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {

        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
        }
        else {
            long years = minutes / (60 * 24 * 365);
            long remMinutes = minutes % (60 * 24 * 365);
            long days = remMinutes / (60 * 24);
            System.out.println(minutes + " minutes = " + years + " years and " + days + " days");
        }
    }
}
