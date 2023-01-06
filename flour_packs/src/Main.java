public class Main {
    public static void main(String[] args) {

        calc_packs(4, 1, 9);
    }

    public static void calc_packs(int big_pack_num, int small_pack_num, int goal) {

        int big_pack_size = 5;
        int small_pack_size = 1;

        if ((small_pack_size * small_pack_num) + (big_pack_size * big_pack_num) < goal) {
            System.out.println("Insufficient number of packs");
        }

        int big_packs_number = big_pack_num;
        int small_packs_number = small_pack_num;
        int total_flour = goal;
        int big_pack_counter = 0;
        int small_pack_counter = 0;

        while (total_flour >= big_pack_size) {
            big_pack_counter = total_flour / big_pack_size;
            total_flour %= big_pack_size;
        }

        while (total_flour >= small_pack_size) {
            small_pack_counter = total_flour / small_pack_size;
            total_flour %= small_pack_size;
        }

        System.out.println(big_pack_counter + " of big packs of flour needed");
        System.out.println(small_pack_counter + " of small packs of flour needed");




    }
}