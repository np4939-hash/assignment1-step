package main.java.week6.assignment_problems.Problem3;
public class PremiumMemberLateFee extends GymMemberLateFee {

    private String trainerName;
    public String getTrainerName() {
    return trainerName;
}

    public PremiumMemberLateFee(
        String memberId,
        int monthlyFee,
        String trainerName
    ) {
        super(memberId, monthlyFee);
        this.trainerName = trainerName;
    }

    @Override
    protected void chargeLateFee(int amount) {
        super.chargeLateFee(amount / 2);
    }

    public static void main(String[] args) {

        PremiumMemberLateFee p =
            new PremiumMemberLateFee("MEM5", 2000, "Coach Riya");

        p.chargeLateFee(200);

        System.out.println(p.getTotalLateFees());

        int[] history = p.getLateFeeHistory();
        history[0] = 999;

        System.out.println(p.getLateFeeHistory()[0]);
    }
}