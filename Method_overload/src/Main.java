public class Main {
    public static void main(String[] args) {
        System.out.println(feet_inches_to_centimeters(6, -10));
        System.out.println(feet_inches_to_centimeters(100));
    }

    public static double feet_inches_to_centimeters(double feet, double inches) {

        double centimiters;

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            return -1;
        } else {
            centimiters = (feet * 12 * 2.54) + (inches * 2.54);
            return centimiters;
        }
    }

    public static double feet_inches_to_centimeters(double inches) {

        if (inches < 0 ) {
            return -1;
        } else {
            double feet = inches / 12;
            double remaining_inches = inches % 12;
            System.out.println(inches + " inches " + " = " + feet + " feet " + " and " + remaining_inches + " inches");
            return feet_inches_to_centimeters(feet, remaining_inches);
        }
    }
}