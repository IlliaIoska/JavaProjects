public class Main {
    public static void main(String[] args) {

        Simple_calc calc = new Simple_calc();

        calc.set_nums(1,2);

        System.out.println("addition result = " + calc.get_addition_result());
        System.out.println("Subtraction result = " + calc.get_subtraction_result());
        System.out.println("Division result = " + calc.get_division_result());
        System.out.println("Multiplication result = " + calc.get_multiplication_result());
    }
}