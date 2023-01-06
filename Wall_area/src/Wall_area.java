public class Wall_area {

    private int width;
    private int height;

    public Wall_area(int width, int height) {
        if ((height < 0) || (width < 0)) {
            System.out.println("Values of height and width have to be greater or equal to zero");
        } else {
            this.height = height;
            this.width = width;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int get_rectangle_area() {
        int rectangle_area = this.width * this.height;
        return rectangle_area;
    }
}
