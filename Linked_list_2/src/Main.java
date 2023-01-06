import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cities_to_visit = new LinkedList<>();
        add_city_to_cities_to_visit_in_order(cities_to_visit, "London");
        add_city_to_cities_to_visit_in_order(cities_to_visit, "Lisbon");
        add_city_to_cities_to_visit_in_order(cities_to_visit, "Los Angeles");
        add_city_to_cities_to_visit_in_order(cities_to_visit, "Lisbon");
        get_cities_to_visit(cities_to_visit);
        get_adjacent_cities(cities_to_visit, "London");
        move_to_city(cities_to_visit);
    }

    private static void get_cities_to_visit(LinkedList<String> cities_to_visit) {
        ListIterator<String> i = cities_to_visit.listIterator();

        while (i.hasNext()) {
            System.out.println(" city to visit = " + i.next());
        }
    }

    private static void iterate_cities_to_visit(LinkedList<String> cities_to_visit) {
        Iterator<String> i = cities_to_visit.iterator();
        while(i.hasNext()) {
            System.out.println("City = " + i.next());
        }
    }

    private static LinkedList<String> add_city_to_cities_to_visit_in_order(LinkedList<String> cities_to_visit, String city) {
        ListIterator<String> i = cities_to_visit.listIterator();

        while(i.hasNext()) {
            int comparison = i.next().compareTo(city);
            if (comparison == 0) {
                System.out.println("The city " + city + " already exists");
                return cities_to_visit;
            } else if (comparison > 0){
                i.previous();
                i.add(city);
                return cities_to_visit;
            }
        }
        i.add(city);
        return cities_to_visit;
    }

    private static void get_adjacent_cities(LinkedList<String> cities_to_visit, String city_name) {
        ListIterator<String> i = cities_to_visit.listIterator();
        while (i.hasNext()) {
            if (i.next().equals(city_name)) {
                if (i.hasPrevious()) {
                    i.previous();
                    System.out.println("You can go back towards " + i.previous());
                    i.next();
                } else {
                    System.out.println("You can stay at " + city_name);
                }

                if (i.hasNext()) {
                    i.next();
                    System.out.println("You can go forth towards " + i.next());
                }
            }
        }
    }

    public static void move_to_city(LinkedList<String> cities_to_visit) {
        ListIterator<String> i = cities_to_visit.listIterator();
        Scanner input = new Scanner(System.in);
        boolean is_valid_action = true;
        int action;

        while(is_valid_action) {
            is_valid_action = input.hasNextInt();
            action = input.nextInt();
            switch (action) {
                case 0:
                    if (i.hasNext()) {
                        System.out.println("Moving forward to " + i.next());
                    } else {
                        System.out.println("at the end of the list");
                    }
                    break;
                case 1:
                    if (i.hasPrevious()) {
                        System.out.println("Moving backward to " + i.previous());
                    } else {
                        System.out.println("at the end of the list");
                    }
                    break;
            }
            input.nextLine();

        }

    }
}