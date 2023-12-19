package Inheritance;

// Base class
class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name);
    }
}

// Derived class
class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    public void manageTeam() {
        System.out.println("Manager is managing a team in the " + department + " department.");
    }

    public static void main(String[] args) {
        // Creating an object of the derived class
        Manager manager = new Manager("John Doe", 101, "HR");

        // Accessing methods from the base class
        manager.displayDetails();

        // Accessing methods from the derived class
        manager.manageTeam();
    }

}
