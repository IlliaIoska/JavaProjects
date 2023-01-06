public class Main {
    public static void main(String[] args) {

        String string_var = "Hello \u00A9";
        System.out.println(string_var);

        String num = "5";
        String num2 = "5";
        System.out.println(num+num2);

        int integer = 10;
        String str = "50";
        System.out.println(integer + str);

        double double_var = 120.00;
        System.out.println(double_var+str);

    }
}