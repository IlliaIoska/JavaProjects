import java.util.ArrayList;

public class Gear_box {
    private ArrayList<Gear> gears;
    private int max_gears;
    private int current_gear = 0;

    public Gear_box(int max_gears) {
        this.max_gears = max_gears;
        this.gears = new ArrayList<>();
        Gear neutral_gear = new Gear(0, 0.0);
        this.gears.add(neutral_gear);
    }

    public ArrayList<Gear> add_gear(int gear_number, double ratio) {
        this.gears.add(new Gear(gear_number, ratio));
        return this.gears;
    }

    private class Gear {
        private int gear_number;
        private double ratio;

        public Gear(int gear_number, double ratio) {
            this.gear_number = gear_number;
            this.ratio = ratio;
        }

        public int getGear_number() {
            return gear_number;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
