public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double calc_cuboid_volume() {
        double area = calc_rectangle_area();
        double cuboid_volume = area * height;
        return cuboid_volume;
    }
}
