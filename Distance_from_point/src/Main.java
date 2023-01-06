public class Main {
    public static void main(String[] args) {

        Coordinate coordinate1 = new Coordinate(1,2);
        Coordinate coordinate2 = new Coordinate(5,9);

        double distance = coordinate1.get_distance(coordinate1,coordinate2);
        System.out.println(distance);
    }
}