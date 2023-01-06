public class Main {
    public static void main(String[] args) {

        String a = "Tuesdy";
        switch(a.toLowerCase()) {
            case "sunday": case "monday": case "tuesday": case "wednesday": case "thursday": case "friday": case "saturday":
                System.out.println("It is " + a);
                break;

            default:
                System.out.println("could not find the day");
                break;
        }
    }
}