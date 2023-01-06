public class Complex_number {
            private double real_part;
            private double imaginary_part;

            public Complex_number(double real_part, double imaginary_part) {
                this.real_part = real_part;
                this.imaginary_part = imaginary_part;
            }

            public double getReal_part() {
                return real_part;
            }

            public double getImaginary_part() {
                return imaginary_part;
            }

            public Complex_number complex_number_addition(Complex_number complex_number1, Complex_number complex_number2) {
                double complex_number1_real_part = complex_number1.getReal_part();
                double complex_number2_real_part = complex_number2.getReal_part();
                double complex_number1_imaginary_part = complex_number1.getImaginary_part();
                double complex_number2_imaginary_part = complex_number2.getImaginary_part();
                double complex_number_addition_product_real_part = (complex_number1_real_part + complex_number2_real_part);
                double complex_number_addition_product_imaginary_part = (complex_number1_imaginary_part + complex_number2_imaginary_part);
                Complex_number complex_number_addition_product = new Complex_number(complex_number_addition_product_real_part, complex_number_addition_product_imaginary_part);

                System.out.println(complex_number1 + " + " + complex_number2 + " = " + complex_number_addition_product_real_part + " + " + complex_number_addition_product_imaginary_part + "i");
                return complex_number_addition_product;
            }

            public Complex_number complex_number_multiplication(Complex_number complex_number1, Complex_number complex_number2) {
                double complex_number1_real_part = complex_number1.getReal_part();
                double complex_number2_real_part = complex_number2.getReal_part();
                double complex_number1_imaginary_part = complex_number1.getImaginary_part();
                double complex_number2_imaginary_part = complex_number2.getImaginary_part();
                double complex_number_multiplication_product_real_part = (complex_number1_real_part * complex_number2_real_part) + (complex_number1_imaginary_part * complex_number2_imaginary_part * (-1));
                double complex_number_multiplication_product_imaginary_part = (complex_number1_imaginary_part * complex_number2_real_part) + (complex_number1_real_part * complex_number2_imaginary_part);
                Complex_number complex_number_multiplication_product = new Complex_number(complex_number_multiplication_product_real_part, complex_number_multiplication_product_imaginary_part);

                System.out.println(complex_number1 + " + " + complex_number2 + " = " + complex_number_multiplication_product_real_part + " + " + complex_number_multiplication_product_imaginary_part + "i");
                return complex_number_multiplication_product;
            }
}
