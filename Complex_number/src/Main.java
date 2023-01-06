public class Main {
    public static void main(String[] args) {

        Complex_number complex_number1 = new Complex_number(1,2);
        Complex_number complex_number2 = new Complex_number(2,1);
        Complex_calc complex_calc = new Complex_calc(complex_number1, complex_number2);
        Complex_number complex_numbers_addition_result = complex_calc.complex_number_addition();
        Complex_number complex_numbers_multiplication_product = complex_calc.complex_number_multiplication();

    }

}