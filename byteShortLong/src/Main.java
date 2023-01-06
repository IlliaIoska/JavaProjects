public class Main {
    public static void main(String[] args) {

        int max_int = Integer.MAX_VALUE;
        int min_int = Integer.MIN_VALUE;
        System.out.println("MAx int is " + max_int + "\n" + "Min int is " + min_int);

        short max_short = Byte.MAX_VALUE;

        short value = (short) (max_short/max_int);

        byte byte_value = 10;
        int int_value = 20;
        short short_value = 50;
        long sum= (long) (byte_value+short_value+int_value);
        long total = (long) (50000 + 10*sum);

        System.out.println(total);

    }
}