public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(15, 15, "Living room");
        Room room2 = new Room(12,16, "Kitchen");
        Room[] rooms = new Room[]{room1, room2};

        House house = new House(rooms);
        house.build_house();
    }
}