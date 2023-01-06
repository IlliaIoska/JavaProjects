public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);

        Cylinder cylnder = new Cylinder(5, 5);
        System.out.println("Cylinder volume = " + cylnder.calc_cylinder_volume());
    }
}