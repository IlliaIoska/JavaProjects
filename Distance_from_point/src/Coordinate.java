public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double get_distance(Coordinate coordinate1, Coordinate coordinate2) {
        double distance = Math.pow(Math.abs(coordinate1.x - coordinate2.x), 2) + Math.pow(Math.abs(coordinate1.y - coordinate2.y), 2);
        distance = Math.sqrt(distance);
        return distance;
    }
}
