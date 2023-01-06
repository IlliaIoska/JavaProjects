public class BarkingDog {

    public static boolean wakeUp(boolean isBarking, int hourOfDay) {

        if (hourOfDay <= 0) {
            return false;
        }
        else if ((isBarking && hourOfDay < 8) || (isBarking && hourOfDay > 22)) {
            return true;
        }
        else {
            return false;
        }
    }
}
