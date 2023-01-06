public class Complex_calc {

    private Complex_number complex_number1;
    private Complex_number complex_number2;

    public Complex_calc(Complex_number complex_number1, Complex_number complex_number2) {
        this.complex_number1 = complex_number1;
        this.complex_number2 = complex_number2;
    }

    public Complex_number getComplex_number1() {
        return complex_number1;
    }

    public Complex_number getComplex_number2() {
        return complex_number2;
    }
    public Complex_number complex_number_addition() {
        double complex_number_addition_product_real_part = (getComplex_number1().getReal_part() +  getComplex_number2().getReal_part());
        double complex_number_addition_product_imaginary_part = (getComplex_number1().getImaginary_part() + getComplex_number2().getImaginary_part());
        Complex_number complex_number_addition_product = new Complex_number(complex_number_addition_product_real_part, complex_number_addition_product_imaginary_part);

        System.out.println(complex_number1 + " + " + complex_number2 + " = " + complex_number_addition_product_real_part + " + " + complex_number_addition_product_imaginary_part + "i");
        return complex_number_addition_product;
    }

    public Complex_number complex_number_multiplication() {
        double complex_number_multiplication_product_real_part = (getComplex_number1().getReal_part() * getComplex_number2().getReal_part()) + (getComplex_number2().getImaginary_part() * getComplex_number2().getImaginary_part() * (-1));
        double complex_number_multiplication_product_imaginary_part = (getComplex_number1().getImaginary_part() * getComplex_number2().getReal_part()) + (getComplex_number1().getReal_part() * getComplex_number2().getImaginary_part());
        Complex_number complex_number_multiplication_product = new Complex_number(complex_number_multiplication_product_real_part, complex_number_multiplication_product_imaginary_part);

        System.out.println(complex_number1 + " + " + complex_number2 + " = " + complex_number_multiplication_product_real_part + " + " + complex_number_multiplication_product_imaginary_part + "i");
        return complex_number_multiplication_product;
    }
}
