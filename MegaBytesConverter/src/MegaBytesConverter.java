public class MegaBytesConverter {

    static int kiloInMega = 1024;

    public static long kiloBytesToMega(int kilo) {

        if (kilo < 0) {
            return -1;
        } else {
            long convertedKilo = kilo / kiloInMega;
            return convertedKilo;
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {


        if (kiloBytes < 0) {
            System.out.println("Invalid Input");
        } else {
            long rem = kiloBytes % kiloInMega;
            System.out.printf(kiloBytes + " KB = " + kiloBytesToMega(kiloBytes) + " MB and " + rem + " KB");
        }
    }
}
