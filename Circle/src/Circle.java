public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }

    }

    public double getRadius() {

        return radius;
    }

    public double calc_circle_area() {
        double radius = getRadius();
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
