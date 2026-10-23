package main.java.week8.assignment_problems.problem1;
class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class QuickWash implements WashType {
    public String getName() { return "Quick"; }
    public int getDuration() { return 30; }
    public double getCharge() { return 20; }
}

class NormalWash implements WashType {
    public String getName() { return "Normal"; }
    public int getDuration() { return 45; }
    public double getCharge() { return 30; }
}

class HeavyWash implements WashType {
    public String getName() { return "Heavy"; }
    public int getDuration() { return 60; }
    public double getCharge() { return 45; }
}

class WashCycle {
    Student student;
    WashType type;

    WashCycle(Student student, WashType type) {
        this.student = student;
        this.type = type;
    }
}

class WashingMachine {
    private String id;
    private WashCycle cycle;

    WashingMachine(String id) {
        this.id = id;
    }

    void startWash(Student student, WashType type) {
        if (cycle != null) {
            System.out.println("Machine " + id + " is currently busy.");
            return;
        }

        cycle = new WashCycle(student, type);
        System.out.printf("%s wash started on %s for %s (%d min). Charge: ₹%.2f.%n",
                type.getName(), id, student.getName(),
                type.getDuration(), type.getCharge());
    }

    void completeCycle() {
        if (cycle == null) return;

        System.out.println(id + " cycle completed.");
        cycle = null;
        System.out.println(id + " is now free.");
    }
}
