public class Main {

    private static final String TOO_HOT = "Enter a value higher than 25 and less or equal to 45";
    public static void main(String[] args) {

        check_if_cat_playing(true, 45);
    }

    public static void check_if_cat_playing(boolean is_summer, int upper_temp) {

        if (upper_temp <= 25) {
            System.out.println("too cold");
        } else if ((is_summer == true) && (upper_temp > 45)) {
            System.out.println(TOO_HOT);

        } else if ((is_summer == false) && (upper_temp > 35)) {
            System.out.println(TOO_HOT);
        } else {
            System.out.println("cat's playing");
        }
    }
}