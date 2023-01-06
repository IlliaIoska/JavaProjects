import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Theatre {
    private final String theatre_name;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatre_name, int rows_number, int seats_number) {
        this.theatre_name = theatre_name;

        int last_row = 'A' + (rows_number - 1);
        for(char row = 'A'; row <= last_row; row++) {
            for(int seat_number = 1; seat_number <= seats_number; seat_number++) {
                Seat seat = new Seat(row + String.format("%02d", seat_number));
                this.seats.add(seat);
            }
        }
    }

    public String getTheatre_name() {
        return theatre_name;
    }

    public void getSeats() {
        for(Seat seat: seats) {
            System.out.println("Seat number = " + seat.getSeat_number());
        }
    }

    public boolean is_reserved(String seat_number) {

        for(Seat seat : this.seats) {
            if((seat.getSeat_number().equals(seat_number)) && seat.is_reserved) {
                System.out.println("The seat is reserved. Seat number = " + seat_number);
                return true;
            } else {
                System.out.println("Do you wish to reserve the seat?");
                Scanner input = new Scanner(System.in);
                if(input.hasNextInt()) {
                    int option = input.nextInt();
                    switch(option) {
                        case 1:
                            System.out.println("Making a reservation");
                            seat.reserve(seat_number);
                            break;
                        case 2:
                            System.out.println("Exiting the system");
                            System.exit(0);
                            break;
                    }
                } else {
                    System.out.println("Not an integer");
                }
                return true;
            }
        }
        return false;
    }

    public class Seat {
        private boolean is_reserved;
        private String seat_number;

        public Seat(String seat_number) {
            this.seat_number = seat_number;
        }

        public boolean reserve(String seat_number) {
            this.is_reserved = true;
            System.out.println("the seat with the number " + seat_number + " has been reserved");
            return this.is_reserved;
        }

        public String getSeat_number() {
            return seat_number;
        }
    }
}
