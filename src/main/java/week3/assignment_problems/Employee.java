package main.java.week3.assignment_problems;
public class Employee {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    // Constructor for permanent employee
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    // Constructor for intern
    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    // Print profile
    public void printProfile() {
        System.out.println(
            "empId: " + empId +
            ", empName: " + empName +
            ", salary: " + salary +
            ", isIntern: " + isIntern
        );
    }

    public static void main(String[] args) {

        Employee permanent = new Employee(
            "E101", "Rahul", 50000
        );

        Employee intern = new Employee(
            "E102", "Anu"
        );

        permanent.printProfile();
        intern.printProfile();
    }
}