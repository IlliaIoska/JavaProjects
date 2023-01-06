public class Barking_dog {

    public static boolean should_bark(boolean is_barking, int hour) {

        if ((hour > 23) || (hour <0)) {
            System.out.println("Input an hour greater or equal to zero and less or equal to 23");
            return false;
        } else {
            if (((hour < 8) || (hour > 22)) && is_barking == true) {
                System.out.println("True");
                return true;
            } else {
                System.out.println("False");
                return false;
            }
        }
    }
}
