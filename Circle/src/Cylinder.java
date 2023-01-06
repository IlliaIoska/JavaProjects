public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double calc_cylinder_volume() {
        double area = calc_circle_area();
        double volume = area * height;
        return volume;
    }
}
