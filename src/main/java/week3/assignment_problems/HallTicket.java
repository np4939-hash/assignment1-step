package main.java.week3.assignment_problems;
public class HallTicket {

    String studentName;
    int seatNumber;

    // Constructor
    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }

    public static void main(String[] args) {

        // Create one object
        HallTicket priya = new HallTicket("Priya", 0);

        // copy points to the SAME object
        HallTicket copy = priya;

        // Change through copy
        copy.seatNumber = 45;

        // See the change through first variable
        System.out.println(
            "Priya's seatNumber (via first variable): " + priya.seatNumber
        );

        // Check if both variables refer to same object
        System.out.println("copy == priya: " + (copy == priya));

        // Create a SEPARATE object with same values
        HallTicket separate = new HallTicket("Priya", 45);

        // Check identity
        System.out.println(
            "separate == priya: " + (separate == priya)
        );
    }
}
