public class Main {
    public static void main(String[] args) {
        Car porsche = new Porsche(false, 4, 100);
        System.out.println(porsche.getCurrent_speed());
        System.out.println(porsche.getCylinders());

        Car jeep = new Jeep(true, "Kamo", 100);
        System.out.println(jeep.getCurrent_speed());
        System.out.println(jeep.getWheels());
    }
}

class Car {
    private boolean engine;
    private String cylinders;
    private int wheels;
    private int current_speed;

    public Car(boolean engine, String cylinders, int wheels, int current_speed) {
        if (engine) {
            System.out.println("Engine has been started");
            this.current_speed = current_speed;
        } else {
            System.out.println("Engine has not been started");
            this.current_speed = 0;
        }
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCurrent_speed() {
        return current_speed;
    }

}

class Porsche extends Car {
    public Porsche(boolean engine, int wheels, int current_speed) {
        super(engine, "SLR", wheels, current_speed);
    }
}

class Jeep extends Car {
    public Jeep(boolean engine, String cylinders, int current_speed) {
        super(engine, cylinders, 6, current_speed);
    }
}