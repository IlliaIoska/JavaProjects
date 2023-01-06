public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour <= 0) {
            return -1;
        } else {
            long miles_per_hour = (long) Math.round(kilometersPerHour / 1.609);
            return miles_per_hour;
        }
    }

    public static void print_conversion(double kilometers_per_hour) {

        if (kilometers_per_hour <= 0) {
            System.out.println("Enter value greater than zero");
        } else {
            long miles_per_hour = toMilesPerHour(kilometers_per_hour);
            System.out.println(kilometers_per_hour + " km/h = " + miles_per_hour);
        }


    }
}
