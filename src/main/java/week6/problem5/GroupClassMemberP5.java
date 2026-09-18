package main.java.week6.problem5;
public class GroupClassMemberP5 extends GymMemberP5 {

    private String className;

    public GroupClassMemberP5(int monthlyFee, String className) {
        super(monthlyFee);
        this.className = className;
    }
}