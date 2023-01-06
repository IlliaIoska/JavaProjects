public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println(calculateArea(5.0));
        System.out.println(calculateArea(-1.0));
        System.out.println(calculateArea(5.0, 4.0));
        System.out.println(calculateArea(-1.0, 4.0));
    }

    public static double calculateArea(double radius) {

        if (radius < 0) {
            return -1.0;
        }
        else {
            double area = Math.PI * radius * radius;
            return area;
        }
    }

    public static double calculateArea(double x, double y) {

        if (x < 0 || y < 0) {
            return -1.0;
        }
        else {
            double area = x * y;
            return area;
        }
    }
}
