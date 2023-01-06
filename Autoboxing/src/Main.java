import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        show_double_list_elements(create_double_list(5));
    }

    public static ArrayList<Double> create_double_list(int array_size) {
        ArrayList<Double> double_list = new ArrayList<>();

        for(int i = 0; i < array_size; i++){
            Double double_value = Double.valueOf(i);
            double_list.add(double_value);
        }

        return  double_list;
    }

    public static void show_double_list_elements(ArrayList<Double> double_list) {
        for (int i = 0; i < double_list.size(); i++) {
            System.out.println("Element value = " + double_list.get(i).doubleValue());
        }
    }
}