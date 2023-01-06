import java.util.ArrayList;

public class City {
    private String city_name;

    private City next_city;

    ArrayList<City> cities = new ArrayList<>();

    public City() {
    }

    private City create_city() {
        return new City();
    }

    public City(String city_name) {
        this.city_name = city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public void setNext_city() {
        this.next_city = new City();
    }

    public String getCity_name() {
        return city_name;
    }

    public City getNext_city() {
        return next_city;
    }

    public ArrayList<City> add_city(String city_name) {
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getCity_name().equals(city_name)) {
                System.out.println("City already exists");
            } else {
                City new_city = new City();
                new_city.setCity_name(city_name);
                new_city.n
                cities.add(new_city);


            }
        }
        return city_list;
    }
}
