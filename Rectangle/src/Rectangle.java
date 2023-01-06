public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calc_rectangle_area() {
        double width = getWidth();
        double length = getLength();
        double area = width * length;
        return area;
    }
}
