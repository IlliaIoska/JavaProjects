public class Megabyte_converter {

    public static void print_megabytes_kilobytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Enter a positive valuue of kilobytes");
        } else {
            double kilobytes_in_megabyte = 1024d;
            if (kilobytes >= kilobytes_in_megabyte) {
                double megabytes_in_kilobytes = Math.round(kilobytes / kilobytes_in_megabyte);
                System.out.println("Megabytes = " + megabytes_in_kilobytes);
                double remaining_kilobytes = Math.round(kilobytes % kilobytes_in_megabyte);
                System.out.println("Kilobytes = " + remaining_kilobytes);
            } else {
                System.out.println("Kilobytes = " + kilobytes);
            }
        }
    }
}
