public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(-10,false,50);
        printer.check_if_toner_full();
        printer.print_pages();
    }
}