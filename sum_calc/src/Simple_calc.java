public class Simple_calc {

    private double num1;
    private double num2;

    public void set_nums(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double get_num1() {
        return this.num1;
    }

    public double get_num2() {
        return this.num2;
    }

    public double get_addition_result() {
        double sum = this.num1 + this.get_num2();
        return sum;
    }

    public double get_subtraction_result() {
        if(this.num1 >= this.num2) {
            return this.num1 - this.num2;
        } else {
            return this.num2 - this.num1;
        }

    }

    public double get_multiplication_result() {
        double result = this.num1 * this.num2;
        return result;
    }

    public double get_division_result() {
        if (this.num1 >= this.num2) {
            double result = this.num1 / this.num2;
            return result;
        } else {
            double result = this.num2 / this.num1;
            return result;
        }
    }
}
