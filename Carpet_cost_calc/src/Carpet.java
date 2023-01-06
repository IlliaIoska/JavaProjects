import java.util.Hashtable;

public class Carpet {

    private double length;
    private double width;

    public Carpet(int length, int width) {
        if ((length <= 0) || (width <= 0)) {
            System.out.println("Invalid value");
        } else {
            this.length = length;
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int get_category(double length, double width) {
        double carpet_area = get_rectangular_carpet_area(length, width);
        int category = 0;
        int[] category_array = new int[3];
        Hashtable<String, String> category_record = new Hashtable<String, String>();

        for (int i = 0; i < category_array.length; i++) {
            category_array[i] = i+1;
        }

        if (carpet_area <= 10) {
            System.out.println("The carpet is in category " + category_array[0]);
            category = category_array[0];
            return category;
        } else if (carpet_area <= 20) {
            System.out.println("The carpet is in category " + category_array[1]);
            category = category_array[1];
            return category;
        } else {
            System.out.println("The carpet is in category " + category_array[2]);
            category = category_array[2];
            return category;
        }
    }

    public static double get_rectangular_carpet_area(double length, double width) {
        double area = length * width;
        return area;
    }
}
