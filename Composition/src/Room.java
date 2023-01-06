public class Room {
    private double width;
    private double length;
    private String room_type;

    public Room(double width, double length, String room_type) {
        this.width = width;
        this.length = length;
        this.room_type = room_type;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getRoom_type() {
        return room_type;
    }

    public boolean can_live_living_room() {
        String[] room_types = new String[2];
        room_types[0] = "toilet";
        room_types[1] = "kitchen";

        for (int i = 0; i < room_types.length; i++) {
            if (getRoom_type().toLowerCase().equals(room_types[i].toLowerCase())) {
                System.out.println("Cannot live in " + getRoom_type());
                return false;
            }
        }
        System.out.println("Can live in " + getRoom_type() + " room type");
        return true;
    }
}
