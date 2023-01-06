public class Main {
    public static void main(String[] args) {
        hours_mins_secs( 65, 9);

    }

    public static void hours_mins_secs(int minutes, int seconds) {

        if ((minutes < 0) || (seconds < 0)) {
            System.out.println("Invalid input. Enter non-negative values");
        } else {
            int hours = minutes / 60 + seconds / 3600;
            int mins = minutes % 60 + seconds/60;
            int remaining_seconds = seconds % 60;
            System.out.println(hours + "h " + mins + "m " + remaining_seconds + "s.");
        }
    }

    public static void hours_mins_secs(int seconds) {

        if (seconds < 0) {
            System.out.println("Enter non-negative value");
        } else {
            int minutes = seconds / 60;
            int remaining_seconds = seconds % 60;
            hours_mins_secs(minutes, remaining_seconds);
        }
    }
}