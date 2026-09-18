package main.java.week6.assignment_problems.Problem3;
public class GymMemberLateFee {

    private String memberId;
    private int monthlyFee;

    private int[] lateFeeHistory = new int[10];
    private int lateFeeCount = 0;

    public GymMemberLateFee(String memberId, int monthlyFee) {
        this.memberId = memberId;
        this.monthlyFee = monthlyFee;
    }

    protected void chargeLateFee(int amount) {
        lateFeeHistory[lateFeeCount] = amount;
        lateFeeCount++;
    }

    public int[] getLateFeeHistory() {
        int[] history = new int[lateFeeCount];

        for (int i = 0; i < lateFeeCount; i++) {
            history[i] = lateFeeHistory[i];
        }

        return history;
    }

    public int getTotalLateFees() {
        int total = 0;

        for (int i = 0; i < lateFeeCount; i++) {
            total += lateFeeHistory[i];
        }

        return total;
    }
}