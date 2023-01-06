public class DurationString {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        System.out.println(getDuration( 100));
        System.out.println(getDuration( 61, 100));
    }

    public static String getDuration(int minutes, int seconds) {

        if (!(minutes >= 0 || seconds >= 0 && seconds <= 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        else {
            int hour = minutes / 60;
            if (minutes % 60 != 0) {
                minutes = minutes % 60;
                return hour + " h " + minutes + " m " + seconds + " s";
            }
            else {
                return hour + " h " + minutes + " m " + seconds + " s";
            }
        }
    }

    public static String getDuration(int seconds) {

        if (!(seconds >= 0)) {
            return INVALID_VALUE_MESSAGE;
        }
        else {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDuration(minutes, seconds);
        }
    }
}
