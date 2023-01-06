public class Vehicle {

    private double speed;
    private String steering_system;

    public Vehicle(double speed, String steering_system) {
        if (speed <= 0) {
            System.out.println("The car cannot move");
        } else {
            this.speed = speed;
        }

        switch (steering_system.toLowerCase()) {
            case "red":
                System.out.println("Steering system does not work. Car cannot move");
                this.steering_system = steering_system;
                break;
            case "green":
                System.out.println("Steering system is working.");
                this.steering_system = steering_system;
                break;
            default:
                System.out.println("Steerng system does not work");
                break;
        }

    }

    public double getSpeed() {
        return speed;
    }

    public String getSteering_system() {
        return steering_system;
    }

    public void move_car() {

    }
}
