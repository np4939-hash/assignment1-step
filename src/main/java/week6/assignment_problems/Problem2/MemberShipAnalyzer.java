package main.java.week6.assignment_problems.Problem2;
public class MembershipAnalyzer {

    static String classifyGeneration(GymMember member) {

        if (member instanceof EliteMember) {
            return "Multilevel descendant (3 generations deep)";
        }
        else if (member instanceof GroupClassMember) {
            return "Hierarchical sibling (independent branch)";
        }
        else {
            return "Standard or Premium Member";
        }
    }

    static int getTotalSessionsAttended(GymMember[] members) {

        int total = 0;

        for (GymMember member : members) {
            total = total + member.getSessionsAttended();
        }

        return total;
    }
}