public class Main {
    public static void main(String[] args) {

        num_in_words(0);
        num_in_words(1);
        num_in_words(2);
        num_in_words(3);

    }

    public static void num_in_words(int num) {

        switch(num) {
            case 0:
                System.out.println("ZERO");
                break;

            case 1:
                System.out.println("ONE");
                break;

            case 3:
                System.out.println("THREE");
                break;

            default:
                System.out.println("OTHER");
                break;
        }
    }
}