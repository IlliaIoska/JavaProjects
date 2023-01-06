public class Printer {
    private int pages_to_print;
    private boolean is_duplex;
    private int toner_level;

    public Printer(int pages_to_print, boolean is_duplex, int toner_level) {
        if (pages_to_print < 0) {
            System.out.println("no pages to print");
            this.pages_to_print = 0;
        } else {
            this.pages_to_print = pages_to_print;
        }

        this.is_duplex = is_duplex;

        if (toner_level > 100) {
            System.out.println("Toner cannot hold any more tone");
            this.toner_level = 100;
        }
        this.toner_level = toner_level;
    }

    public int getPages_to_print() {
        return pages_to_print;
    }

    public boolean isIs_duplex() {
        return is_duplex;
    }

    public int getToner_level() {
        return toner_level;
    }
    public boolean check_if_toner_full() {
        int current_tonner_level = getToner_level();
        if (current_tonner_level < 100) {
            int remains_to_fill = 100 - current_tonner_level;
            System.out.println(remains_to_fill + " remains to fill till full");
            return false;
        } else {
            return true;
        }
    }

    public void print_pages() {
        int pages_remaining = getPages_to_print();
        double a4_needed = 0;

        if (is_duplex) {
            a4_needed = (double) ((pages_remaining / 2) + (pages_remaining % 2));
            System.out.println(a4_needed + " of A4 paper type needed to print " + pages_remaining + " pages of content");
        } else {
            a4_needed = pages_remaining;
            System.out.println(a4_needed + " of A4 paper type needed to print " + pages_remaining + " pages of content");
        }

        while (pages_remaining > 0) {
            System.out.println("Page is being printed. Pages remaining = " + pages_remaining);
            pages_remaining--;
        }
    }
}
