package main.java.week6.problem5;
public class GymMemberP5 {

    private static int nextMembershipNumber = 2001;
    private static int membersEnrolled = 0;

    private final String membershipNumber;

    private int monthlyFee;
    private int feesPaid = 0;

    public GymMemberP5(int monthlyFee) {
        this.monthlyFee = monthlyFee;

        membershipNumber = "GYM-" + nextMembershipNumber;
        nextMembershipNumber++;

        membersEnrolled++;
    }

    public void payFee(int amount) {
        feesPaid += amount;
    }

    public void payFee(int amount, String mode) {
        System.out.println("Payment Mode: " + mode);
        payFee(amount);
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public static boolean isValidReferralCode(String code) {

        if (code == null || code.length() != 4)
            return false;

        return code.charAt(0) == 'G'
                && Character.isDigit(code.charAt(1))
                && Character.isDigit(code.charAt(2))
                && Character.isUpperCase(code.charAt(3));
    }

    public static int getMembersEnrolled() {
        return membersEnrolled;
    }

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public static String processWeeklyCheckIn(GymMemberP5[] members) {

        int regular = 0;
        int group = 0;

        for (GymMemberP5 member : members) {

            if (member == null)
                continue;

            if (member instanceof GroupClassMemberP5)
                group++;
            else
                regular++;
        }

        return "Regular Check-ins: " + regular
                + " | Group Check-ins: " + group;
    }
}