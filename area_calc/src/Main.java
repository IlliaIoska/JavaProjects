public class Main {
    public static void main(String[] args) {
        calc_area(-1,4);
    }

    public static void calc_area(double radius) {

        if (radius < 0) {
            System.out.println("Input non-negative value");
        } else {
            double area = Math.PI* Math.pow(radius, 2);
            System.out.println("area " + area);
        }
    }

    public static void calc_area(double x, double y) {

        if ((x < 0) || (y < 0)) {
            System.out.println("nvalid input. Enter non-negative values");
        } else {
            double rect_area = x * y;
            System.out.println("The area of a rectangle is " + rect_area);
        }
    }
}