public class Main {
    public static void main(String[] args) {

        Wall_area wall_area = new Wall_area(-1, -2);

        int area = wall_area.get_rectangle_area();
        System.out.println(area);
    }
}