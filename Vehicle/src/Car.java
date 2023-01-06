public class Car extends Vehicle {

    private String model;

    public Car(double speed, String steering_system, String model) {
        super(speed, steering_system);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void move_car() {
        String car_model = getModel();
        double car_speed = getSpeed();
        String steering_system_state = getSteering_system();

        if (steering_system_state.equals("green")) {
            System.out.println("car cannot start without the steering system");
        } else {
            System.out.println("car " + car_model + " is driving at a speed " + car_speed);
        }
    }

}
