public class House {
    private Room[] room = new Room[0];

    public House(Room[] room) {
        this.room = room;
    }
    public Room[] getRoom() {
        return room;
    }

    public void build_house() {
        for (int i = 0; i < room.length; i++) {
            System.out.println("Room " + (i + 1) + " is going to be " + getRoom()[i].getRoom_type() + " room type.");
        }
    }
}
