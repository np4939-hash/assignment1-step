package main.java.week3.assignment_problems;
public class Employee1 {

    // Instance fields
    String empName;
    double salary;

    // Static fields
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    // Constructor
    public Employee1(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    // Static method
    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        Employee1 employee1 = new Employee1("Rahul", 40000);
        Employee1 employee2 = new Employee1("Priya", 45000);
        Employee1 employee3 = new Employee1("Anu", 50000);

        Employee1.printCompanyInfo();
    }
}