package main.java.week5.assignment_problems;

public class PremiumMovieTicket extends MovieTicket {

    public void checkAccess() {

        System.out.println(
            AccessChecker.classifyAccess(
                "protected",
                "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"
            )
        );

        System.out.println(
            AccessChecker.classifyAccess(
                "protected",
                "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"
            )
        );
    }

    public static void main(String[] args) {

        PremiumMovieTicket ticket = new PremiumMovieTicket();

        ticket.checkAccess();
    }
}


class MovieTicket {

    private int seatNumber;
    protected String ticketPrice;
    double movieTitle;
    public String screenId;
}


class AccessChecker {

    static String classifyAccess(
            String fieldModifier,
            String accessorContext) {

        if (fieldModifier.equals("protected")) {

            if (accessorContext.equals(
                    "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE")) {

                return "ALLOWED";

            } else if (accessorContext.equals(
                    "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE")) {

                return "DENIED";
            }
        }

        if (fieldModifier.equals("private")
                || fieldModifier.equals("default")) {
            return "DENIED";
        }

        return "ALLOWED";
    }
}