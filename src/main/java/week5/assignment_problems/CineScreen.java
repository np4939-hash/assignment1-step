package main.java.week5.assignment_problems;
public class CineScreen {

    private int seatsTotal;
    private int seatsAvailable;

    // Constructor
    public CineScreen(int seatsTotal) {

        if (seatsTotal <= 0) {
            throw new IllegalArgumentException(
                "Seats total must be positive"
            );
        }

        this.seatsTotal = seatsTotal;
        this.seatsAvailable = seatsTotal;
    }

    // Book one seat
    public void bookSeat() {

        if (seatsAvailable > 0) {
            seatsAvailable--;
        }
    }

    // Cancel one booking
    public void cancelBooking() {

        if (seatsAvailable < seatsTotal) {
            seatsAvailable++;
        }
    }

    // Read-only access
    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public static void main(String[] args) {

        CineScreen c = new CineScreen(2);

        c.bookSeat();
        c.bookSeat();
        c.bookSeat();

        System.out.println(
            "Seats available: " + c.getSeatsAvailable()
        );

        c.cancelBooking();
        c.cancelBooking();
        c.cancelBooking();

        System.out.println(
            "Seats available: " + c.getSeatsAvailable()
        );
    }
}
